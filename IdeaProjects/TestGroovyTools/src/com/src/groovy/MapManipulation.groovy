package com.src.groovy

class MapManipulation {
    static void main(agrs){
        def employee = [
                1:[name:'Harish Singh',gender:"M"],
                2:[name:"Prakash Mehra",gender:"M"],
                3:[name:"Abhilasha",gender:"F"],
                4:[name:"Divya Bisht",gender:"F"]
        ]
        def maleMap = employee.findAll{
            it.value.gender=="M"
        }

        def femaleMAp = employee.findAll{
            it.value.gender=="F"
        }
        maleMap.each{entry->
            println "${entry.key} ${entry.value}"
        }
    }
}
