package Messages;

import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class RetreiveSentdirectmessages {

	public RetreiveSentdirectmessages() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            Paging page = new Paging(1);
	            List<DirectMessage> directMessages;
	            do {
	                directMessages = twitter.getSentDirectMessages(page);
	                for (DirectMessage message : directMessages) {
	                    System.out.println("To: @" + message.getRecipientScreenName() + " id:" + message.getId() + " - "
	                            + message.getText());
	                }
	                page.setPage(page.getPage() + 1);
	            } while (directMessages.size() > 0 && page.getPage() < 10);
	            System.out.println("done.");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get sent messages: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
