package e.com

import grails.converters.JSON
import org.springframework.beans.factory.annotation.Autowired

class UserController {
    @Autowired
            UserService service

    def index() {
        render view:"user/register"
    }

    def register(){
    User user = new User()
        bindData(user,params)
        println user.validate()
        if(user.validate()) {
            service.registerUser(user)
            def list = ["SUCCESS"]
            render view: "register", model: [msg: list]
        }
    }

    def find(){
        int id = Integer.parseInt(params.id)
        User user = service.findById(id)
        List<User> userList = new ArrayList<User>()
        userList.add(user)
        render userList as JSON

    }
}
