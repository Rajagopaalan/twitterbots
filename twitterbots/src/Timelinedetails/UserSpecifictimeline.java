package Timelinedetails;

import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class UserSpecifictimeline {

	public UserSpecifictimeline() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Twitter twitter = new TwitterFactory().getInstance();
	        try {
	            List<twitter4j.Status> statuses;
	            String user;
	            if (args.length == 1) {
	                user = args[0];
	                statuses = twitter.getUserTimeline(user);
	            } else {
	                user = twitter.verifyCredentials().getScreenName();
	                statuses = twitter.getUserTimeline();
	            }
	            System.out.println("Showing @" + user + "'s user timeline.");
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
