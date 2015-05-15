import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class AddNew  {  
	public static void frameaddnew(){

		final JFrame f=new JFrame(); 

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Enter the details about an Employee",JLabel.CENTER);

		JLabel namelabel=new JLabel("Full Name : ");
		final JTextField nametf= new JTextField();

		JLabel agelabel=new JLabel("Age :");
		final JTextField agetf= new JTextField();

		JLabel sexlabel=new JLabel("Sex :");//Radio Button
		JRadioButton male=new JRadioButton("Male");
		JRadioButton female=new JRadioButton("Female");
		JRadioButton other=new JRadioButton("Other");
		//male.setSelected(true);
		final ButtonGroup bg = new ButtonGroup();//Button Group
		bg.add(male);
		bg.add(female);
		bg.add(other);

		JLabel designationlabel=new JLabel("Designation :");
		final JTextField designationtf= new JTextField();

		JLabel basiclabel=new JLabel("Basic :");
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

}  
}  
