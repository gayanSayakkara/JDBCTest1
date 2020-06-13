package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import thogakade.DBConnection;

public class ItemController {
    
    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO item VALUES(?,?,?,?)");
        stm.setObject(1, item.getCode());
        stm.setObject(2, item.getDescription());
        stm.setObject(3, item.getUnitPrice());
        stm.setObject(4, item.getQtyOnHand());
            
        return stm.executeUpdate()>0;
    }
    public static Item searchItem(String code) throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM item WHERE code=?");
        stm.setObject(1, code);
        ResultSet resultSet = stm.executeQuery();
    
        return resultSet.next() ? new Item(resultSet.getString("code"), resultSet.getString("description"), resultSet.getDouble("unitPrice"), resultSet.getInt("qtyOnHand")) : null;
    }
    public static boolean updateItem(Item item) throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE item SET description=?,unitprice=?,qtyOnHand=? WHERE code=?");
        stm.setObject(4, item.getCode());
        stm.setObject(1, item.getDescription());
        stm.setObject(2, item.getUnitPrice());
        stm.setObject(3, item.getQtyOnHand());
        
        return stm.executeUpdate()>0;
    }
    public static boolean deleteCustomer(String code) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("DELETE FROM item WHERE code=?");
        stm.setObject(1, code);
        
        return stm.executeUpdate()>0;
    }
    public static ArrayList<Item> viewItem() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM item");
        ResultSet rst = stm.executeQuery(); 
        ArrayList<Item>itemList = new ArrayList<>();
        
        while (rst.next()) {            
            itemList.add(new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand")));
        }
        return itemList;
        }
}
