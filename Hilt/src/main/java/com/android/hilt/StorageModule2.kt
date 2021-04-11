package com.android.hilt

import androidx.core.app.ActivityCompat
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule2 {
    @Singleton
    @Named("SpStorage")
    @Provides
    fun bindSpStorage(spStorage: SpStorage):IStorage{
        return SpStorage()
    }

    @Named("DbStorage")
    @Provides
    fun bindDbStorage(dbStorage: DbStorage):IStorage{
        return DbStorage()
    }
}