package com.android.hilt

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


class SpStorage @Inject constructor() : IStorage {
    override fun save() {
        Log.i("Hilt", "SpStorage save()")
    }

    override fun get(key: String): String {
        Log.i("Hilt", "SpStorage get()")
        return key
    }
}