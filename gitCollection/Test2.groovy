import java.sql.*;
import groovy.sql.*;
class Test{
static void main(agrs){
String URL='jdbc:mysql://localhost:3306/testDB';
String username='root'
String password='admin'
def connection = Sql.newInstance(URL,username,password)
}
}
