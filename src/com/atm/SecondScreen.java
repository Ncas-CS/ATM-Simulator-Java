import javax.swing.JFrame;

public class SecondScreen extends JFrame{
	
	JFrame js;
	
	SecondScreen(){
		js=new JFrame("ATM");
		js.setSize(1000,1000);
		js.setVisible(true);
		js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SecondScreen();
	}

}
