package sample.com.socialconnect.dependencyInjection;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import sample.com.socialconnect.ui.MainActivity;

@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract MainActivity providesMainActivity();
}
