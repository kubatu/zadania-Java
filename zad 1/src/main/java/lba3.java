import java.sql.*;
import java.util.Random;

public class lba3 {
    public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:mariadb://db.zut.edu.pl/tj44536?useUnicode=true&serverTimezone=UTC","tj44536","pb5UkdyT");
            System.out.println("Połączono!");

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM tablica");

            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString("imie") + " " + rs.getInt(3));
            }

            rs.moveToInsertRow();
            rs.updateString(2, "Bogdan");
            rs.updateInt(3, 24);
            rs.insertRow();
            rs.beforeFirst();

            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString("imie") + " " + rs.getInt(3));
            }

            String[] imiona = new String[] {"Leon","Lucjan","Ludwik","Lech","Maks","Marek","Marcin","Ryszard","Stefan","Oskar","Szymon"};
            PreparedStatement ps = conn.prepareStatement("INSERT INTO tablica (imie,wiek) values (?,?)");

            for (int i=0; i<imiona.length;i++){
                ps.setString(1, imiona[i]);
                ps.setInt(2, new Random().nextInt(100));
                ps.executeUpdate();
            }

        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
