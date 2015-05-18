import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.Statement;


public class MainClass {
	 
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
				AddNew.frameaddnew();
			}
		});
		remove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			Remove.frameremove();	
			}
		});
		update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Update.frameupdate();
			}
		});

		leave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				AddLeaves.frameleave();
			}
		});
		display.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Display.framedisplay();
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
//        LogIn.loginframe();
	}
	
	
	
	public static void main(String[] args) {
		frame();
//		AdminLogIn.loginframe();
	
	}

}
