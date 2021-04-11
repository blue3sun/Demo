package com.android.hilt

interface IStorage {
    fun save()
    fun get(key:String):String
}