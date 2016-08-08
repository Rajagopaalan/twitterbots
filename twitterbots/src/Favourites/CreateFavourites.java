package Favourites;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class CreateFavourites {

	public CreateFavourites() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TwitterException {
		// TODO Auto-generated method stub
		Twitter twitter = TwitterFactory.getSingleton();
		
	    Query query = new Query("\"Ind vs WI \"");

	    //get the results from that search
	    QueryResult result = twitter.search(query);

	    //iterate over every search result
	    for(Status tweet : result.getTweets()){
	        
	    	 twitter.createFavorite(tweet.getId());
	    	 System.out.println(tweet.getId()+"added to favourites");
	    }
	}

}
