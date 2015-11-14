package com.grass.hello

/**
 * Created by grass on 11/14/15.
 */


def createList(int count) {
    def list = []
    for (index in 0..10) {
        println("index---${index}")
        list.add("index---${index}")
    }
    return list
}

def operateList() {
    list = createList(10)
    list.add('grass')
    list.each {
        println(it)
    }
}
String printName(name){
    println name
}

String printlnList(value) {
    println 'value: '+value
}

def list = createList(10)
println('size: '+list.size())

list.each(this.&printlnList)

def list2 = ['a','b','c']


//方法指针操作符写法
list2.each(this.&printName)

number  = 100;

def printNumber() {
    println 'number: '+number
}

printNumber()

def defClo = {
    key,value->
        println 'key: '+key+' value: '+value
}

defClo.call('name','grass')

defClo('age', '28')


//class User {
//    public final String name
//
//    User(String name) { this.name = name }
//
//    String getName() { "Name: $name" }
//}
//
//def user = new User('Bob')
//
//println user.name
//println '----------------'
//println user.@name