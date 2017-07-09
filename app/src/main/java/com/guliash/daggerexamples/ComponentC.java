package com.guliash.daggerexamples;

import dagger.Component;

@ScopeC
@Component(dependencies = ComponentB.class)
public interface ComponentC {

    SubcomponentD plus();

}
