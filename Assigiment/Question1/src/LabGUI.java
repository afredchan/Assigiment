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

public class LabGUI extends JFrame implements ActionListener {
	
	  private JTextField jtfWeight			= new JTextField(10);
	  private JTextField jtfHeight   		= new JTextField(10);
	  private JTextField jtfCofficient   	= new JTextField(20);
	  private JTextField jtfResult   		= new JTextField(20);
	  private JButton jbCompute  			= new JButton("Compute");


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LabGUI frame = new LabGUI( );
	    frame.pack();
	    frame.setTitle("Fat Coefficient");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	}
	
	public LabGUI( ) {
	    // Panel p1 to hold labels and text fields
	    JPanel p1 = new JPanel( );
	    p1.setLayout(new GridLayout(4, 2));
	    p1.add(new JLabel("Weight (kg)"));
	    p1.add(jtfWeight);											
	    p1.add(new JLabel("Height (m)"));
	    p1.add(jtfHeight);											
	    p1.add(new JLabel("Coefficient, good if 15 to 25"));
	    p1.add(jtfCofficient);										
	    jtfCofficient.setEditable(false);
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
	    		
	    		String str1 = jtfWeight.getText();	
	    		Double num =Double.parseDouble(str1);
	    		
	    		String str2 = jtfHeight.getText();	
	    		Double num2 =Double.parseDouble(str2);	
	    		
	    		double FC = num / (num2 * num2);
	    		
	    		String str3 = Double.toString(FC);
	    		
	    		jtfCofficient.setText(str3);
	    			
	    		
	    		if(FC >25){
	    			
	    			jtfResult.setText("Too Fat, need to keep fit!");
	    			
	    		}if(FC<15){
	    			jtfResult.setText("Too Thin, need to keep fat!");
	    			
	    		}else{
	    			jtfResult.setText("Just fit, keep on!");

	    		} 			

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
