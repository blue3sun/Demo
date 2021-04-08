package com.android.hilt

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

public class DbStorage @Inject constructor():IStorage {
    override fun save() {
        Log.i("Hilt","DbStorage save()")
    }

    override fun get(key: String): String {
        Log.i("Hilt","DbStorage save()")
        return key
    }
}