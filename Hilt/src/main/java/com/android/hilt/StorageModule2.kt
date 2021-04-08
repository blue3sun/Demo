package com.android.hilt

import androidx.core.app.ActivityCompat
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named

@Module
@InstallIn(ApplicationComponent::class)
class StorageModule2 {
//    @Named("SpStorage")
//    @Provides
//    fun bindSpStorage(spStorage: SpStorage):IStorage{
//        return SpStorage()
//    }
//
//    @Named("DbStorage")
//    @Provides
//    fun bindDbStorage(dbStorage: DbStorage):IStorage{
//        return DbStorage()
//    }
}