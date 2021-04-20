import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen implements ActionListener{
	
	JFrame jf;
	JPanel panel;
	JLabel label,displayLabel;
	JButton sevenbtn,eightbtn,ninebtn,fourbtn,fivebtn,sixbtn,onebtn,twobtn,threebtn,zerobtn;
	JButton clearbtn,endbtn;
	public Screen() {
		
		//panel=new JPanel();
		//panel.setBounds(100,40, 800, 100);
		
		
		//HEADER
		label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setText("ENTER PIN");
		label.setFont(new Font("Font. BOLD",Font.PLAIN,40));
		label.setBounds(0,0,1000,100);
		label.setOpaque(true);
		
		
		//PIN DISPLAY
		displayLabel=new JLabel();
		displayLabel.setBounds(50, 100,260,50);
		displayLabel.setBackground(Color.white);
		displayLabel.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		displayLabel.setOpaque(true);
		
		//BUTTONS
		sevenbtn=new JButton("7");
		sevenbtn.setBounds(50, 200, 60, 50);
		sevenbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		eightbtn=new JButton("8");
		eightbtn.setBounds(150, 200, 60, 50);
		eightbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		ninebtn=new JButton("9");
		ninebtn.setBounds(250, 200, 60, 50);
		ninebtn.setFont(new Font("Arial", Font.PLAIN, 40));
		
		fourbtn=new JButton("4");
		fourbtn.setBounds(50, 280, 60, 50);
		fourbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		fivebtn=new JButton("5");
		fivebtn.setBounds(150, 280, 60, 50);
		fivebtn.setFont(new Font("Arial", Font.PLAIN, 40));
		sixbtn=new JButton("6");
		sixbtn.setBounds(250, 280, 60, 50);
		sixbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		
		onebtn=new JButton("1");
		onebtn.setBounds(50, 360, 60, 50);
		onebtn.setFont(new Font("Arial", Font.PLAIN, 40));
		twobtn=new JButton("2");
		twobtn.setBounds(150, 360, 60, 50);
		twobtn.setFont(new Font("Arial", Font.PLAIN, 40));
		threebtn=new JButton("3");
		threebtn.setBounds(250, 360, 60, 50);
		threebtn.setFont(new Font("Arial", Font.PLAIN, 40));
		
		zerobtn=new JButton("0");
		zerobtn.setBounds(150, 440, 60, 50);
		zerobtn.setFont(new Font("Arial", Font.PLAIN, 40));
		
		clearbtn=new JButton("Clear");
		clearbtn.setBounds(440, 200, 190, 50);
		clearbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		clearbtn.setBackground(Color.green);
		endbtn=new JButton("End");
		endbtn.setBounds(440, 280, 190, 50);
		endbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		endbtn.setBackground(Color.RED);
		
		
		jf=new JFrame("ATM");
		jf.setSize(1000,800);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.add(label);
		jf.add(displayLabel);
		jf.add(sevenbtn);
		jf.add(eightbtn);
		jf.add(ninebtn);
		jf.add(fourbtn);
		jf.add(fivebtn);
		jf.add(sixbtn);
		jf.add(onebtn);
		jf.add(twobtn);
		jf.add(threebtn);	
		jf.add(zerobtn);
		
		jf.add(clearbtn);
		jf.add(endbtn);
		
	}
		

	public static void main(String[] args) {
		
		new Screen();
	}


	
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
