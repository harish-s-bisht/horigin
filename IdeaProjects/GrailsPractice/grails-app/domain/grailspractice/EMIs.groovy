package grailspractice

class EMIs implements Serializable{
    String mop;
    Float amount;
    static belongsTo = [product:Product]

    static constraints = {
    }
}
