import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Display  {  
	public static void framedisplay(){

	final JFrame f=new JFrame();//creating instance of JFrame  

	 

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



	JButton quit = new JButton("ok");


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



	nametf.setBounds(200,120,150, 25);
	agetf.setBounds(200,150,150, 25);

	sextf.setBounds(200, 180, 150,25);
	designationtf.setBounds(200,210,150,25);
	basictf.setBounds(200,240,150,25);
	uidtf.setBounds(200,270,150,25);



	quit.setBounds(150,400,100,25);





	headlabel.setSize(300,25);
	headlabel2.setSize(300,25);
	namelabel.setSize(150, 25);
	agelabel.setSize(150,25);
	sexlabel.setSize(150,25);
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
	f.add(sextf);
	f.add(designationlabel);
	f.add(designationtf);
	f.add(basiclabel);
	f.add(basictf);
	         
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
	
}  
}  
