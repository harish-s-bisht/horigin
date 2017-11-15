package grailspractice

class Product {
    private String productName
    private Float price

        def Product(String productName,Float price){
            this.productName=productName
            this.price = price


        }
    static constraints = {
    }
}
