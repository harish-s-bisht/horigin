package grailspractice

class ProductController {

    def index() {
        render view:"/product/index"
    }
    def listProducts(){
        List<Product> productList = new ArrayList<Product>()
        ProductService service = new ProductService();
        productList = service.getAllProducts()
//        println productList.size()
        render view:"/product/productList",model:[product:productList]
    }
}
