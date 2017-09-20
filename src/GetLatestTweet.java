
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JTextField field = new JTextField(15);
	JTextPane pane = new JTextPane();
	public static void main(String[] args) {
new GetLatestTweet();
}
public GetLatestTweet() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel1 = new JPanel ();
	JPanel panel2 = new JPanel();
	frame.add(panel1);
	frame.add(panel2);
	panel1.add(field);
	JButton button = new JButton("Search the Twitterverse");
	panel1.add(button);
	pane.setPreferredSize(new Dimension (350,350));
	pane.setEditable(false);
	panel2.add(pane);
	frame.add(panel1, BorderLayout.CENTER);
	frame.add(panel2, BorderLayout.SOUTH);
	panel1.setBackground(Color.magenta);
	panel2.setBackground(Color.magenta);
	frame.pack(); 

	button.addActionListener(this);
}

private String getLatestTweet(String searchingFor) {

	Twitter twitter = new TwitterFactory().getInstance();
	AccessToken accessToken = new AccessToken(
			"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
			"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
			"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	try {
		QueryResult result = twitter.search(query);
		return result.getTweets().get(0).getText();
	} catch (Exception e) {
		System.err.print(e.getMessage());
		return "What the heck is that?";
	}


}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String t = getLatestTweet(field.getText());
pane.setText(t);
}
}
