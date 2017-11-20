package e.com

import grails.transaction.Transactional

//@Transactional
class UserService {

    def serviceMethod() {

    }
    def registerUser(User user){
    user.save()
    }
    User findById(int id){
        User user = User.get(id)

    }
}
