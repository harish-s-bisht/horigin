package com.src.groovy

class SerializeObject {
    static final String DIR_NAME="/home/harish/RWhere"
static void main(agrs){
    Emp emp = new Emp("Harish");
    File file=null;
    try{
        file = new File(DIR_NAME,'serializable.txt')
        file.withObjectOutputStream {out->
            out.writeObject(emp)

        }
        file.withObjectInputStream {inp->
            Emp empObj = inp.readObject()
             assert empObj.name==emp.name
            println empObj.name
        }
    }
    catch(Exception e){
        println e;
    }
}

}

class Emp implements  Serializable{
    private String name;
    def Emp(String name){
        this.name = name;
    }
}
