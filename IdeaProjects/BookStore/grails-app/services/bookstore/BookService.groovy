package bookstore

import grails.transaction.Transactional

@Transactional
class BookService {

    def serviceMethod() {

    }
    def createBook(){
        def book = new Auther("Harish")
        .addToBook(new Book("harish","isbn-1234"))
        .addToBook(new Book("xyz","isbn-4545"))
        .save()

    }
    List<Auther> listBook(){
        List<Auther> autherList =  Auther.findAll()
        return autherList
    }
    def delete(int id){
        Auther a = Auther.get(id)
        a.delete()

    }
}
