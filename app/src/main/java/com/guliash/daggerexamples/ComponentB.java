package com.guliash.daggerexamples;

import dagger.Subcomponent;

@Subcomponent(modules = ModuleB.class)
public interface ComponentB {
    void inject(MainActivity activity);
}
