package com.guliash.daggerexamples;

import dagger.Subcomponent;

@ScopeA
@Subcomponent
public interface SubcomponentD {

    void inject(MainActivity activity);

}
