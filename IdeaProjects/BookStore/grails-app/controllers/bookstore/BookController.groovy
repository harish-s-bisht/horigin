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
    def byTitle(){
        String title = params.title
        List<Book> book = bookService.byTitle(title)
        render (view: "listB",model: [bookList:book])
    }
}

