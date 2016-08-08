package twitterbots;
import java.util.ArrayList;


import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class Automaticallyfollow {

	public Automaticallyfollow() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) throws TwitterException {
		
		
//Automatically follow people with specific tweet
       
		
		Twitter twitter = TwitterFactory.getSingleton();

        //create a new search
        Query query = new Query("\"New Twitterbot\"");

        //get the results from that search
        QueryResult result = twitter.search(query);

        //iterate over every search result
        for(Status tweet : result.getTweets()){
            //print out the tweet
         System.out.println(tweet.getUser().getScreenName() + ":" + tweet.getText());
        	
        	  twitter.createFriendship(tweet.getUser().getScreenName()); 
        }
        
      
        
	}
}
