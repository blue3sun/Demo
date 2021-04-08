package com.android.hilt

public interface IStorage {
    fun save()
    fun get(key:String):String
}