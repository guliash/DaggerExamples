package com.guliash.daggerexamples;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

public class MainActivity extends Activity {

    @Inject
    Integer integer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidInjection.inject(this);

        System.out.println("Log " + integer);
    }
}

@Subcomponent(modules = ActivityModule.class)
interface ActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainActivity> {}
}

@Module
class ActivityModule {
    @Provides
    public Integer provideInteger() {
        return 42;
    }
}

@Module
abstract class ActivityLinkingModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?> bindYourAndroidInjectorFactory(ActivitySubcomponent.Factory factory);
}