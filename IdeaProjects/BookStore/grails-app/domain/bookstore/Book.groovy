package bookstore

class Book {
    String title
    String isbn
    static belongsTo = [auther:Auther]
    def Book(String title,String isbn){
        this.title = title
        this.isbn = isbn
    }
    static constraints = {
    }
}
