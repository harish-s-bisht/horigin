package e.com

class User {
    String name
    String role
    String email
    String password
    static constraints = {
        name blank: false,nullable: false
        role blank: false,nullable: false
        email blank: false,nullable: false
        password blank: false,nullable: false
    }



}
