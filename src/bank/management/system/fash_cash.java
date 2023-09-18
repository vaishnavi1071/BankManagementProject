package bank.management.system;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fash_cash extends JFrame implements ActionListener {
    String pin;
    JButton button1,button2,button3,button4,button5,button6,button7;
    fash_cash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Select Withdrawal Amount ");
        label.setBounds(445,180,700,30);
        label.setFont(new Font("Raleway",Font.BOLD,23));
        label.setForeground(Color.white);
        l3.add(label);

        button1 =new JButton("Rs. 100");
        button1.setForeground(Color.white);
        button1.setBackground(new Color(65,125,128));
        button1.setBounds(410,274,150,35);
        button1.addActionListener(this);
        l3.add(button1);

        button2 =new JButton("Rs. 500");
        button2.setForeground(Color.white);
        button2.setBackground(new Color(65,125,128));
        button2.setBounds(700,274,150,35);
        button2.addActionListener(this);
        l3.add(button2);


        button3 =new JButton("Rs. 1000");
        button3.setForeground(Color.white);
        button3.setBackground(new Color(65,125,128));
        button3.setBounds(410,318,150,35);
        button3.addActionListener(this);
        l3.add(button3);

        button4 =new JButton("Rs. 2000");
        button4.setForeground(Color.white);
        button4.setBackground(new Color(65,125,128));
        button4.setBounds(700,318,150,35);
        button4.addActionListener(this);
        l3.add(button4);

        button5 =new JButton("Rs. 5000");
        button5.setForeground(Color.white);
        button5.setBackground(new Color(65,125,128));
        button5.setBounds(410,362,150,35);
        button5.addActionListener(this);
        l3.add(button5);


        button6 =new JButton("Rs. 10000");
        button6.setForeground(Color.white);
        button6.setBackground(new Color(65,125,128));
        button6.setBounds(700,362,150,35);
        button6.addActionListener(this);
        l3.add(button6);

        button7 =new JButton("BACK");
        button7.setForeground(Color.white);
        button7.setBackground(new Color(65,125,128));
        button7.setBounds(700,406,150,35);
        button7.addActionListener(this);
        l3.add(button7);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button7){
            setVisible(false);
            new main_c(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            connection c= new connection();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
//                String num ="17";
                if(e.getSource() != button7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;

                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                JOptionPane.showMessageDialog(null,"RS. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_c(pin);
        }

    }

    public static void main(String[] args) {
        new fash_cash("");

    }
}
