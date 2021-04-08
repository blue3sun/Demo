package com.android.hilt

import androidx.core.app.ActivityCompat
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
public abstract class StorageModule {
    @ActivityScoped
    @Named("SpStorage")
    @Binds
    abstract fun bindSpStorage(spStorage: SpStorage):IStorage

    @ActivityScoped
    @Named("DbStorage")
    @Binds
    abstract fun bindDbStorage(dbStorage: DbStorage):IStorage
}