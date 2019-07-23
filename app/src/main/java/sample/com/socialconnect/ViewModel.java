package sample.com.socialconnect;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import sample.com.socialconnect.Object.Contact;
import sample.com.socialconnect.Object.Duo;
import sample.com.socialconnect.Object.Email;
import sample.com.socialconnect.Object.Viber;
import sample.com.socialconnect.Object.WhatsApp;

public class MainViewModel extends ViewModel implements LifecycleObserver {

    List<Contact> contacts = new ArrayList<>();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void init() {
        Contact ram = new Contact("Ram", "Viber");
        Viber viber = new Viber(R.drawable.ic_launcher_foreground, "V01", "2m ago");
        ram.setViber(viber);
        contacts.add(ram);

        Contact ramesh = new Contact("Ramesh", "Email");
        Email email = new Email("ramesh@gmail.com");
        Duo duo = new Duo(false);
        ramesh.setEmail(email);
        ramesh.setDuo(duo);
        contacts.add(ramesh);

        Contact suresh = new Contact("Suresh", "WhatsApp");
        WhatsApp whatsApp = new WhatsApp(true);
        contacts.add(suresh);
    }
}
