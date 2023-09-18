package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2, mr1, mr2, mr3;
    JButton next;

    JTextField textName, textFname, textFname1, textEmail, textms, textadd,textcity,textpin,textstate;
    JDateChooser dateChooser;
    Random ran1 = new Random();
    long first4 = (ran1.nextLong()%9000l)+1000l;
    String first =" "+ Math.abs(first4);
    Signup(){
        super("APPLICATION FORM" );


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(200, 20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);


        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD,20));
        labelName.setBounds(100,190,200,30);
        add(labelName);

        textName= new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,14));
        textName.setBounds(300,190,300,30);
        add(textName);


        JLabel labelName2 = new JLabel("Father's Name :");
        labelName2.setFont(new Font("Raleway", Font.BOLD,20));
        labelName2.setBounds(100,240,200,30);
        add(labelName2);


        textFname= new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD,14));
        textFname.setBounds(300,240,300,30);
        add(textFname);

//        JLabel labelName3 = new JLabel("Last Name :");
//        labelName3.setFont(new Font("Raleway", Font.BOLD,20));
//        labelName3.setBounds(100,290,200,30);
//        add(labelName3);
//
//        textFname1= new JTextField();
//        textFname1.setFont(new Font("Raleway", Font.BOLD,14));
//        textFname1.setBounds(300,290,300,30);
//        add(textFname1);

        JLabel dob = new JLabel("Date of Birth :");
      dob.setFont(new Font("Raleway", Font.BOLD,20));
     dob.setBounds(100,340,150,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,300,30);
        add(dateChooser);

        JLabel labelg= new JLabel("Gender :");
        labelg.setFont(new Font("Raleway", Font.BOLD,20));
        labelg.setBounds(100,300,200,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,225,228));
        r1.setBounds(300,290,60,30);
        add(r1);


        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,225,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email :");
        labelEmail.setFont(new Font("RaleWay", Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(300,390,350,30);
        add(textEmail);


        JLabel labelm= new JLabel("Marital Status :");
        labelm.setFont(new Font("Raleway", Font.BOLD,20));
        labelm.setBounds(100,440,200,30);
        add(labelm);

        mr1 = new JRadioButton("Married");
        mr1.setFont(new Font("Raleway", Font.BOLD,14));
        mr1.setBackground(new Color(222,225,228));
        mr1.setBounds(300,440,100,14);
        add(mr1);


        mr2 = new JRadioButton("Unmarried");
        mr2.setFont(new Font("Raleway", Font.BOLD,14));
        mr2.setBackground(new Color(222,225,228));
        mr2.setBounds(400,440,100,14);
        add(mr2);

        mr3 = new JRadioButton("Other");
        mr3.setFont(new Font("Raleway", Font.BOLD,14));
        mr3.setBackground(new Color(222,225,228));
        mr3.setBounds(500,440,90,14);
        add(mr3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(mr1);
        buttonGroup1.add(mr2);
        buttonGroup1.add(mr3);




        JLabel labeladd= new JLabel("Address :");
        labeladd.setFont(new Font("Raleway", Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);


        textadd = new JTextField();
        textadd.setFont(new Font("Raleway", Font.BOLD,14));
        textadd.setBounds(300,490,350,30);
        add(textadd);

        JLabel labelcity= new JLabel("City :");
        labelcity.setFont(new Font("Raleway", Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);


        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD,14));
        textcity.setBounds(300,540,350,30);
        add(textcity);

        JLabel labelpin= new JLabel("Pincode :");
        labelpin.setFont(new Font("Raleway", Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);


        textpin = new JTextField();
        textpin.setFont(new Font("Raleway", Font.BOLD,14));
        textpin.setBounds(300,590,350,30);
        add(textpin);

        JLabel labelstate= new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);


        textstate = new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD,14));
        textstate.setBounds(300,640,350,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(580,710,80,30);
        next.addActionListener(this);
        add(next);





        getContentPane().setBackground(new Color(222,225,228));
        setLayout(null);
       setSize(700,800);
       setLocation(360,40);
       setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(mr1.isSelected()){
            marital="Married";
        } else if (mr2.isSelected()) {
            marital="Unmarried";
        } else if (mr3.isSelected()) {
            marital="Other";
        }
        String address = textadd.getText();
        String city = textcity.getText();
        String pin = textpin.getText();
        String state = textstate.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                connection con1 = new connection();
                String q ="insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String args[]){
        new Signup();
    }
}
