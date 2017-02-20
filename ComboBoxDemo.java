import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo {
	private JFrame mainFrame;	// Window  (application)  to add components  to
	private JLabel headerLabel;	// Top part (row) of window
	private JLabel statusLabel;	// Middle  part of window
	private JPanel controlPanel;	// Bottom  part (row) of window
	
	public ComboBoxDemo(){
			prepareGUI();	// call prepareGUI() metho
	}
	
	public  static  void  main(String[] args){
		// run application
		ComboBoxDemo comboboxdemo = new ComboBoxDemo();       
		comboboxdemo.showComboboxDemo();
	}
	
	private  void  prepareGUI(){
		mainFrame  = new JFrame("JComboBox  Example"); // give  application  a title
		mainFrame.setSize(400,400);	// give  application  a size
		mainFrame.setLayout(new  GridLayout(3,  1));// application  has 3 rows + 1 column
		
		// make  application  receive  window  events 
		mainFrame.addWindowListener(new  WindowAdapter()  {
			public  void  windowClosing(WindowEvent  windowEvent){
				System.exit(0);
			}        
		});
		
		headerLabel  = new JLabel("",  JLabel.CENTER); // set up top row of application
		statusLabel  = new JLabel("",  JLabel.CENTER); // set up bottom  row of application
		statusLabel.setSize(350,100);	//give  bottom  row a size
		controlPanel  = new JPanel();	// set up middle  row of application
		controlPanel.setLayout(new  FlowLayout());	// make  middle  row flow  from left  to right
		mainFrame.add(headerLabel);	// add top row to application
		mainFrame.add(controlPanel);	// add middle  row to application 
		mainFrame.add(statusLabel);	// add bottom  row to application
		mainFrame.setVisible(true);   // display  the 3 rows
		
	}
	
	private void showComboboxDemo(){                                     
		headerLabel.setText("JComboBox  Demo"); // print ‘JCombList Demo’ in top row of application
		final DefaultComboBoxModel  countryList = new DefaultComboBoxModel();	// create list object
		countryList.addElement("Scotland");	// add “Scotland” to drop-down  list
		countryList.addElement("England");	// add “England” to drop-down  list
		countryList.addElement("Wales");   // add “Wales” to drop-down list
		final JComboBox  countryCombo  = new JComboBox(countryList);   // add list to JComboBox  object   
		countryCombo.setSelectedIndex(0);	// show 1stelement of list
		JScrollPane countryListScrollPane  = new JScrollPane(countryCombo);     // create scrollable  view  of list
		JButton showButton  = new JButton("Show");// create button and label it “Show”
		showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent  e) { 
					String data = "";
					if (countryCombo.getSelectedIndex()  != -1) {                     
						data = "Country Selected:  " + countryCombo.getItemAt(countryCombo.getSelectedIndex());              
					}              
					statusLabel.setText(data);
			}
		}); 
		controlPanel.add(countryListScrollPane);           // add drop-down list to middle row
		controlPanel.add(showButton); // add button to middle row
		mainFrame.setVisible(true); // display the 3 rows        
	}
}
