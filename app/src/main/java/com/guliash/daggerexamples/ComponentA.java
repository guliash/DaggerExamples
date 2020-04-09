package com.guliash.daggerexamples;

import dagger.Component;

@Component
public interface ComponentA {
    void inject(MainActivity activity);
}
