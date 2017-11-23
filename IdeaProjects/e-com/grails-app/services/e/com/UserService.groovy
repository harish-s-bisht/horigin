package e.com

import e.domain.User

//@Transactional
class UserService {

    def serviceMethod() {

    }
    def registerUser(User user){
    user.save()
    }

    User getByIds(int id){
        User user = User.get(id)

    }
}
