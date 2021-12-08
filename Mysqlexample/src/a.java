import java.sql.*;
public class a
{
	public static void main(String[] args)
	{
		Connection con;
		Statement s;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gyro","root","");
			s=con.createStatement();
			ResultSet r;
			r=s.executeQuery("Select * from emp");
			while(r.next())
			{
				System.out.println(r.getString("ename")+"\t"+r.getString("designation")+"\t"+r.getString("city")+"\t"+r.getString("state")+"\t"+r.getString("country")+"\t"+r.getInt("slno"));
			}
			/*
			 * String f; //insertion
			 * f="insert into emp values('Ravindra','Trainer','Mysore','Karataka','+91')";
			 * s.executeUpdate(f); r=s.executeQuery("Select * from emp"); while(r.next()) {
			 * System.out.println(r.getString("name")+"\t"+r.getString("designation")+"\t"+r
			 * .getString("city")+"\t"+r.getString("state")+"\t"+r.getString("country")+"\t"
			 * +r.getInt("country")); } //deletion
			 * f="delete from emp where name='Ravindra'"; s.executeUpdate(f);
			 * r=s.executeQuery("Select * from emp"); while(r.next()) {
			 * System.out.println(r.getString("name")+"\t"+r.getString("designation")+"\t"+r
			 * .getString("city")+"\t"+r.getString("state")+"\t"+r.getString("country")+"\t"
			 * +r.getInt("country")); }
			 */
			con.close();
			/*
			 * if(con!=null) 
			 * {
			 * 		System.out.println("Connected");
			 * }
			 * else
			 * {
			 * 		System.out.println("Not Connected");
			 * }
			 */
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}