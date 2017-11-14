package com.src.groovy

class WritingInFile {
    final static String BASE_DIR="/home/harish/RWhere/";
    static void main(args){
        def os=null
        try {
            os = new File(BASE_DIR,'test.txt').withOutputStream {stream->
                stream.withWriter {writer->
                    writer.append("Written With OutputStream")
                }
            }
        }
        catch(any){
               println any
          }
        finally {
        }

    }
}
