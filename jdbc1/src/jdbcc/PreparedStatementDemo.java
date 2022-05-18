package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
PreparedStatement pt=null;
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","admin");
	pt=con.prepareStatement("insert into employee values(?,?,?)");
	pt.setInt(1, 1);
	pt.setString(2, "mayuri");
	pt.setDouble(3, 30000);
	int i=pt.executeUpdate();
	System.out.println("no of rows afffected-"+i);
}
catch(Exception e)
{
	
}
finally {
	try {
		if(pt!=null);
		{
			pt.close();
			pt=null;
		}
		
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	try {
		if(con!=null)
		{
			con.close();
			con=null;
			}
		}catch(Exception e)
	{
			e.printStackTrace();
		}
	try {
		if(con!=null)
		{
			con.close();
			con=null;
		}
	}catch(Exception e) {
	e.printStacTrace();
}
	}

	}
}
