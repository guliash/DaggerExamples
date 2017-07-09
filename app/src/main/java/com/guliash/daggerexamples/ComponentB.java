package com.guliash.daggerexamples;

import dagger.Component;

@ScopeB
@Component(dependencies = ComponentA.class)
public interface ComponentB {

}
