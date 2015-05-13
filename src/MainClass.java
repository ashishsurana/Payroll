import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class MainClass {
	public static JFrame frame = new JFrame();
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	 
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

	public static void frameremove(){
		final JFrame frame=new JFrame();
		
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Remove A Employee From Paroll",JLabel.CENTER);
		
		JLabel uidlabel=new JLabel("Enter the UID :");
		JTextField uidtf = new JTextField();
		
		JButton remove = new JButton("Remove");		
		
		
		JButton quit = new JButton("Cancel");
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
		test.setBounds(50, 150, 50, 25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(remove);
		frame.add(quit);
		frame.add(uidlabel);
		frame.add(uidtf);
		frame.add(test);
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void frameupdate(){

final JFrame f=new JFrame();//creating instance of JFrame  

 

JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
JLabel headlabel2=new JLabel("Edit the info to be Updated",JLabel.CENTER);

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

JLabel uidlabel=new JLabel("Unique ID :");
JTextField uidtf= new JTextField();


JButton submit = new JButton("Submit");
JButton quit = new JButton("Quit");


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



nametf.setBounds(200,120,150, 25);
agetf.setBounds(200,150,150, 25);
designationtf.setBounds(200,250,150,25);
basictf.setBounds(200,280,150,25);

submit.setBounds(40,400,100,25);
quit.setBounds(150,400,100,25);


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

f.add(uidlabel);
f.add(uidtf);
f.addWindowListener(null);

f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  

f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
		
	public static void frameleave(){
		
		
		
		

		final JFrame frame = new JFrame();
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Enter the Leaves for a Employee",JLabel.CENTER);
		
		JLabel uidlabel=new JLabel("Enter the UID :");
		JTextField uidtf = new JTextField();
		
		JLabel leaves=new JLabel("Enter the no. of leaves");
		JTextField leavestf = new JTextField();
		
		JButton remove = new JButton("Remove");		
		
		
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
		leavestf.setBounds(210, 180, 150, 25);
		test.setBounds(50, 150, 50, 25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(remove);
		frame.add(quit);
		frame.add(uidlabel);
		frame.add(uidtf);
		frame.add(leaves);
		frame.add(leavestf);
		frame.add(test);
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
		
		
		
	}
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



	JButton quit = new JButton("Quit");
	JButton cancel = new JButton("OK");

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


	cancel.setBounds(100,400,80,25);
	quit.setBounds(240,400,80,25);





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
	f.add(cancel);
	f.add(uidlabel);
	f.add(uidtf);
	f.addWindowListener(null);

	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  

	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	public static void frame(){

		final JFrame frame=new JFrame();
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Cick on the Options Below:",JLabel.CENTER);
		JLabel test=new JLabel(" ");
		JButton addnew = new JButton("Add a Employee");
		JButton remove = new JButton("Remove a Employee");
		JButton update = new JButton("Update a Record");
		JButton leave = new JButton("No. of Leave Entry");
		JButton display = new JButton("Display Details");
		
		
		
		JButton quit = new JButton("Quit");

		quit.addActionListener(new ActionListener() {//on Click Quit
		    public void actionPerformed(ActionEvent e)
		    {
		       frame.dispose();
		    }
		});
		
		addnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frameaddnew();
			}
		});
		remove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			frameremove();	
			}
		});
		update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frameupdate();
			}
		});

		leave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frameleave();
			}
		});
		display.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				framedisplay();
			}
		});
		
		headlabel.setBounds(50,40,300,25);
		headlabel2.setLocation(50,70);
		headlabel2.setSize(300,25);
		test.setBounds(200, 200, 10, 15);

		addnew.setLocation(100, 120);
		addnew.setSize(200, 25);
		remove.setLocation(100, 160);
		remove.setSize(200,25);
		update.setLocation(100, 200);
		update.setSize(200,25);
		leave.setLocation(100,240);
		leave.setSize(200,25);
		display.setBounds(100, 280, 200, 25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(addnew);
		frame.add(remove);
		frame.add(update);
		frame.add(leave);
		frame.add(quit);
		frame.add(display);
		frame.add(test);
		
		
		
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
	frame();
	
	}

}
