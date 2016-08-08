package UserSuggestions;

import twitter4j.Category;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class GetCategories {

	public GetCategories() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            System.out.println("Showing suggested user categories.");
	            ResponseList<Category> categories = twitter.getSuggestedUserCategories();
	            for (Category category : categories) {
	                System.out.println(category.getName() + ":" + category.getSlug());
	            }
	            System.out.println("done.");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get suggested categories: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
