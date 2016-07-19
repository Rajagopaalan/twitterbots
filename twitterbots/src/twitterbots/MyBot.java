package twitterbots;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class MyBot {

	public MyBot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TwitterException {
		// TODO Auto-generated method stub
		  Twitter twitter = TwitterFactory.getSingleton();
//To test Twitter4j
	        //send a tweet
	        Status status = twitter.updateStatus("hello world");

	        //print a message so we know when it finishes
	        System.out.println("Done.");
	}

}
