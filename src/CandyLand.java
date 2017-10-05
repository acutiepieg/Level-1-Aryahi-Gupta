import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CandyLand implements ActionListener {

	int num = 0;
	public static void main(String[] args) {
		new CandyLand();
	}
	
	public CandyLand() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton candy = new JButton("candyLand");
		frame.add(candy);
		frame.pack();
		candy.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		num ++;
		System.out.println(num);
		if(num == 5) {
		showPictureFromTheInternet("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjyqqXBkNjWAhXDRCYKHXbCCFMQjRwIBw&url=https%3A%2F%2Fwww.polyvore.com%2Fcandy_land_jolly_photo_2237565%2Fthing%3Fid%3D5844322%26tab%3Dcollections&psig=AOvVaw1pcLLeOXNYoAXwn_QCqFIq&ust=1507246368223679");
		}
		}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
