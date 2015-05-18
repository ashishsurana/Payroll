import javax.swing.JFrame;
import javax.swing.JLabel;


public class BasicComp {
	public void components(){
		final JFrame frame=new JFrame();
		frame.setSize(400,500);
		
		

		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabel2=new JLabel("Select your Option",JLabel.CENTER);
		headlabel.setBounds(50,40,300,25);
		headlabel2.setLocation(50,70);
		headlabel2.setSize(300,25);
		
	}
}
