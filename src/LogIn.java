import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class LogIn {
	public static void loginframe(){
		String uid;
		String password;
		
		Connection con;
		Statement stmt;
		String query;

		final JFrame frame = new JFrame();
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Welcome Admin to Admin Panel",JLabel.CENTER);
		
		JLabel uidlabel=new JLabel("Admin username :");
		JTextField uidtf = new JTextField();
		uid=uidtf.getText();
		
		JLabel leaves=new JLabel("Admin Password :");
		JTextField passwordtf = new JTextField();
		
		JButton remove = new JButton("Log In");		
		
		
		JButton quit = new JButton("Quit");
		JLabel test=new JLabel(" ");

		quit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		       frame.dispose();
		    }
		});
		
		
		headlabel.setBounds(50,40,300,25);
		headlabel2.setLocation(50,70);
		headlabel2.setSize(300,25);
		remove.setLocation(100, 250);
		remove.setSize(200,25);
		uidlabel.setBounds(50, 150, 150, 25);
		uidtf.setBounds(210, 150, 150, 25);
		leaves.setBounds(50, 180, 150, 25);
		passwordtf.setBounds(210, 180, 150, 25);
		test.setBounds(50, 150, 50, 25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(remove);
		frame.add(quit);
		frame.add(uidlabel);
		frame.add(uidtf);
		frame.add(leaves);
		frame.add(passwordtf);
		frame.add(test);
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args){
		
	}
}
