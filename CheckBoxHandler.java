import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxHandler {
	
	private JFrame mainFrame;		// Window  (application)  to add components  to
	private JLabel headerLabel;		// Top part (row) of window
	private JPanel controlPanel;	// Middle  part (row) of window
	private JLabel statusLabel;		// Bottom  part (row) of window
	public CheckBoxHandler(){
		prepareGUI();
	}
// call prepareGUI()  method

	public  static  void  main(String[] args) {
		// run application
		CheckBoxHandler checkboxdemo= new CheckBoxHandler();       
		checkboxdemo.showCheckBoxDemo();
	}
	
	private  void  prepareGUI(){
		mainFrame  = new JFrame("Java  CheckBox  Example");		// give  application  a title
		mainFrame.setSize(400,400);								// give  application  a size
		mainFrame.setLayout(new  GridLayout(3,  1));			// application  has 3 rows + 1 columns
		
		// make  application  receive  window  events 
		mainFrame.addWindowListener(new  WindowAdapter()  {
			public  void  windowClosing(WindowEvent  windowEvent){
				System.exit(0);
			}        
		});    

									// ta quotes einai to text pou emfanizetai to header label orizetai to text tou sth showCheckBoxDemo()
		headerLabel  = new JLabel("",JLabel.RIGHT);		// set up top row of application 
		statusLabel  = new JLabel("",JLabel.CENTER);		// set up bottom  row of application
		statusLabel.setSize(350,100);
		headerLabel.setSize(600,200);
		// give  bottom  row a size
		controlPanel  = new JPanel();						// set up middle  row of application
		controlPanel.setLayout(new  FlowLayout());			// make  middle  row flow  from  left  to right
		mainFrame.add(headerLabel);							// add top row to application
		mainFrame.add(controlPanel);						// add middle  row to application 
		mainFrame.add(statusLabel); 						// add bottom  row to application
		mainFrame.setVisible(true); 						// display  the 3 rows 
		
	}
	
	private  void  showCheckBoxDemo(){
		//headerLabel.setText("CheckBox  Demo"); // print ‘CheckBox Demo’ in top row of application
		final  JCheckBox chkScotland  = new  JCheckBox("Scotland");// Create a Check Box labelled ‘Scotland’
		final  JCheckBox chkEngland  = new  JCheckBox("England");// Create a Check Box labelled ‘England’
		final  JCheckBox chkWales  = new JCheckBox("Wales"); // Create a Check Box labelled ‘Wales’
		// if Scotland check box ticked then print ‘Scotland Checkbox checked’; if it is then unticked then print ‘Scotland Checkbox unchecked’
		chkScotland.addItemListener(new  ItemListener()  {
			public  void  itemStateChanged(ItemEvent  e) {         
					statusLabel.setText("Scotland  Checkbox:  "  + (e.getStateChange()==1?"checked":"unchecked"));
			}           
		});
		// if England check box ticked then print ‘England Checkbox checked’; if it is then unticked then print ‘England Checkbox unchecked’
		chkEngland.addItemListener(new  ItemListener()  {
			public  void  itemStateChanged(ItemEvent  e) {             
					statusLabel.setText("England  Checkbox:  " + (e.getStateChange()==1?"checked":"unchecked")); 
			}           
		});
		// if Wales check box ticked then print ‘Wales Checkbox checked’; if it is then unticked then print ‘Wales Checkbox unchecked’
		chkWales.addItemListener(new  ItemListener()  {
			public  void  itemStateChanged(ItemEvent  e) {             
					statusLabel.setText("Wales  Checkbox:  "  + (e.getStateChange()==1?"checked":"unchecked"));
			}           
		});
		controlPanel.add(chkScotland);	// add ‘Scotland’ check box to middle row
		controlPanel.add(chkEngland); 	// add ‘England’ check box to middle row
		controlPanel.add(chkWales); 	// add ‘Wales’ check box to middle row
		mainFrame.setVisible(true);		// display  the 3 rows 
		
	}
}
