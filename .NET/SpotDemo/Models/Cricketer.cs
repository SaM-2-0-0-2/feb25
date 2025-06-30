using Microsoft.Data.SqlClient;
using System.ComponentModel.DataAnnotations;
using System.Data;

namespace SpotDemo.Models
{
    public class Cricketer
    {
        [Key]
        [Range(1, int.MaxValue, ErrorMessage = "ID must be more than zero")]
        public int PlayerId
        {
            get;
            set;
        }

        [Required(ErrorMessage = "Player name is required")]
        public string PlayerName
        {
            get;
            set;
        }

        [Range(0, int.MaxValue, ErrorMessage = "Runs must be zero or more")]
        public int Runs
        {
            get;
            set;
        }

        [Range(0, int.MaxValue, ErrorMessage = "Centuries must be zero or more")]
        public int Centuries
        {
            get;
            set;
        }

        [Range(0, int.MaxValue, ErrorMessage = "Wickets must be zero or more")]
        public int Wickets
        {
            get;
            set;
        }

        [Range(0, int.MaxValue, ErrorMessage = "FiveFors must be zero or more")]
        public int FiveFors
        {
            get;
            set;
        }


        public static List<Cricketer> GetAllPlayers()
        {
            List<Cricketer> cricketers = new List<Cricketer>();
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=Cricketer;Integrated Security=True;";
            
            try {
                cn.Open();
                SqlCommand cmd = cn.CreateCommand();
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "Select * from Players";
                SqlDataReader sdr =  cmd.ExecuteReader();

                while (sdr.Read())
                {
                    Cricketer cr = new Cricketer();
                    cr.PlayerId = sdr.GetInt32("playerId");
                    cr.PlayerName = sdr.GetString("PlayerName");
                    cr.Runs = sdr.GetInt32("Runs");
                    cr.Centuries = sdr.GetInt32("Centuries");
                    cr.Wickets = sdr.GetInt32("Wickets");
                    cr.FiveFors = sdr.GetInt32("FiveFors");
                    cricketers.Add(cr);
                }
                sdr.Close();
            } catch (Exception e) {
                throw new Exception(e.Message);
            } finally {
                cn.Close();
            }
            return cricketers;
        }

        public static Cricketer GetSingleCricketer(int id)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=Cricketer;Integrated Security=True;";
            Cricketer cr = new Cricketer();
            try
            {
                cn.Open();
                SqlCommand cmd = cn.CreateCommand();
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "Select * from Players where PlayerId = @PlayerId";

                cmd.Parameters.AddWithValue("@PlayerId", id);
                SqlDataReader sdr = cmd.ExecuteReader();

                if (sdr.Read())
                {
                    cr.PlayerId = sdr.GetInt32("PlayerId");
                    cr.PlayerName = sdr.GetString("PlayerName");
                    cr.Runs = sdr.GetInt32("Runs");
                    cr.Centuries = sdr.GetInt32("Centuries");
                    cr.Wickets = sdr.GetInt32("Wickets");
                    cr.FiveFors = sdr.GetInt32("FiveFors");
                }
                sdr.Close();
            } catch (Exception e)
            {
                throw new Exception(e.Message); 
            }
            finally
            {
                cn.Close();
            }
            return cr;
        }

        public static void Insert(Cricketer cr)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=Cricketer;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmd = cn.CreateCommand();
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "Insert into Players Values (@PlayerId, @PlayerName, @Runs, @Centuries, @Wickets, @FiveFors)";
                cmd.Parameters.AddWithValue("@PlayerId", cr.PlayerId);
                cmd.Parameters.AddWithValue("@PlayerName", cr.PlayerName); 
                cmd.Parameters.AddWithValue("@Runs", cr.Runs);
                cmd.Parameters.AddWithValue("@Centuries", cr.Centuries);
                cmd.Parameters.AddWithValue("@Wickets", cr.Wickets);
                cmd.Parameters.AddWithValue("@FiveFors", cr.FiveFors);

                cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw new Exception (ex.Message);
            } 
            finally 
            { 
                cn.Close(); 
            }
        }

        public static void Delete(int id)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=Cricketer;Integrated Security=True;";
            
            try
            {
                cn.Open();
                SqlCommand cmd = cn.CreateCommand();
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "Delete from Players where PlayerId = @PlayerId";

                cmd.Parameters.AddWithValue("@PlayerId", id);
                cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        public static void Update(int id, Cricketer cr)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=Cricketer;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand cmd = cn.CreateCommand();
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "Update Players set PlayerName=@PlayerName, Runs=@Runs, Centuries=@Centuries, Wickets=@Wickets, FiveFors=@FiveFors where PlayerId = @PlayerId";


                cmd.Parameters.AddWithValue("@PlayerName", cr.PlayerName);
                cmd.Parameters.AddWithValue("@Runs", cr.Runs);
                cmd.Parameters.AddWithValue("@Centuries", cr.Centuries);
                cmd.Parameters.AddWithValue("@Wickets", cr.Wickets);
                cmd.Parameters.AddWithValue("@FiveFors", cr.FiveFors);
                cmd.Parameters.AddWithValue("@PlayerId", id);

                cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }
    }
}
