package grailspractice

import grails.transaction.Transactional

import java.sql.*;

//@Transactional
class ProductService {

    def serviceMethod() {

    }
    List<Product> getAllProducts(){


        List<Product> list = new ArrayList<Product>()
        def criteria = Product.createCriteria()
        list = criteria.list {
            gt("id",0L)
        }
       return list
    }

    def addProduct(Product product){
        product.save(flush: true)
        if(!product.save()){
            product.errors.allErrors.each{
                println it
            }
        }

    }
}
