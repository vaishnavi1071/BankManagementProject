package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    Connection connection;
    Statement statement;
    public connection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root",
                    "T#9758@qlph");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

    }
}
