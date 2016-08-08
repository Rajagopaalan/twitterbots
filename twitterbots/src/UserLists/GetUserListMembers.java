package UserLists;

import twitter4j.PagableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class GetUserListMembers {

	public GetUserListMembers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            long cursor = -1;
	            PagableResponseList<User> usres;
	            do {
	                usres = twitter.getUserListMembers(1, cursor);
	                for (User list : usres) {
	                    System.out.println("@" + list.getScreenName());
	                }
	            } while ((cursor = usres.getNextCursor()) != 0);
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get list members: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
