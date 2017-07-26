/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author veena jaiswal
 */
public class DatabaseManager {
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public  void getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "eszdb","eszdb");
    }
    //exectenonquery is used to insert /delete/update
    public boolean executeNonQuery(String query) throws ClassNotFoundException, SQLException
    {
    getConnection();
    ps=con.prepareStatement(query); 
  int res=  ps.executeUpdate();
  if(res>0)
      return true;
  else 
      return false;
}
    //the select query method is used to perform select operation
    public ResultSet selectQuery(String query) throws ClassNotFoundException, SQLException
    {
      getConnection();  
      ps=con.prepareStatement(query);
      rs=ps.executeQuery();
      return rs;
    }
}
