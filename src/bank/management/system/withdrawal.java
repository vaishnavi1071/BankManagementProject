package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawal extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton button1,button2;
    withdrawal(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS 10,000");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Raleway",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("Please enter your amount");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Raleway",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);

        button1 = new JButton("WITHDRAW");
        button1.setBounds(700,362,150,35);
        button1.setBackground(new Color(65,125,128));
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        l3.add(button1);

        button2 = new JButton("BACK");
        button2.setBounds(700,406,150,35);
        button2.setBackground(new Color(65,125,128));
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        l3.add(button2);




        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button1){

        try {
            String amount = textField.getText();
            Date date = new Date();
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
            }else {
                connection c = new connection();
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                JOptionPane.showMessageDialog(null,"RS. " +amount+" Debited Successfully");
                setVisible(false);
                new main_c(pin);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
        } else if (e.getSource()==button2) {
            setVisible(false);
            new main_c(pin);
        }

    }

    public static void main(String[] args) {
        new withdrawal("");
    }
}
