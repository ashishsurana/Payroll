import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class temp {

	public static void main(String[] args){
		JFrame frame=new JFrame();
		
		frame.setSize(400,500);
		
		JLabel uidlabel=new JLabel("Admin username :");
		JTextField uidtf = new JTextField();
		uidtf.setSize(50, 25);
		String uidinput = uidtf.getText();
		frame.add(uidtf);
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
		
		String uid="user";
		String password;
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		String query;

		String url = "jdbc:mysql://localhost:3306/payrolltest";
	    String user = "test3";
	    String passwd = "pwd";
		//Database Connection Block
		try{
			con=DriverManager.getConnection(url, user, passwd);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from login ");
			if(rs.next()){
				uid=rs.getString(1);
				password=rs.getString(2);
				System.out.println(password);
				
			}
			else{
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
			
		}
		catch(SQLException e2){
			System.err.println(e2.getMessage());
		}
	}
	



}
