package com.grass.hello

/**
 * Created by grass on 11/14/15.
 */

def initMap() {
    def map = [:]
    map.name = 'grass'
    map.age = '28'
    map.company = 'baidu'
    map.honey = 'honey'
    map.home = 'shandong'
    return map
}

def iteratorMap() {
    map = initMap()
    map.each {
        println(it.key + ' ' + it.value)
    }
}

def iteratorMap(Map map) {
    map.each {
        println(it.key + ' ' + it.value)
    }
}

def testBasicMethod() {
    map = initMap()
    println('size: ' + map.size())
    map.sex = 'male'
    iteratorMap(map)
}

testBasicMethod()


