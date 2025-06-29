using Microsoft.Data.SqlClient;
using System.Data;

internal class Program
{
    static void Main()
    {
        //Connect();
        //Insert();
        //Insert2(std);
        //InsertWithParams(std);
        //InsertWithStoredProcedure(std);
        //Delete(103);
        Update(104, "Mukesh", 90, "Kumar");
    }

    static void Connect()
    {
        SqlConnection cn = new SqlConnection();
        try {
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DBDemo;Integrated Security=True;";
            cn.Open();
            Console.WriteLine("Success");
        } catch (Exception e) {
            Console.WriteLine(e.StackTrace);
        } finally {
            cn.Close();
        }
    }

    static void Insert()
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DBDemo;Integrated Security=True;";
            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "Insert into Students values(101, 'Nikita', 90, 'Patil')";
            cmd.ExecuteNonQuery();
            Console.WriteLine("Success");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.StackTrace);
        }
        finally
        {
            cn.Close();
        }
    }

    static void Insert2(Student std)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DBDemo;Integrated Security=True;";
            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = $"Insert into Students values({std.StudentId}, '{std.FName}',{std.Marks},'{std.LName}')";
            cmd.ExecuteNonQuery();
            Console.WriteLine("Success");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.StackTrace);
        }
        finally
        {
            cn.Close();
        }
    }

    static void InsertWithParams(Student std)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DBDemo;Integrated Security=True;";
            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = $"Insert into Students values(@Sid, @Fname, @Marks, @Lname)";
            
            cmd.Parameters.AddWithValue("@Sid", std.StudentId);
            cmd.Parameters.AddWithValue("@Fname", std.FName);
            cmd.Parameters.AddWithValue("@Marks", std.Marks);
            cmd.Parameters.AddWithValue("@Lname", std.LName);

            cmd.ExecuteNonQuery();
            Console.WriteLine("Success");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.StackTrace);
        }
        finally
        {
            cn.Close();
        }
    }

    static void InsertWithStoredProcedure(Student std)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DBDemo;Integrated Security=True;";
            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.CommandText = "InsertStudents";

            cmd.Parameters.AddWithValue("@StudentId", std.StudentId);
            cmd.Parameters.AddWithValue("@FName", std.FName);
            cmd.Parameters.AddWithValue("@Marks", std.Marks);
            cmd.Parameters.AddWithValue("@LName", std.LName);

            cmd.ExecuteNonQuery();
            Console.WriteLine("Success");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.StackTrace);
        }
        finally
        {
            cn.Close();
        }
    }

    static void Delete(int StudentId)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DBDemo;Integrated Security=True;";
            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.CommandText = "DeleteStudents";

            cmd.Parameters.AddWithValue("@StudentId", StudentId);

            cmd.ExecuteNonQuery();
            Console.WriteLine("Success");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.StackTrace);
        }
        finally
        {
            cn.Close();
        }
    }

    static void Update(int StudentId, string fname, int marks, string lname)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DBDemo;Integrated Security=True;";
            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.CommandText = "UpdateStudent";

            cmd.Parameters.AddWithValue("@StudentId", StudentId);
            cmd.Parameters.AddWithValue("@FName", fname);
            cmd.Parameters.AddWithValue("@Marks", marks);
            cmd.Parameters.AddWithValue("@LName", lname);

            cmd.ExecuteNonQuery();
            Console.WriteLine("Success");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.StackTrace);
        }
        finally
        {
            cn.Close();
        }
    }

    public class Student {
        public int StudentId { get; set; }
        public string FName { get; set; }
        public decimal Marks { get; set; }
        public string LName { get; set; }
    }
}