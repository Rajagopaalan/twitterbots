package Timelinedetails;

import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class retreiveMentions {

	public retreiveMentions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Twitter twitter = new TwitterFactory().getInstance();
	        try {
	            User user = twitter.verifyCredentials();
	            List<twitter4j.Status> statuses = twitter.getMentionsTimeline();
	            System.out.println("Showing @" + user.getScreenName() + "'s mentions.");
	            for (twitter4j.Status status : statuses) {
	                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
	            }
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get timeline: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
