package sample.com.socialconnect.DependencyInjection;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import sample.com.socialconnect.MainActivity;

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity providesMainActivity();
}
