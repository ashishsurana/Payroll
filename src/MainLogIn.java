import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainLogIn {
	static String uidip;

	public static void frameadmin(){
		final JFrame frame=new JFrame();
		frame.setSize(400,500);
		
		

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Select your Option",JLabel.CENTER);
		
		JButton admin = new JButton("Admin");		
		JButton user = new JButton("User");		
		
		
		JButton quit = new JButton("Cancel");
		JLabel test=new JLabel(" ");

		admin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	AdminLogIn.loginframe();
		    }
		});
		
		quit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		       frame.dispose();
		    }
		});
		
		
		headlabel.setBounds(50,40,300,25);
		headlabel2.setLocation(50,70);
		headlabel2.setSize(300,25);
		admin.setLocation(100, 250);
		admin.setSize(200,25);
		user.setBounds(100,200,200,25);
		test.setBounds(50, 150, 50, 25);
		

		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(admin);
		frame.add(user);
		frame.add(quit);
		frame.add(test);
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		frameadmin();
	}
}
