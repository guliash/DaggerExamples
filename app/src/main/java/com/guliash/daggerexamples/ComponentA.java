package com.guliash.daggerexamples;

import dagger.Component;

@Component(modules = ModuleA.class)
public interface ComponentA {
    void inject(MainActivity activity);

    ComponentB plus();
}
