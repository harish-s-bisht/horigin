package grailspractice

import grails.converters.JSON
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
        EMIs emIs = new EMIs()
        emIs.@amount=Float.parseFloat(params.amount)
        emIs.@product = product
        emIs.@mop=params.mop
        Set<EMIs> emiSet = new HashSet<EMIs>()
        emiSet.add(emIs)
        product.setEmis(emiSet)
        //        EMIs emi = new EMIs()
//        product.getEmi().setMop(params.mop)
//        product.getEmi().setAmount(Float.parseFloat(params.amount))

        service.addProduct(product)
        render view:"/product/index"
    }
    def listProductsAjax(){

        List<Product> productList = new ArrayList<Product>()
        String columnName = params.columnName;
        String order = params.order;
        productList = service.getAjax(columnName,order)
        render productList as JSON
    }
}
