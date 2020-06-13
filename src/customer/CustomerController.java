package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import thogakade.DBConnection;

public class CustomerController {
    public static boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException{

        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
            
        stm.setObject(1, customer.getId());
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getAddress());
        stm.setObject(4, customer.getSalary());
        
        return stm.executeUpdate()>0;
    }
    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException{
        String SQL = "SELECT * FROM customer WHERE id=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();

        return rst.next()? new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")) : null;
    }
    public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE customer SET name=?,address=?,salary=? WHERE id=?");
            
        stm.setObject(1, customer.getName());
        stm.setObject(2, customer.getAddress());
        stm.setObject(3, customer.getSalary());
        stm.setObject(4, customer.getId());
            
        return stm.executeUpdate()>0;
    }
    public static  boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("DELETE FROM customer WHERE id=?");
        stm.setObject(1, id);
            
        return stm.executeUpdate()>0;
    }
    public static ArrayList<Customer> viewCustomer() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM customer");
        ResultSet rst = stm.executeQuery();
        
        ArrayList<Customer>customerList = new ArrayList<>();
        while (rst.next()) {
            customerList.add(new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary")));   
        }
        return customerList;
    }
}
