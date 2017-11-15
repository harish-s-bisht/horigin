package grailspractice

import grails.transaction.Transactional

//@Transactional
class ProductService {

    def serviceMethod() {

    }
    List<Product> getAllProducts(){
        List<Product> list = new ArrayList<Product>()
        Product p1 = new Product("POS",1520.50);
        Product p2 = new Product("POS2",1550.50);
        Product p3 = new Product("POS3",1720.50);
        Product p4 = new Product("POS4",1420.50);
        list.add(p1)
        list.add(p2)
        list.add(p3)
        list.add(p4)
        return list
    }
}
