import javax.swing.*;  
public class FirstSwingExample {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  



JLabel label1=new JLabel("Payroll Management System",JLabel.CENTER);
JLabel label2=new JLabel("Enter the details about an Employee",JLabel.CENTER);
JLabel namelabel=new JLabel("Full Name : ");
JTextField textfield1= new JTextField();
JTextField textfield2= new JTextField();







label1.setLocation(50, 40);
label2.setLocation(50, 75);
namelabel.setLocation(60, 120);
        



textfield1.setBounds(200,120,100, 25);
textfield2.setBounds(200,200,100, 25);


label1.setSize(300,25);
label2.setSize(300,25);
namelabel.setSize(150, 25);

f.add(textfield1);
f.add(textfield2);
f.add(label1);
f.add(label2);
f.add(namelabel);
          



f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  
