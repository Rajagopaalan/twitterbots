package twitterbots;
import twitter4j.IDs;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class followfollowers {

	public followfollowers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TwitterException {
		// TODO Auto-generated method stub
		
		
		
		Twitter twitter = new TwitterFactory().getInstance();
        User u1 = null ;
          long cursor = -1;
          IDs ids;
          System.out.println("Listing followers's ids.");
          do {
                  ids = twitter.getFollowersIDs(cursor);
              for (long id : ids.getIDs()) {
                  System.out.println(id);
                  try{
                  User user = twitter.showUser(id);
                  System.out.println(user.getName());
                 
                 if(!user.isFollowRequestSent()){
                 twitter.createFriendship(id); }
              }  catch(TwitterException te){}}
            
          } while ((cursor = ids.getNextCursor()) != 0);

    }

	
}

