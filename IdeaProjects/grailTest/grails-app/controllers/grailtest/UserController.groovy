package grailtest

import java.sql.*;
class UserController {

    def index() { }
    def saveUser(){
        User user = new User()
        user.name = "Harish"
        UserService service = new UserService()
        service.saveUser(user)

       render(view:"user",model: [user :user])

    }
}
