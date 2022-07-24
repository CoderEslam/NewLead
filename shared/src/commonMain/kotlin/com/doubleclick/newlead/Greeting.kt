package com.doubleclick.newlead

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}