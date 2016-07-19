package twitterbots;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class searchTweets {

	public searchTweets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TwitterException {
		// TODO Auto-generated method stub
		
		
		Twitter twitter = TwitterFactory.getSingleton();

        //create a new search
        Query query = new Query("\"New Twitterbot\"");

        //get the results from that search
        QueryResult result = twitter.search(query);

        //iterate over every search result
        for(Status tweet : result.getTweets()){
            //print out the tweet
            System.out.println(tweet.getUser().getScreenName() + ":" + tweet.getText());
        }}
}
