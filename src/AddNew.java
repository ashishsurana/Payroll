import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.sql.Statement;
public class AddNew  {  
	 static String nameip;
	 static int ageip=0;
	 static String sexip="T";
	 static String designationip;
	 static int basicip=0;
	 static String uidip;
	
	
	public static void frameaddnew(){

		final JFrame f=new JFrame(); 

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Enter the details about an Employee",JLabel.CENTER);

		JLabel namelabel=new JLabel("Full Name : ");
		final JTextField nametf= new JTextField();

		JLabel agelabel=new JLabel("Age :");
		final JTextField agetf= new JTextField();

		JLabel sexlabel=new JLabel("Sex :");//Radio Button
		final JRadioButton male=new JRadioButton("Male");
		final JRadioButton female=new JRadioButton("Female");
		final JRadioButton other=new JRadioButton("Other");
		//male.setSelected(true);
		final ButtonGroup bg = new ButtonGroup();//Button Group
		bg.add(male);
		bg.add(female);
		bg.add(other);

		JLabel designationlabel=new JLabel("Designation :");
		final JTextField designationtf= new JTextField();

		JLabel basiclabel=new JLabel("Basic Salary :");
		final JTextField basictf= new JTextField();

		JLabel uidlabel=new JLabel("Unique ID :");
		final JTextField uidtf= new JTextField();

		JButton submit = new JButton("Submit");
		JButton quit = new JButton("Cancel");
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener(){//On cancel click
			public void actionPerformed(ActionEvent e)
			{
				
				nametf.setText("");
				agetf.setText("");
				designationtf.setText("");
				basictf.setText("");
				bg.clearSelection();
			}
		});

		submit.addActionListener(new ActionListener() {//On Quit click
		    public void actionPerformed(ActionEvent e)
		    {
		    	//Getting input from UI
		    	try{
		    		nameip=nametf.getText();
			    	ageip=Integer.parseInt(agetf.getText());
			    	if(male.isSelected()==true){
			    		sexip="M";
			    	}
			    	else if(female.isSelected()==true){
			    		sexip="F";
			    	}
			    	else
			    		sexip="O";
			    	
			    	designationip=designationtf.getText();
			    	basicip=Integer.parseInt(basictf.getText());
			    	uidip=uidtf.getText();
			    	
		    	}
		    	catch(NumberFormatException e2){
		    		e2.getMessage();
		    		//JOptionPane.showMessageDialog(null,"Invalid Input");
		    	}
		    	//Database Connectivity
		       Connection con;
		       Statement stmt;
		       PreparedStatement ps;
//		       ResultSet rs;
		       String query="INSERT INTO employee (name,age,sex,designation,basic,uid)" + "VALUES (?,?,?,?,?,?)";
		       
		       String url="jdbc:mysql://localhost:3306/payrolltest";
		       String username="test3";
		       String password="pwd";
		       
		       try{
		    	   con=DriverManager.getConnection(url,username,password);
//		    	   stmt=con.createStatement();
//		    	   rs=stmt.executeQuery(query);
		    	   ps=con.prepareStatement(query);
		    	   ps.setString(1, nameip);
		    	   ps.setInt(2, ageip);
		    	   ps.setString(3,sexip);
		    	   ps.setString(4, designationip);
		    	   ps.setInt(5,basicip);
		    	   ps.setString(6, uidip);
		    	   if(nameip.equals("") ||  ageip==0 || sexip=="T" || designationip.equals("") || basicip==0 || uidip.equals(""))
		    		   
		    	   {
		    		   JOptionPane.showMessageDialog(null,"Check All Fields must be Filled with correct values");
		    	    }
		    	   else{
		    		   ps.executeUpdate();
			    	   JOptionPane.showMessageDialog(null, "Response Submitted Successfully");
			    	  
		    	   }
		    	   }
		       catch(SQLException e2){
		    	   System.err.println(e2.getMessage());
		       }
		    }
		});

		quit.addActionListener(new ActionListener() {//On Quit click
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



		nametf.setBounds(200,120,150, 25);
		agetf.setBounds(200,150,150, 25);
		designationtf.setBounds(200,250,150,25);
		basictf.setBounds(200,280,150,25);

		submit.setBounds(40,400,100,25);
		quit.setBounds(150,400,100,25);
		clear.setBounds(260,400,100,25);

		uidtf.setBounds(200,310,150,25);



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
		f.add(clear);
		f.add(uidlabel);
		f.add(uidtf);
		f.addWindowListener(null);

		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  

		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
public static void main(String[] args) {  
	frameaddnew();

}  
}  
