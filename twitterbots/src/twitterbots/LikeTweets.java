package twitterbots;

import java.util.Iterator;

import twitter4j.IDs;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class LikeTweets {

	public LikeTweets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TwitterException {
		//Add tweets to favourites
	Twitter twitter = TwitterFactory.getSingleton();
	
    Query query = new Query("\"ashwin 7 wickets \"");

    //get the results from that search
    QueryResult result = twitter.search(query);

    //iterate over every search result
    for(Status tweet : result.getTweets()){
        
    	 twitter.createFavorite(tweet.getId());
    }
	}
}