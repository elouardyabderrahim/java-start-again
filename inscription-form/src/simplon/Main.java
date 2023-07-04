package simplon;


import simplon.config.DbConnection;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = DbConnection.connectToDb();
        //String sql="INSERT INTO ETUDIANT(etudiantID ,nom ,prenom ,email , adresse , ville, pays ) values (2,'omar','dbaa','user.user@gmail.com','hay salam ait iaza','tarodant','maroc');";
        String sql="SELECT * FROM ETUDIANT";
try {
    Statement stmt = conn.createStatement();

    ResultSet resultSet=stmt.executeQuery(sql);
    while(resultSet.next()){
        System.out.println("id :" + resultSet.getInt("etudiantID"));
        System.out.println("id :" + resultSet.getString("prenom"));
        System.out.println("-----------------_____________-----------------");


    }

    conn.close();
}



catch(SQLException e){
    System.out.println ( e.getSQLState());
    System.out.println(e);
};


    }
}
