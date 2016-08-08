package Favourites;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class GetFavourites {

	public GetFavourites() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            List<Status> statuses = twitter.getFavorites();
	            for (Status status : statuses) {
	                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
	            }
	            System.out.println("done.");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get favorites: " + te.getMessage());
	            System.exit(-1);
	        }

	}

}
