package com.guliash.daggerexamples;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleA {

    @Provides
    public String string() {
        return "A";
    }

}
