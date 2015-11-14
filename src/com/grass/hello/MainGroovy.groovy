package com.grass.hello
/**
 * Created by grass on 11/14/15.
 */

def testList() {
    def helloList = new HelloList()
    def list = helloList.createList(10)
    list.each {
        println it
    }
}

def main() {
//    testList()
    helloList = new HelloList()
    def list = helloList.createList(10)
    list = list + 'grass'
    list.each {
        println(it)
    }
}

main()