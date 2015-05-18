import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AdminLogIn {
	public static String uidinput;
	public static String passwordinput;
	public static void loginframe(){
		
	

		
		//Frame Block
		final JFrame frame = new JFrame();
		
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Welcome Admin to Admin Panel",JLabel.CENTER);
		
		JLabel uidlabel=new JLabel("Admin username :");
		final JTextField uidtf = new JTextField();
		uidinput=uidtf.getText();

		JLabel passwordlabel=new JLabel("Admin Password :");
		final JPasswordField passwordtf = new JPasswordField();
		
		
		JButton loginbutton = new JButton("Log In ");		
		
		
		JButton quit = new JButton("Quit");
		JLabel test=new JLabel(" ");

		loginbutton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	Connection con;
				Statement stmt;
				ResultSet rs;
				String query="select * from login ";

				String url = "jdbc:mysql://localhost:3306/payrolltest";
			    String user = "test3";
			    String passwd = "pwd";
			    
			    
				//Database Connection Block
				try{
					con=DriverManager.getConnection(url, user, passwd);
					stmt=con.createStatement();
					rs=stmt.executeQuery(query);
					if(rs.next()){
//						uidinput=rs.getString(1);
//						passwordinput=rs.getString(2);
//						JOptionPane.showMessageDialog(null, passwordinput);
						passwordinput = new String(passwordtf.getPassword());
						uidinput=new String(uidtf.getText());
						if(uidinput.equals(rs.getString(1)))	
						{
							if(passwordinput.equals(rs.getString(2))){
								MainClass.frame();
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Invalid id/password");
								passwordtf.setText("");
								uidtf.setText("");
								
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Incorrect id/password");
						}
					}
					else{
						JOptionPane.showInputDialog("InCorret");
					}
					
				}
				catch(SQLException e2){
					System.err.println(e2.getMessage());
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
		loginbutton.setLocation(100, 250);
		loginbutton.setSize(200,25);
		uidlabel.setBounds(50, 150, 150, 25);
		uidtf.setBounds(210, 150, 150, 25);
		passwordlabel.setBounds(50, 180, 150, 25);
		passwordtf.setBounds(210, 180, 150, 25);
		test.setBounds(50, 150, 50, 25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(loginbutton);
		frame.add(quit);
		frame.add(uidlabel);
		frame.add(uidtf);
		frame.add(passwordlabel);
		frame.add(passwordtf);
		frame.add(test);
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args){
		loginframe();
	}
}
