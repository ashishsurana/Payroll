import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainClass {

	public MainClass() {
	}
	public static void main(String[] args){

		JFrame frame= new JFrame();
		
		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		JLabel headlabl2=new JLabel("Select the Options",JLabel.CENTER);
		
		headlabel.setBounds(50, 40,300, 25);
		headlabl2.setBounds(100,75,200,25);

		
		frame.add(headlabel);
		frame.add(headlabl2);
		
		
		
		frame.setVisible(true);
		frame.setSize(1000,1000);
		frame.setLayout(null);
	}
}
