import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AddLeaves {
		static String uidip;
		static int leaveip;
	public static void frameleave(){
		
		
		
		

		final JFrame frame = new JFrame();
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Enter the No. Of Working Days",JLabel.CENTER);
		
		JLabel uidlabel=new JLabel("Enter the UID :");
		final JTextField uidtf = new JTextField();
		
		JLabel leaves=new JLabel("No. of Working Days");
		final JTextField leavestf = new JTextField();
		
		JButton insert = new JButton("Insert");		
		
		
		JButton quit = new JButton("Quit");
		JLabel test=new JLabel(" ");
		
		insert.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	String temp;
		    	temp=leavestf.getText();
		    	if(temp.equals(""))
		    	{
		    		JOptionPane.showMessageDialog(null, "Invalid Details");
		    		leavestf.setText("");
		    	}
		    	Connection con;
		    	PreparedStatement ps;
		    	String query="update employee set leaves = ? where uid = '"+uidtf.getText()+"' ";// + uidtf.getText();
		    	
		    	String url="jdbc:mysql://localhost:3306/payrolltest";
		    	String username="test3";
		    	String password="pwd";
		    	
		    	try{
		    		con=DriverManager.getConnection(url,username,password);
		    		ps=con.prepareStatement(query);
		    		ps.setInt(1,Integer.parseInt(leavestf.getText()));
		    		if(Integer.parseInt(leavestf.getText())>= 30)
			    		   
			    	   {
			    		   JOptionPane.showMessageDialog(null,"Improper Values");
			    	    }
			    	   else{
			    		   ps.executeUpdate();
			    		   JOptionPane.showMessageDialog(null,"Record Updated Successfully");
			    	   }}
		    	catch(SQLException e2){
		    		e2.printStackTrace();
		    		JOptionPane.showMessageDialog(null, "Err");
		    	}
		    	

		    }
		});

		quit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		       frame.dispose();
		    }
		});
		
		
		headlabel.setBounds(50,40,300,25);
		headlabel2.setLocation(50,70);
		headlabel2.setSize(300,25);
		insert.setLocation(100, 250);
		insert.setSize(200,25);
		uidlabel.setBounds(50, 150, 150, 25);
		uidtf.setBounds(210, 150, 150, 25);
		leaves.setBounds(50, 180, 150, 25);
		leavestf.setBounds(210, 180, 150, 25);
		test.setBounds(50, 150, 50, 25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(insert);
		frame.add(quit);
		frame.add(uidlabel);
		frame.add(uidtf);
		frame.add(leaves);
		frame.add(leavestf);
		frame.add(test);
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
		
		
		
		
		
	}
	public static void main(String[] args) {
		frameleave();

	}

}
