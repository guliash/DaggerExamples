package com.guliash.daggerexamples;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleB {

    @Provides
    public String string() {
        return "B";
    }

}
