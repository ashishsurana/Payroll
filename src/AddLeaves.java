import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddLeaves {

	public static void frameleave(){
		
		
		
		

		final JFrame frame = new JFrame();
		frame.setSize(400,500);
			

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Enter the Leaves for a Employee",JLabel.CENTER);
		
		JLabel uidlabel=new JLabel("Enter the UID :");
		JTextField uidtf = new JTextField();
		
		JLabel leaves=new JLabel("Enter the no. of leaves");
		JTextField leavestf = new JTextField();
		
		JButton remove = new JButton("Insert");		
		
		
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
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
