import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		final JFrame frame = new JFrame();
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Cick on the Options Below:",JLabel.CENTER);
		JLabel test=new JLabel(" ");
		JButton addnew = new JButton("Add A Employee");
		JButton remove = new JButton("Remove A Employee");
		JButton update = new JButton("Update A Record");
		JButton leave = new JButton("Leave Entry");
		
		
		
		JButton quit = new JButton("Quit");

		quit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		       frame.dispose();
		    }
		});
		
		
		headlabel.setBounds(50,40,300,25);
		headlabel2.setLocation(50,70);
		headlabel2.setSize(300,25);
		test.setBounds(100, 100, 30, 25);

		addnew.setLocation(150, 120);
		addnew.setSize(200, 25);
		remove.setLocation(150, 150);
		remove.setSize(200,25);
		update.setLocation(150, 180);
		update.setSize(200,25);
		leave.setLocation(150,210);
		leave.setSize(200,25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(addnew);
		frame.add(remove);
		frame.add(update);
		frame.add(leave);
		frame.add(quit);
		frame.add(test);
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
