import javax.tools.DocumentationTool.Location;

import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Trends {

	public Trends() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Twitter twitter = new TwitterFactory().getInstance();
	            ResponseList<twitter4j.Location> locations;
	            locations = twitter.getAvailableTrends();
	            System.out.println("Showing available trends");
	            
	            for (twitter4j.Location location : locations) {
	                System.out.println(location.getName() + " (woeid:" + location.getWoeid() + ")");
	            }
	            System.out.println("done.");
	            System.exit(0);
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get trends: " + te.getMessage());
	            System.exit(-1);
	        }
	}

}
