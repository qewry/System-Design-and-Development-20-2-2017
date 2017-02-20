import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public  class RadioButtonDemo {

	private JFrame mainFrame;	// Window  (application)  to add components  to
	private JLabel headerLabel;	// Top part (row) of window
	private JPanel controlPanel; // Middle  part of window
	private JLabel statusLabel; // Bottom  part (row) of window
	
	public RadioButtonDemo() {
		prepareGUI(); // call prepareGUI()  method
	}
	
	public  static  void  main(String[] args){
		// run application
		RadioButtonDemo radiobuttondemo = new RadioButtonDemo();       
		radiobuttondemo.showRadioButtonDemo();
	}
	
	private  void  prepareGUI(){
		
		mainFrame  = new JFrame("Java  RadioButton  Example");  // give  application  a title
		mainFrame.setSize(400,400); // give  application  a size
		mainFrame.setLayout(new  GridLayout(3,  1)); // application  has 3 rows + 1 columns
		
		// make application  receive  window  events 
		mainFrame.addWindowListener(new  WindowAdapter()  {
		
			public  void  windowClosing(WindowEvent  windowEvent){
				System.exit(0);
			}        
		
		});    
		headerLabel  = new JLabel("",  JLabel.CENTER); // set up top row of application
		statusLabel  = new JLabel("",JLabel.CENTER); // set up bottom  row of application
		statusLabel.setSize(350,100); // give  bottom  row a size
		controlPanel  = new JPanel(); // set up middle  row of application
		controlPanel.setLayout(new  FlowLayout());  // make middle  row flow  from  left  to right
		mainFrame.add(headerLabel);  // add top row to application
		mainFrame.add(controlPanel);  // add middle  row to application 
		mainFrame.add(statusLabel);  // add bottom  row to application
		mainFrame.setVisible(true);  // display  the 3 rows
		
	}
	
	private  void showRadioButtonDemo(){
		headerLabel.setText("RadioButton  Example"); // print ‘RadioButton Demo’ in top row of application
		final JRadioButton radScotland = new JRadioButton("Scotland", true);     // Create a Radio Button  labelled ‘Scotland’ and  check it
		final  JRadioButton  radEngland  = new JRadioButton("England"); // Create a Radio Button  labelled ‘England’ 
		final  JRadioButton  radWales  = new  JRadioButton("Wales"); // Create a Radio Button  labelled ‘Wales’ 		
		
		//edw ta vazoume se group outws wste na mhn 8etetai h timh sta alla an parei timh to ena
		ButtonGroup groupbtn = new ButtonGroup();
		groupbtn.add(radScotland);
		groupbtn.add(radEngland);
		groupbtn.add(radWales);
		
		// if Scotland radio button checked print ‘Scotland RadioButton checked’; if it is then unchecked print ‘Scotland RadioButton  unchecked’
		radScotland.addItemListener(new  ItemListener()  {
			public  void  itemStateChanged(ItemEvent  e) {         
				statusLabel.setText("Scotland  RadioButton:  " + (e.getStateChange()==1?"checked":"unchecked"));
			}           
		});
		
		// if England radio button checked print ‘England RadioButton checked’; if it is then unchecked print ‘England RadioButton unchecked’
		radEngland.addItemListener(new  ItemListener()  {
		public  void  itemStateChanged(ItemEvent  e) {             
		statusLabel.setText("England  RadioButton:  " + (e.getStateChange()==1?"checked":"unchecked")); 
		}           
		});
		
		// if Wales radio button checked print ‘Wales RadioButton checked’; if it is then unchecked print ‘Wales RadioButton  unchecked’
		radWales.addItemListener(new  ItemListener()  {
			public  void  itemStateChanged(ItemEvent  e) {             
				statusLabel.setText("Wales  RadioButton:  "  + (e.getStateChange()==1?"checked":"unchecked"));
			}           
		});
		
		controlPanel.add(radScotland);  // add ‘Scotland’ radio button to middle row
		controlPanel.add(radEngland); // add ‘England’ radio button to middle row
		controlPanel.add(radWales); // add ‘Wales’ radio button to middle row
		mainFrame.setVisible(true);  // display  the 3 rows 
		}
		}
	
