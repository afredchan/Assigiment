import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LDL extends JFrame implements ActionListener {
	
	  private JTextField totalCholesterol  			= new JTextField(20);
	  private JTextField HDLCholesterol     		= new JTextField(20);
	  private JTextField triglyceride    	= new JTextField(10);
	  private JTextField jtfResult   		= new JTextField(10);
	  private JButton jbCompute  			= new JButton("Compute");


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LDL frame = new LDL( );
	    frame.pack();
	    frame.setTitle("Fat Coefficient");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
	public LDL( ) {
	    // Panel p1 to hold labels and text fields
	    JPanel p1 = new JPanel( );
	    p1.setLayout(new GridLayout(4, 2));
	    p1.add(new JLabel("Total Cholesterol (TC)"));
	    p1.add(totalCholesterol);											
	    p1.add(new JLabel("HDL cholesterol (HDLC)"));
	    p1.add(HDLCholesterol);											
	    p1.add(new JLabel("Ctriglyceride (TG) "));
	    p1.add(triglyceride);										
	    p1.add(new JLabel("Result"));								
	    p1.add(jtfResult);
	    jtfResult.setEditable(false);	
	    
	    this.getContentPane().setLayout(new BorderLayout());
	    this.getContentPane().add(p1,BorderLayout.CENTER);	
	    this.getContentPane().add(jbCompute,BorderLayout.SOUTH);

	    // Register listener
	    jbCompute.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {	
	    if (e.getSource() == jbCompute) {	

	    	try{
	    		
	    		String str1 = totalCholesterol.getText();	
	    		Double num =Double.parseDouble(str1);
	    		
	    		String str2 = HDLCholesterol.getText();	
	    		Double num2 =Double.parseDouble(str2);		
	    		
	    		String str3 = triglyceride.getText();	
	    		Double num3 =Double.parseDouble(str3);
	    		
	    		double LDLCC = num - num2 - num3/5;
	    		
	    		String str4 = Double.toString(LDLCC);
	    		
	    		jtfResult.setText(str4);
	    				 
	    	}catch(NumberFormatException ex){
	    		jtfResult.setText("Input Number Format Error !");
	    		
	    		JOptionPane.showMessageDialog(null, "Input Number Format Error !");
	    		
	    	}catch(Exception ex){
	    		
	    		JOptionPane.showMessageDialog(null, "Input Error!");
	    		//above
	    	}
	    	
		} // end of if
	  } // end of ActionPerformed
	} // end Quiz2Q1
