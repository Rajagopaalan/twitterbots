package UserLists;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class CreateUserListMember {

	public CreateUserListMember() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try {
            Twitter twitter = new TwitterFactory().getInstance();
            twitter.createUserListMember(1, 76);
            System.out.println("Successfully added the user to the specified list.");
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to add users: " + te.getMessage());
            System.exit(-1);
        }

	}

}
