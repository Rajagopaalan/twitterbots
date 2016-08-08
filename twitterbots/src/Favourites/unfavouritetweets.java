package Favourites;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class unfavouritetweets {

	public unfavouritetweets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Twitter twitter = new TwitterFactory().getInstance();
            twitter.destroyFavorite(1);
            System.out.println("Successfully unfavorited status  ].");
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to unfavorite status: " + te.getMessage());
            System.exit(-1);
        }
	}

}
