import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class AddNew {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  

 

JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
JLabel headlabel2=new JLabel("Enter the details about an Employee",JLabel.CENTER);

JLabel namelabel=new JLabel("Full Name : ");
JTextField nametf= new JTextField();

JLabel agelabel=new JLabel("Age :");
JTextField agetf= new JTextField();

JLabel sexlabel=new JLabel("Sex :");
JRadioButton male=new JRadioButton("Male");
JRadioButton female=new JRadioButton("Female");
JRadioButton other=new JRadioButton("Other");
male.setSelected(true);

ButtonGroup bg = new ButtonGroup();
bg.add(male);
bg.add(female);
bg.add(other);


JLabel designationlabel=new JLabel("Designation :");
JTextField designationtf= new JTextField();

JLabel basiclabel=new JLabel("Basic :");
JTextField basictf= new JTextField();

JButton submit = new JButton("Submit");
JButton quit = new JButton("Quit");
JButton cancel = new JButton("Cancel");






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




nametf.setBounds(200,120,150, 25);
agetf.setBounds(200,150,150, 25);
designationtf.setBounds(200,250,150,25);
basictf.setBounds(200,280,150,25);

submit.setBounds(40,400,100,25);
quit.setBounds(150,400,100,25);
cancel.setBounds(260,400,100,25);



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
f.add(cancel);


f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  
