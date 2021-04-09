package com.android.dagger_api.module;


import com.android.dagger_api.ClassRoom;
import com.android.dagger_api.PlayGround;
import com.android.dagger_api.component.SubSchoolComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {SubSchoolComponent.class})
public class PlaceModule {

    @Provides
    ClassRoom getClassRoom(){
        return new ClassRoom();
    }

    @Provides
    PlayGround getPlayGround(){
        return new PlayGround();
    }

}

//@Module
//public class PlaceModule {
//
//    @Provides
//    ClassRoom getClassRoom(){
//        return new ClassRoom();
//    }
//
//    @Provides
//    PlayGround getPlayGround(){
//        return new PlayGround();
//    }
//
//}
