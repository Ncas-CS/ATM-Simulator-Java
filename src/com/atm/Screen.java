

	import java.awt.*;

   import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	    
	   public class Screen implements ActionListener{
		   
		   JFrame jf;
		   JPanel firstpanel,panel1,panel2,btnpanel,panel3,enterpanel;
		   JLabel head,display;
		   JButton x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12;
		   JButton a1,a2,a3;
		   String pinNumber;
		   
		   JPanel secondpanel,secondpanel1,secondpanel2,secondpanelbtn;
		   JButton b1,b2,b3,b4;
		   JLabel secondpaneltextlabel,secondpaneltextlabel2 ;
		   
		   public Screen() {
			   
			 	jf = new JFrame("A T M");
			 	 
			 	//FIRST SCREEN
			 	
			   	firstpanel =new JPanel();
			    firstpanel.setLayout(new BorderLayout());	
			   	 
			    //HEADING,DISPLAY
			    
			    panel1 = new JPanel();
			     
			    panel1.setLayout( new BorderLayout() );
			    panel1.setBackground(Color.white);
			    panel1.setBounds(0,0,400,150);
			    	 
			  	head=new JLabel();
			    head.setText("ENTER PIN");
			    head.setBounds(50, 100,260,50);
			 	head.setBackground(Color.gray);
			 	head.setFont(new Font("Arial", Font.BOLD, 30));
			 	

			   	display=new JLabel();
			   	display.setText("****");
				display.setBackground(Color.white);
				display.setFont(new Font("Arial", Font.BOLD, 40));
				display.setBorder(BorderFactory.createLineBorder(Color.black, 5));
				 
				panel1.add(head, "North");
			   	panel1.add(display, "Center");
			   	firstpanel.add( panel1, "North"); 
			   	
			   	//NUMBER BUTTONS
			    
			   	panel2 = new JPanel();
			  	panel2.setLayout( new BorderLayout() );
			  	 
			   	btnpanel = new JPanel();
			   	btnpanel.setLayout( new GridLayout(4, 3) );
			   	
			   	x1  = new JButton("7");
			   	x1.setFont(new Font("Arial", Font.BOLD, 40));
			   	x1.setBackground(Color.black);
			   	x1.setForeground(Color.white);
			   	
			    x2  = new JButton("8");
			  	x2.setFont(new Font("Arial", Font.BOLD, 40));
			  	x2.setBackground(Color.black);
			   	x2.setForeground(Color.white);
			  
			  	 
			  	x3  = new JButton("9");
			  	x3.setFont(new Font("Arial", Font.BOLD, 40));
			  	x3.setBackground(Color.black);
			   	x3.setForeground(Color.white);
			  
			  	 
			  	x4  = new JButton("4");
			  	x4.setFont(new Font("Arial", Font.BOLD, 40));
			  	x4.setBackground(Color.black);
			   	x4.setForeground(Color.white);
			   	
				x5  = new JButton("5");
			  	x5.setFont(new Font("Arial", Font.BOLD, 40));
			  	x5.setBackground(Color.black);
			   	x5.setForeground(Color.white);
			  
			  	 
			  	x6  = new JButton("6");
			  	x6.setFont(new Font("Arial", Font.BOLD, 40));
			  	x6.setBackground(Color.black);
			   	x6.setForeground(Color.white);
			  
			  	 
			  	x7  = new JButton("1");
			  	x7.setFont(new Font("Arial", Font.BOLD, 40));
			  	x7.setBackground(Color.black);
			   	x7.setForeground(Color.white);
			  
			  	 
			  	x8  = new JButton("2");
			  	x8.setFont(new Font("Arial", Font.BOLD, 40));
			  	x8.setBackground(Color.black);
			   	x8.setForeground(Color.white);
			   	
			    
			  	x9  = new JButton("3");
			  	x9.setFont(new Font("Arial", Font.BOLD, 40));
			  	x9.setBackground(Color.black);
			   	x9.setForeground(Color.white);
			  
			  	 
			  	x10 = new JButton("");
			  	x10.setBackground(Color.white);
			  	
			  	x11 = new JButton("0");
			  	x11.setFont(new Font("Arial", Font.BOLD, 40));
			  	x11.setBackground(Color.black);
			   	x11.setForeground(Color.white);
			  
			  	 
			  	x12 = new JButton("");
			  	x12.setBackground(Color.white);
			  	
				btnpanel.add(x1);
			  	btnpanel.add(x2);
			  	btnpanel.add(x3);
			  	btnpanel.add(x4);
			  	btnpanel.add(x5);
			  	btnpanel.add(x6);
			  	btnpanel.add(x7);
			  	btnpanel.add(x8);
			  	btnpanel.add(x9);
			  	btnpanel.add(x10);
			  	btnpanel.add(x11);
			  	btnpanel.add(x12);
			  	
				panel2.add(btnpanel); 
			  	firstpanel.add(panel2, "Center"); 
			  	
			  	//ENTER, CLEAR, EXIT BUTTONS
			  	
			  	panel3 = new JPanel();
				panel3.setLayout( new BorderLayout() );
				
			  	enterpanel = new JPanel();
			   	enterpanel.setLayout( new GridLayout(4, 1) );
			   	 
			   	a1  = new JButton("ENTER");
			   	a1.setBackground(Color.blue);
			   	a1.setForeground(Color.white);
			   	a1.setFont(new Font("Arial", Font.BOLD, 30));
			   	a1.addActionListener(this);
			   	
				
			 	a2  = new JButton("CLEAR");
			 	a2.setBackground(Color.green);
			   	a2.setForeground(Color.white);
			   	a2.setFont(new Font("Arial", Font.BOLD, 30));
			 	
			 	a3  = new JButton("EXIT");
			 	a3.setBackground(Color.red);
			   	a3.setForeground(Color.white);
			   	a3.setFont(new Font("Arial", Font.BOLD, 30));

			   	enterpanel.add(a1);
			   	enterpanel.add(a2);
			   	enterpanel.add(a3);
			   	
			   	enterpanel.setBackground(Color.white);
			    
			    panel3.add(enterpanel); 
			    firstpanel.add(panel3, "East"); 
			  	
			 	jf.getContentPane().add(firstpanel, "Center");
			    
			   	 jf.setSize(400, 500);
			   	 jf.setVisible(true);
			     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  
			  //SECOND SCREEN
			  
			   	secondpanel =new JPanel();
			   	secondpanel.setLayout(new BorderLayout());
			   	
			   	
			   	secondpanel1=new JPanel();
			   	secondpanel1.setLayout(new BorderLayout());
			   	secondpanel1.setBackground(Color.black);
			   	
			   	//HEADING
			   	secondpaneltextlabel =new JLabel("  Click Choise");
			   	secondpaneltextlabel.setBackground(Color.black);
			 	secondpaneltextlabel.setFont(new Font("Arial", Font.BOLD, 30));
			 	secondpaneltextlabel.setForeground(Color.white);
			 	
			   	secondpanel1.add(secondpaneltextlabel,"North");
			   
				 //WITHDRAWAL,BALENCE BUTTONS
			   	secondpanel2=new JPanel();
			   	secondpanel2.setLayout(new BorderLayout());
			   	
			   	
			   	secondpanelbtn = new JPanel();
			   	secondpanelbtn.setLayout( new GridLayout(4, 1) );
			   	secondpanelbtn.setBackground(Color.black);
			   	 
			   	b1  = new JButton("WITHDRAWAL");
			   	b1.setBackground(Color.blue);
			   	b1.setForeground(Color.white);
			   	b1.setFont(new Font("Arial", Font.BOLD, 12));
			   	b1.addActionListener(this);
			   	
				
			 	b2  = new JButton("BALENCE INQUARY");
			 	b2.setBackground(Color.green);
			   	b2.setForeground(Color.white);
			   	b2.setFont(new Font("Arial", Font.BOLD, 12));
			   	

			 	b3  = new JButton("");
			 	b3.setBackground(Color.black);
			 	b4  = new JButton("");
			 	b4.setBackground(Color.black);
			
			   	secondpanelbtn.add(b1);
			   	secondpanelbtn.add(b2);
			   	
			   	secondpanel2.add(secondpanelbtn);
			   	
				secondpanel.add(secondpanel1, "Center");
			   	secondpanel.add(secondpanel2, "East");
			   	
			   	jf.getContentPane().add(secondpanel,"Center");
			 	
			
		}
		   
	      public static void main(String[] args){
	    	  
	  
	    	  new Screen();
	     
	      }

		
		public void actionPerformed(ActionEvent e) {
			

			if(e.getSource()==a1) {
				pinNumber=display.getText();
				
				if(pinNumber.equals("****")) {
					 jf.remove(firstpanel);
					 jf.add(secondpanel);
		             jf.revalidate(); 
		             jf.repaint();
				}
			}
		}
	   }


