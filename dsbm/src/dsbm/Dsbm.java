/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsbm;
import java.sql.*;
/**
 *
 * @author george sismar
 */
public class Dsbm {
    public static String username="";
    public static Boolean isAdmin=false;
    public static int empId;
    public static int studid;
    
    //Connection string
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost:3307/testdb";
    

    private String user = "root";
    private String password="chrissy131534224";
    
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
     public Dsbm(){
                openDatabase();
        }
    public void openDatabase()
    {
        try
        {   
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            conn = DriverManager.getConnection(DB_URL,user,password);	            
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            if(!conn.isClosed())
            {
               
                 System.out.println("Database Connection Successful!");
               
            }
            else
            {
            
                
             System.out.print("Database Connection Error! \nPlease Contact Mr. George Sismar");
            
            }
        
        }
        catch(Exception e)
                {
                
                }
    
    
    
    }
    //End Connection string
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        //connection.openDatabase();
        
        new Dsbm();
        
    }
    
}
