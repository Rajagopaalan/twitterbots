package UserLists;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class CreateUserListSubscription {

	public CreateUserListSubscription() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            twitter.createUserListSubscription(1);
	            System.out.println("Successfully subscribed the list.");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to subscribe the list: " + te.getMessage());
	            System.exit(-1);
	        }

	}

}
