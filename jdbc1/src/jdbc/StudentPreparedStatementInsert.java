package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentPreparedStatementInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
PreparedStatement pt=null;
try
{
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","admin");
	pt=con.prepareStatement("insert into student1 values(?,?,?)");
	pt.setInt(1, 2);
	pt.setString(2, "Priti");
	pt.setInt(3, 30);
	boolean i=pt.execute();
	System.out.println("no of rows affected:"+i);
	System.out.println("rows inserted successfully");
	
}
catch(Exception e)
{
	System.out.println(e);
}
finally
{
	try
	{
		if(pt!=null)
		{
			pt.close();
			pt = null;
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	try {
		if(con!=null)
		{
			con.close();
			con=null;
		}
			
			
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	}
}
