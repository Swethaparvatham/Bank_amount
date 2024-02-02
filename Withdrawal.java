import java.sql.*;

public class Bankamount {
    public static final String url="jdbc:mysql: localhost:3306/bank";
    public static final String user="username";
    public static final String password="password";
    public static connection con;
    public static statement stmt;
    public static resultset rs;
    public void withdrawal(int account_number,double amount){
      try{
        connrction con=DriverManager.getconnection(url,user,password);
        statement stmt=con.createsatement();
        Resultset rs=stmt.executeQuery("SELECT balance FROM account WHERE account-number=",account_number);
        if(rs.next()){
          doublebalance=rs.getDouble(1);
          if(balance>=amount){
            doublenewBalance=balance=balance-amount;
            rs=stmt.executeQuery("UPDATE account SET balance=",newbalance+"WHERE account-number="+account_number);
            System.out.println("withdrawal succesful,new balance:"+new balance);
          }
          else{
            System.out.println("Insufficient balance");
          }
          }
        }
        catch(SQLException sqlex){
          sqlex.printstack Trace[];
        }
        finally{
          try{
            con.close();
          }
          catch(SQL exceptionse){
          }
          }
          try{
            stmt.close();
        }
        catch(SQL exceptionse){
          }
        try{
            rs.close();
        }
        catch(SQL exceptionse){
          }
    }
  }
  public Static void main(String args[])
  withdraw(1234,200.00);
  }
}
