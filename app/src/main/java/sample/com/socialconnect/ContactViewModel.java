package sample.com.socialconnect;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import sample.com.socialconnect.model.App;
import sample.com.socialconnect.model.Contact;
import sample.com.socialconnect.ui.MainAdapter;

public class ContactViewModel extends ViewModel implements LifecycleObserver {

    public List<Contact> contacts = new ArrayList<>();
    public MainAdapter mainAdapter;

    @Inject
    public ContactViewModel() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void init() {

        Contact ram = new Contact("Ram");
        App viber = new App(R.drawable.ic_viber, "V01", "Online: 2m ago", "Viber");
        ram.apps.add(viber);

        Contact ramesh = new Contact("Ramesh");
        App email = new App(null, "ramesh@gmail.com", null, "Email");
        ram.apps.add(email);
        App duo = new App(null, "ramesh@duo", "Offline", "Duo");
        ram.apps.add(duo);

        Contact suresh = new Contact("Suresh");
        App whatsapp = new App(R.drawable.ic_viber, "V01", "Online", "Whatsapp");
        ram.apps.add(whatsapp);

        mainAdapter = new MainAdapter(contacts);
    }
}
