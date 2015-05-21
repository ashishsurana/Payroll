import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CalculatePayroll {
	static String uidip;

	public static void frame(final String uid){
		
	      Connection con;
	      Statement stm;
	      PreparedStatement ps;
	      ResultSet rs;
	      String query="select basic,leaves from employee where uid =  '"+ uid +"' ";//+uid;//
	      
	      String url="jdbc:mysql://localhost:3306/payrolltest";
	      String username="test3";
	      String password="pwd";
	     

		
		
		final JFrame frame=new JFrame();
		frame.setSize(400,500);
		JLabel headlabel=new JLabel("Payroll Management System",JLabel.CENTER);
		
		JLabel headlabel2=new JLabel("Paroll Of Employee",JLabel.CENTER);

		JLabel  wdlabel=new JLabel("Total Working Days :");
		JLabel wd=new JLabel();
		
		JLabel basiclabel=new JLabel("Basic Salary :");
		JLabel basic=new JLabel();
		
		
		JLabel malabel=new JLabel("Medical Allowance");
		JLabel ma=new JLabel();
		
		JLabel  dalabel=new JLabel("Daily Alloawance :");
		JLabel da=new JLabel();
		
		JLabel  hralabel=new JLabel("Home Rent Allowance :");
		JLabel hra=new JLabel();
				
		JLabel  pflabel=new JLabel("Provident Fund :");
		JLabel pf=new JLabel();
		
		JLabel  taxlabel=new JLabel("Tax :");
		JLabel tax=new JLabel();
		
		JLabel  grosslabel=new JLabel("Gross Salary:");
		JLabel gross=new JLabel();
		
		
		
		
		JButton quit = new JButton("OK");
		JLabel test=new JLabel(" ");


		try{
			con=DriverManager.getConnection(url,username,password);
			stm=con.createStatement();
			rs=stm.executeQuery(query);
			while(rs.next()){
				int t=rs.getInt("basic");
				t=(t/30) * rs.getInt("leaves");
				wd.setText("     " + rs.getInt("leaves"));
				basic.setText("    "+t);
				ma.setText(" + " + ((t*0.1)));
				da.setText(" + " + ((t*0.1)));
				hra.setText(" + " + ((t*0.1)));
				pf.setText(" -  " + ((t*0.1)));
				tax.setText("    " + ((t*0.05)));
				gross.setText("   " + (t+(t*0.15)) );
			}

			//			JOptionPane.showMessageDialog(null, t);
		}
		catch(SQLException e2){
			e2.printStackTrace();
		}
		
		quit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		       frame.dispose();
		    }
		});
		
		
		headlabel.setBounds(50,40,300,25);
		headlabel2.setBounds(50,70, 300, 25);
		test.setBounds(50, 150, 50, 25);
		
		wdlabel.setBounds(60, 120, 150, 25);
		basiclabel.setBounds(60, 150, 150, 25);
		malabel.setBounds(60, 180, 150, 25);
		dalabel.setBounds(60, 210, 150, 25);
		hralabel.setBounds(60, 240, 150, 25);
		pflabel.setBounds(60, 270, 150, 25);
		taxlabel.setBounds(60, 300, 150, 25);
		grosslabel.setBounds(60, 330, 150, 25);
		
		wd.setBounds(200, 120, 100, 25);
		basic.setBounds(200, 150, 100, 25);
		ma.setBounds(200, 180, 150, 25);
		da.setBounds(200, 210, 150, 25);
		hra.setBounds(200, 240, 150, 25);
		pf.setBounds(200, 270, 150, 25);
		tax.setBounds(200, 300, 150, 25);
		gross.setBounds(200, 330, 150, 25);
		
//		malabel.setBounds(60, 150, 150, 25);
//		ma.setBounds(200, 150, 150, 25);
//		
//		pflabel.setBounds(60, 180, 150, 25);
//		pf.setBounds(200, 180, 150, 25);
		
		
		quit.setBounds(150,400,100,25);
		
		frame.add(headlabel);
		frame.add(headlabel2);
		frame.add(basic);
		frame.add(basiclabel);
		frame.add(malabel);
		frame.add(ma);
		frame.add(pflabel);
		frame.add(pf);
		frame.add(wdlabel);
		frame.add(wd);
		frame.add(dalabel);
		frame.add(da);
		frame.add(hralabel);
		frame.add(hra);
		frame.add(taxlabel);
		frame.add(tax);
		frame.add(grosslabel);
		frame.add(gross);
		
		
		
		
		frame.add(quit);
		frame.add(test);
		
		
		frame.setVisible(true);
		frame.setLayout(null);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
//		frameremove();
	}
}
