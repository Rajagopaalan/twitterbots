package twitterbots;

import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class GetDirectMesages {

	public GetDirectMesages() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Twitter twitter = new TwitterFactory().getInstance();
	        try {
	            Paging paging = new Paging(1);
	            List<DirectMessage> messages;
	            do {
	                messages = twitter.getDirectMessages(paging);
	                for (DirectMessage message : messages) {
	                    System.out.println("From: @" + message.getSenderScreenName() + " id:" + message.getId() + " - "
	                            + message.getText());
	                }
	                paging.setPage(paging.getPage() + 1);
	            } while (messages.size() > 0 && paging.getPage() < 10);
	            System.out.println("done.");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get messages: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
