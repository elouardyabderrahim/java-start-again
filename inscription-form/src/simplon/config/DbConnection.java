package simplon.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;


/*
<--Common JDBC Components-->

 The JDBC API provides the following interfaces and classes −

DriverManager −
 This class manages a list of database drivers. Matches connection requests from the java application with the proper database driver using communication sub protocol. The first driver that recognizes a certain subprotocol under JDBC will be used to establish a database Connection.

Driver −
 This interface handles the communications with the database server. You will interact directly with Driver objects very rarely. Instead, you use DriverManager objects, which manages objects of this type. It also abstracts the details associated with working with Driver objects.

Connection −
  This interface with all methods for contacting a database. The connection object represents communication context, i.e., all communication with database is through connection object only.

Statement −
 You use objects created from this interface to submit the SQL statements to the database. Some derived interfaces accept parameters in addition to executing stored procedures.

ResultSet −
 These objects hold data retrieved from a database after you execute an SQL query using Statement objects. It acts as an iterator to allow you to move through its data.

SQLException −
 This class handles any errors that occur in a database application.
 */


public class DbConnection {

    static final String jdbcUrl = "jdbc:postgresql://localhost:5432/brief-four";

    static final String username = "postgres";

    static final String password = "admin";
    static Connection connection = null;


    public static Connection connectToDb() {
        if (connection != null) {
            return connection;
        } else {
            try {
                connection = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("connected to database!");
            } catch (SQLException e) {
                System.out.println("fail to connect to database!");

                e.printStackTrace();
            }
            return connection;
        }
    }


}
