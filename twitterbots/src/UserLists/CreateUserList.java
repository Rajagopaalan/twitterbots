package UserLists;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UserList;

public class CreateUserList {

	public CreateUserList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            String description = null;
	            if (args.length >= 2) {
	                description = args[1];
	            }
	           
	            UserList list = twitter.createUserList("newlist", true, description);
	            System.out.println("Successfully created a list (id:" + list.getId() + ", slug:" + list.getSlug() + ").");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to create a list: " + te.getMessage());
	            System.exit(-1);
	        }

	}

}
