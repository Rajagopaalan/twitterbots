package UserSuggestions;

import twitter4j.Category;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class GetSuggestions {

	public GetSuggestions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            ResponseList<Category> categories = twitter.getSuggestedUserCategories() ;
                     
	            ResponseList<User> users = twitter.getMemberSuggestions(categories.get(1).getName());
	            for (User user : users) {
	                if (user.getStatus() != null) {
	                    System.out.println("@" + user.getScreenName() + " - " + user.getStatus().getText());
	                } else {
	                    // the user is protected
	                    System.out.println("@" + user.getScreenName());
	                }
	            }
	            System.out.println("done.");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get suggested users: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
