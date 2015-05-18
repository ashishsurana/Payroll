import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Update  { 
	static Connection con;
	static Statement stmt;
	static ResultSet  rs;
	static String query;
	
	static String url="jdbc:mysql://localhost:3306/payrolltest";
	static String username="test3";
	static String password="pwd";
	
	public static void frameupdate(){//String passeduid
		final String passeduid=JOptionPane.showInputDialog("Enter uid for updation");
		
		query="select * from employee where uid =  '"+ passeduid +"' ";
		final JFrame f=new JFrame();//creating instance of JFrame  
		//uidin=JOptionPane.showInputDialog("Enter uid");
		if(passeduid.equals("")){
			f.dispose();
		}
		
 

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Edit the info to be Updated",JLabel.CENTER);

		JLabel namelabel=new JLabel("Full Name : ");
		final JTextField nametf= new JTextField();
		
		JLabel agelabel=new JLabel("Age :");
		final JTextField agetf= new JTextField();

		JLabel sexlabel=new JLabel("Sex :");
		final JRadioButton male=new JRadioButton("Male");
		final JRadioButton female=new JRadioButton("Female");
		final JRadioButton other=new JRadioButton("Other");
//male.setSelected(true);

ButtonGroup bg = new ButtonGroup();
bg.add(male);
bg.add(female);
bg.add(other);


JLabel designationlabel=new JLabel("Designation :");
final JTextField designationtf= new JTextField();

JLabel basiclabel=new JLabel("Basic :");
final JTextField basictf= new JTextField();

JLabel uidlabel=new JLabel("Unique ID :");
final JTextField uidtf= new JTextField();

JLabel Nolabel=new JLabel("Mobile Number  :");
final JTextField NOtf= new JTextField();

JLabel emaillabel=new JLabel("Emails ID :");
final JTextField emailtf= new JTextField();

JLabel passlabel=new JLabel("User Password :");
final JTextField passtf= new JTextField();



JButton submit = new JButton("Update");
JButton quit = new JButton("Quit");

try{
	con=DriverManager.getConnection(url,username,password);
	stmt=con.createStatement();
	rs=stmt.executeQuery(query);
	while(rs.next())
	{

		nametf.setText(rs.getString("name"));
		agetf.setText(rs.getString("age"));
		designationtf.setText(rs.getString("designation"));
		uidtf.setText(rs.getString("uid"));
		basictf.setText(rs.getString("basic"));
		NOtf.setText(rs.getString("mobile"));
		passtf.setText(rs.getString("pass"));
		emailtf.setText(rs.getString("email"));
		if(rs.getString("sex").equals("M")){
    		
			male.setSelected(true);
    	}
    	else if(rs.getString("sex").equals("F") ){
    		female.setSelected(true);
    	}
    	else
    		other.setSelected(true);;
	}
	
	
}
catch(SQLException e2){
//	System.out.println(e2.getMessage());
	e2.printStackTrace();
}

submit.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
//		Connection con;
//		Statement stmt;
//		ResultSet  rs;
//		String query="selecyt * from employee where uid = " + passeduid;
//		
//		String url="jdbc:mysql//localhost:3306/payrolltest";
//		String username="test3";
//		String password="pwd";
		
		try{
			String temp;
//			con.setReadOnly(false);
			con.close();
			query="UPDATE employee SET name=?, age = ?,sex= ?,designation= ?,basic = ?,uid = ? , pass = ? ,email = ?, mobile = ?" +" WHERE uid = '"+passeduid+"'";//(name,age,sex,designation,basic,uid)
			con=DriverManager.getConnection(url,username,password);
//			stmt=con.createStatement();//ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, nametf.getText());
			ps.setInt(2, Integer.parseInt(agetf.getText()));
			if(male.isSelected()==true){
    		temp="M";
    	}
    	else if(female.isSelected()==true){
    		temp="F";
    	}
    	else
    	{
    		temp="O";
    	}
			ps.setString(3, temp);
			ps.setString(4, designationtf.getText());
			ps.setString(5, basictf.getText());
			ps.setString(6, uidtf.getText());
			ps.setString(7, passtf.getText());
	    	ps.setString(8, emailtf.getText());
	    	ps.setString(9, NOtf.getText());
	    	   
//			rs.updateRow();
			if(nametf.getText().equals("") ||  Integer.parseInt(agetf.getText())==0  || designationtf.getText().equals("") || basictf.getText().equals("") || uidtf.getText().equals(""))
	    		   
	    	   {
	    		   JOptionPane.showMessageDialog(null,"Check All Fields must be Filled with correct values");
	    	    }
	    	   else{
	    		   ps.executeUpdate();
		    	   JOptionPane.showMessageDialog(null, "Response Submitted Successfully");
		    	  
	    	   }
			
		}
		catch(SQLException e2){
			System.out.println(e2.getMessage());
		}
	}
});
try {
	rs.updateRow();
	JOptionPane.showMessageDialog(null,"ok");
} catch (SQLException e1) {
	// TODO Auto-generated catch block
//	e1.printStackTrace();
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
male.setLocation(200, 180); 
female.setLocation(200, 200);
other.setLocation(200, 220);
designationlabel.setLocation(60,250);
basiclabel.setLocation(60,280);
uidlabel.setLocation(60,310);
Nolabel.setLocation(60,340);
emaillabel.setLocation(60, 370);
passlabel.setLocation(60, 400);



nametf.setBounds(200,120,150, 25);
agetf.setBounds(200,150,150, 25);
designationtf.setBounds(200,250,150,25);
basictf.setBounds(200,280,150,25);

submit.setBounds(100,435,90,25);
quit.setBounds(210,435,90,25);


uidtf.setBounds(200,310,150,25);
NOtf.setBounds(200, 340, 150, 25);
emailtf.setBounds(200, 370, 150, 25);
passtf.setBounds(200, 400, 150, 25);




headlabel.setSize(300,25);
headlabel2.setSize(300,25);
namelabel.setSize(150, 25);
agelabel.setSize(150,25);
sexlabel.setSize(150,25);
male.setSize(150,25);
female.setSize(150,25);
other.setSize(150,25);
designationlabel.setSize(150,25);
basiclabel.setSize(125, 25);
uidlabel.setSize(150, 25);
Nolabel.setSize(150, 25);
emaillabel.setSize(150, 25);
passlabel.setSize(150, 25);







f.add(nametf);
f.add(agetf);
f.add(headlabel);
f.add(headlabel2);
f.add(namelabel);
f.add(agelabel);
f.add(sexlabel);
f.add(male);
f.add(female);
f.add(other);
f.add(designationlabel);
f.add(designationtf);
f.add(basiclabel);
f.add(basictf);
f.add(submit);          
f.add(quit);

f.add(NOtf);
f.add(emailtf);
f.add(emaillabel);
f.add(passtf);
f.add(passlabel);
f.add(Nolabel);
f.add(uidlabel);
f.add(uidtf);
f.addWindowListener(null);

f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  

f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
 public static void main(String[] args)
 {
	 frameupdate();
 }
}  

