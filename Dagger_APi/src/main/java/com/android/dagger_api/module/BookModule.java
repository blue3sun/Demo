package com.android.dagger_api.module;

import com.android.dagger_api.Book;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class BookModule {

//    @DevQualifier
    @Named("Dev")
    @Provides
    Book getDevBook(){
        return new Book("语文");
    }

//    @TestQualifier
    @Named("Test")
    @Provides
    Book getTestBook(){
        return new Book("数学");
    }

    @Provides
    String getBookName(){
        return "英语";
    }
}
