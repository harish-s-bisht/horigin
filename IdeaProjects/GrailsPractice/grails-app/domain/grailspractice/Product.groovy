package grailspractice

class Product implements Serializable {
    String name
    Float price
    static hasMany = [emis:EMIs]
    static constraints = {
    }
}
