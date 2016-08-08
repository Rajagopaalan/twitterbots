package twitterbots;

import java.util.Iterator;

import twitter4j.IDs;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.api.FriendsFollowersResources;
public class FollowFriendsFollwers {

	public FollowFriendsFollwers() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) throws TwitterException{
		Twitter twitter = TwitterFactory.getSingleton();
		  System.out.println(twitter.getScreenName());
		//  twitter.getFollowersIDs();
    long  cursor=-1;
   
    User u1 = null ;
    
      IDs ids;
      System.out.println("Listing followers's ids.");
      do {
              ids = twitter.getFollowersIDs(cursor);
          for (long id : ids.getIDs()) {
              System.out.println(id);
              User user = twitter.showUser(id);
            //  System.out.println(user.getName());
              if(!user.isFollowRequestSent()){
            	
            	 IDs idss = twitter.getFollowersIDs(id);
            	
                  for (long ides : idss.getIDs()) {
                     
                      User useri = twitter.showUser(ides);
                      System.out.println(useri.getName());
                    //  if(!useri.isFollowRequestSent()){
                     // twitter.createFriendship(ides); }
            	
              
              }
          }}
      } while ((cursor = ids.getNextCursor()) != 0);

        
      
	}

}
