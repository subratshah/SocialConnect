package sample.com.socialconnect.DependencyInjection;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import sample.com.socialconnect.Object.SocailApplication;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
        AppModule.class
})
interface AppComponent extends AndroidInjector<SocailApplication> {

}
