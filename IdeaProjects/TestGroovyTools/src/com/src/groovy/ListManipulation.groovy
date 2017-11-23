package com.src.groovy

class ListManipulation {
    static void main(args){
        def list=[1,2,3,4,5]
        Scanner scan = new Scanner(System.in)
        int num=0;
        println "Enter Number To Be Searched.."
        num = scan.nextInt()
        if(list.find{it==num}){
            println "Given No Found At : "
            println list.findIndexOf{it in [num]}
        }else{
            println "No Such Element Found.."
        }
        def strList = ["harish","Singh"]
        println strList*.toUpperCase()

        def subList = list[1,2]
        subList.each {
            println it
        }

    }
}
