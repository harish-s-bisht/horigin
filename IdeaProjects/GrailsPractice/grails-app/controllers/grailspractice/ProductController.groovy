package grailspractice

import org.springframework.beans.factory.annotation.Autowired

class ProductController {
    @Autowired
    ProductService service
    def index() {
        render view:"/product/index"
    }
    def listProducts(){

        List<Product> productList = new ArrayList<Product>()
        productList = service.getAllProducts()
            render view:"/product/productList",model:[product:productList]
    }
    def addProduct(){
        Float price = Float.parseFloat(params.price)
        Product product = new Product()
        product.@name=params.name
        product.@price=price
        service.addProduct(product)
        render view:"/product/index"
    }
}
