using Microsoft.Data.SqlClient;
using System.Data;
internal class Program { 
    static void Main()
    {
        //Connect();
        //Insert();
        //Employee emp = new Employee {EmpNo=10, Name="Ravi" ,Basic=50000, DeptNo=20};
        Employee emp = new Employee {EmpNo=109, Name="Alfie D'Melo" ,Basic=5000, DeptNo=10};
        InsertWithStoredProcedure(emp);
    }
    static void Connect()
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            //Data Source=(localdb)\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True;Connect Timeout=30;Encrypt=False;Trust Server Certificate=False;Application Intent=ReadWrite;Multi Subnet Failover=False
            //cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;User Id=sa;Password=sa";
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True";

            cn.Open();
            Console.WriteLine("success");
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
        finally
        {
            cn.Close();
        }
    }

    static void Insert()
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            //Data Source=(localdb)\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True;Connect Timeout=30;Encrypt=False;Trust Server Certificate=False;Application Intent=ReadWrite;Multi Subnet Failover=False
            //cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;User Id=sa;Password=sa";
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True";

            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.Connection = cn;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = "Insert into Employees values(106, 'VIKRAM', 25000, 30)";
            cmd.ExecuteNonQuery();
            Console.WriteLine("success");
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
        finally
        {
            cn.Close();
        }
    }

    static void Insert2(Employee emp)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            //Data Source=(localdb)\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True;Connect Timeout=30;Encrypt=False;Trust Server Certificate=False;Application Intent=ReadWrite;Multi Subnet Failover=False
            //cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;User Id=sa;Password=sa";
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True";

            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.Connection = cn;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = $"Insert into Employees values({emp.EmpNo}, '{emp.Name}', {emp.Basic}, {emp.DeptNo})";
            cmd.ExecuteNonQuery();
            Console.WriteLine("success");
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
        finally
        {
            cn.Close();
        }
    }

    static void InsertWithParams(Employee emp)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            //Data Source=(localdb)\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True;Connect Timeout=30;Encrypt=False;Trust Server Certificate=False;Application Intent=ReadWrite;Multi Subnet Failover=False
            //cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;User Id=sa;Password=sa";
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True";

            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.Connection = cn;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = "Insert into Employees values(@EmpNo, @Name, @Basic, @DeptNo)";

            cmd.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
            cmd.Parameters.AddWithValue("@Name", emp.Name);
            cmd.Parameters.AddWithValue("@Basic", emp.Basic);
            cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);

            cmd.ExecuteNonQuery();
            Console.WriteLine("success");
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
        finally
        {
            cn.Close();
        }
    }

    static void InsertWithStoredProcedure(Employee emp)
    {
        SqlConnection cn = new SqlConnection();
        try
        {
            //Data Source=(localdb)\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True;Connect Timeout=30;Encrypt=False;Trust Server Certificate=False;Application Intent=ReadWrite;Multi Subnet Failover=False
            //cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;User Id=sa;Password=sa";
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JKJune25;Integrated Security=True";

            cn.Open();
            SqlCommand cmd = cn.CreateCommand();
            cmd.Connection = cn;
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.CommandText = "InsertEmployee";

            cmd.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
            cmd.Parameters.AddWithValue("@Name", emp.Name);
            cmd.Parameters.AddWithValue("@Basic", emp.Basic);
            cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);

            cmd.ExecuteNonQuery();
            Console.WriteLine("success");
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
        finally
        {
            cn.Close();
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
    }
}