package bookstore

class BookController {
    def bookService
    def index() { }

    def create(){
        def book = bookService.createBook()
        render view:"index"
    }
    def listBook(){
        List<Auther> list = bookService.listBook()
        render (view: "list",model: [booklist:list])
    }
    def delete(){
        int id = Integer.parseInt(params.id)
        bookService.delete(id)
        render view:"index"
    }
}

