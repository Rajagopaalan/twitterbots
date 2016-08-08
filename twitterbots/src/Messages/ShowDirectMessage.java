package Messages;

import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class ShowDirectMessage {

	public ShowDirectMessage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Twitter twitter = new TwitterFactory().getInstance();
	        try {
	            DirectMessage message = twitter.showDirectMessage(1);
	            System.out.println("From: @" + message.getSenderScreenName() + " id:" + message.getId() + " - "
	                    + message.getText());
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get message: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
