package com.src.groovy

class ReadFromFile {
    final static String BASE_DIR="/home/harish/RWhere/";
    static void main(agrs){
        File file=new File(BASE_DIR+'test.txt')
        try{
        new File(BASE_DIR,'test.txt').eachLine {line ,nb->
            println "${nb} ${line}"
        }
        }catch(any){
            println "No Such File.."
        }
       /* byte []fileByte = file.getBytes();
        fileByte.each {item->
            println item;
        }*/
        def list = file.collect{it}
        list.eachWithIndex { String item, int i ->
            println "${i} ${item}"
        }
        new File(BASE_DIR,'test.txt').withInputStream {ins->
           ins.eachLine {line->
                println line
            }
        }
        new File(BASE_DIR,'test.txt').withWriter('utf-8') {writer->
            writer.write("Hello from Groovy console")
            writer.append("\n New Line Appended")
        }
        new File(BASE_DIR,'test.txt') << '''\n Multiline text 
Nth line
            '''
    }
}
