package bookstore

class Auther {
    String name
    List book
    static hasMany = [book:Book]
    def Auther(String name){
        this.name = name
    }
    static mapping = {
        book lazy: false
    }
    static constraints = {
    }
}
