import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Display  {  
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	static String url="jdbc:mysql://localhost:3306/payrolltest";
	static String username="test3";
	static String password="pwd";
	static String query;
	static String uidin="...";
	public static void setuid(String uid){
		uidin=uid;
	}
	public static void framedisplay(){
	
	final JFrame f=new JFrame();//creating instance of JFrame  
	if(uidin.equals("..."))
		{

		uidin=JOptionPane.showInputDialog("Enter uid");
		if(uidin.equals("")){
			f.dispose();
		}

		}
	query="select * from employee where uid =  '"+ uidin +"' ";
	

	JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
	JLabel headlabel2=new JLabel("Details of an Employee",JLabel.CENTER);

	JLabel namelabel=new JLabel("Full Name : ");
	JTextField nametf= new JTextField();

	JLabel agelabel=new JLabel("Age :");
	JTextField agetf= new JTextField();

	JLabel sexlabel=new JLabel("Sex :");
	JTextField sextf = new JTextField();

	JLabel designationlabel=new JLabel("Designation :");
	JTextField designationtf= new JTextField();

	JLabel basiclabel=new JLabel("Basic :");
	JTextField basictf= new JTextField();

	JLabel uidlabel=new JLabel("Unique ID :");
	JTextField uidtf= new JTextField();
	
	JLabel Nolabel=new JLabel("Mobile Number  :");
	final JTextField NOtf= new JTextField();

	JLabel emaillabel=new JLabel("Emails ID :");
	final JTextField emailtf= new JTextField();
	

	JButton quit = new JButton("ok");

	try{
		con=DriverManager.getConnection(url,username,password);
		stmt=con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=stmt.executeQuery(query);
		while(rs.next())
		{
//			if(rs.getString("name").equals(null))
//			{
//				nametf.setText("ffF");//rs.getString("name")
//				JOptionPane.showMessageDialog(null,"Record Not Found");
//			}
			
			nametf.setText(rs.getString("name"));
			agetf.setText(rs.getString("age"));
			designationtf.setText(rs.getString("designation"));
			uidtf.setText(rs.getString("uid"));
			NOtf.setText(rs.getString("mobile"));
			emailtf.setText(rs.getString("email"));
			basictf.setText(rs.getString("basic")+".00 /-");
			if(rs.getString("sex").equals("M")){
	    		
				sextf.setText("Male");
	    	}
	    	else if(rs.getString("sex").equals("F") ){
	    		sextf.setText("Female");
	    	}
	    	else
	    		sextf.setText("Other");
		}
		
		
	}
	catch(SQLException e2){
		JOptionPane.showMessageDialog(null,e2.getMessage());
		e2.printStackTrace();
	}
	
	
	
	

	quit.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e)
	    {
	       f.dispose();
	    }
	});




	headlabel.setLocation(50, 40);
	headlabel2.setLocation(50, 75);
	namelabel.setLocation(60, 120);
	agelabel.setLocation(60, 150);
	sexlabel.setLocation(60, 180);
	designationlabel.setLocation(60,210);
	basiclabel.setLocation(60,240);
	uidlabel.setLocation(60,270);
	emaillabel.setLocation(60,300);
	Nolabel.setLocation(60, 330);



	nametf.setBounds(200,120,150, 25);
	agetf.setBounds(200,150,150, 25);

	sextf.setBounds(200, 180, 150,25);
	designationtf.setBounds(200,210,150,25);
	basictf.setBounds(200,240,150,25);
	uidtf.setBounds(200,270,150,25);
	emailtf.setBounds(200, 300, 150, 25);
	NOtf.setBounds(200, 330, 150, 25);


	quit.setBounds(150,400,100,25);





	headlabel.setSize(300,25);
	headlabel2.setSize(300,25);
	namelabel.setSize(150, 25);
	agelabel.setSize(150,25);
	sexlabel.setSize(150,25);
	designationlabel.setSize(150,25);
	basiclabel.setSize(125, 25);
	uidlabel.setSize(150, 25);
//	Dimension d=();
	emaillabel.setSize(150,25);
	Nolabel.setSize(150,25);







	f.add(nametf);
	f.add(agetf);
	f.add(headlabel);
	f.add(headlabel2);
	f.add(namelabel);
	f.add(agelabel);
	f.add(sexlabel);
	f.add(sextf);
	f.add(designationlabel);
	f.add(designationtf);
	f.add(basiclabel);
	f.add(basictf);

	f.add(Nolabel);
	f.add(NOtf);
	f.add(emailtf);
	f.add(emaillabel);
	         
	f.add(quit);

	f.add(uidlabel);
	f.add(uidtf);
	f.addWindowListener(null);

	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  

	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
public static void main(String[] args) {  
	framedisplay();
}  
}  
