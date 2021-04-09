package com.android.dagger_api.component;
import com.android.dagger_api.School;
import com.android.dagger_api.ui.ThirdActivity;

import dagger.Subcomponent;

@Subcomponent
public interface SubSchoolComponent {
    School getSchool();

    void inject(ThirdActivity thirdActivity);

    @Subcomponent.Builder
    interface Builder {
        SubSchoolComponent build();
    }
}


//@Subcomponent
//public interface SubSchoolComponent {
//    School getSchool();
//
//    void inject(ThirdActivity thirdActivity);
//}