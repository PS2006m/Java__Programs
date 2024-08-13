/*
 * Consider Bank table with attributes AccountNo, CustomerName, Balance, Phone and Address. Write a database application which allows
insertion , update and deletion of records in Bank table. Print values of all customers whose balance is greater than 20,000.
 */
import java.sql.*;
import java.util.*;
class Main22
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/IPE_HARD","root","");
        if(con!=null)
        {
            System.out.println("Connection success");
        }
        else 
        {
            System.out.println("Connection failed");
        }
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do 
        {
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Print balance greater than 20,000");
            System.out.println("5.Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    String sql1="Insert into Bank values(?,?,?,?,?)";
                    PreparedStatement pst1=con.prepareStatement(sql1);
                    System.out.println("Enter account number");
                    int acno=sc.nextInt();
                    pst1.setInt(1,acno);
                    System.out.println("Enter customer name");
                    String name=sc.next();
                    pst1.setString(2,name);
                    System.out.println("Enter balance");
                    double balance=sc.nextDouble();
                    pst1.setDouble(3,balance);
                    System.out.println("Enter phone");
                    long phone=sc.nextLong();
                    pst1.setLong(4,phone);
                    System.out.println("Enter address");
                    String address=sc.next();
                    pst1.setString(5,address);
                    int r=pst1.executeUpdate();
                    if(r>0)
                    {
                        System.out.println("Insertion success");
                    }
                    else
                    {
                        System.out.println("Insertion failed");
                    }
                    break;
                case 2:
                    System.out.println("Enter id");
                    int ac=sc.nextInt();
                    System.out.println("Enter balance");
                    double b=sc.nextDouble();
                    String sql2="Update table Bank set balance=? where AccountNo=?";
                    PreparedStatement pst2=con.prepareStatement(sql2);
                    pst2.setDouble(1,b);
                    pst2.setInt(2,ac);
                    int p=pst2.executeUpdate();
                    if(p>0)
                    {
                        System.out.println("Update Success");
                    }
                    else
                    {
                        System.out.println("Update failed");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account No of the record to delete:");
                    int accountNo = sc.nextInt();
            
                    String query = "DELETE FROM Bank WHERE AccountNo = ?";
                    try (PreparedStatement pstmt = con.prepareStatement(query)) {
                        pstmt.setInt(1, accountNo);
                        int rowsAffected = pstmt.executeUpdate();
                        if (rowsAffected > 0) {
                            System.out.println("Record deleted successfully.");
                        } else {
                            System.out.println("No record found with Account No: " + accountNo);
                        }
                    }
                    break;
                case 4:
                    String query2 = "SELECT * FROM Bank WHERE Balance > 20000";
                    try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query2)) {
                        System.out.println("\nCustomers with Balance > 20,000:");
                        while (rs.next()) {
                            System.out.println("Account No: " + rs.getString("AccountNo"));
                            System.out.println("Customer Name: " + rs.getString("CustomerName"));
                            System.out.println("Balance: " + rs.getDouble("Balance"));
                            System.out.println("Phone: " + rs.getString("Phone"));
                            System.out.println("Address: " + rs.getString("Address"));
                            System.out.println("-----------------------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("You exited");
                    break;
                default:
                    System.out.println("Enter between 1 and 5");
                    break;
            }
        }while(choice!=5);
    }
}