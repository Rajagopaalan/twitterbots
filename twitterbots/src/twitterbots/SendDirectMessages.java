package twitterbots;

import twitter4j.DirectMessage;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class SendDirectMessages {

	public SendDirectMessages() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*  if (args.length < 2) {
	            System.out.println("Usage: java twitter4j.examples.directmessage.SendDirectMessage [recipient screen name] [message]");
	            System.exit(-1);
	        }*/
	        Twitter twitter = new TwitterFactory().getInstance();
	        try {
               long id = 103498183;
	            DirectMessage message = twitter.sendDirectMessage(id, "hi,this is just a bot,ignore it");
	            System.out.println("Direct message successfully sent to " + message.getRecipientScreenName());
	            System.exit(0);
	        } catch (TwitterException te) {
	        //    te.printStackTrace();
	            System.out.println("Failed to send a direct message: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
