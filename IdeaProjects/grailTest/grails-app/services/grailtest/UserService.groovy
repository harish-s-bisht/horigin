package grailtest

import grails.transaction.Transactional

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement

//@Transactional
class UserService {

    def serviceMethod() {

    }
    def void saveUser(User user){
        Connection connection=null;
        PreparedStatement st = null;
        try{
            connection = Class.forName("com.mysql.jdbc.Driver")
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB")
            st = connection.prepareStatement("insert into test(name)values(?)")
            st.setString(1,user.getName())
            st.executeUpdate()
        }
        catch(Exception e){
            println e;
        }
        finally {
            //connection.close();
        }
    }
}
