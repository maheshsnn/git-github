package JDBC_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SQL_Connector {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Throwable 
	{
		
     Class.forName("");
     Connection conn=DriverManager.getConnection("", "", "");
     Statement st=conn.createStatement();
     ResultSet r=st.executeQuery("select*from calende");
     
     @SuppressWarnings("rawtypes")
	ArrayList al=new ArrayList();
     
     while(r.next())
     {
    	 System.out.println(r.getInt(1)+""+r.getString(2));
    	 
    	 al.add(r.getInt(1)+""+r.getString(2));
    	 
     }
		
	}

}
