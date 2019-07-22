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

public class MainViewModel extends ViewModel implements LifecycleObserver {

    List<Contact> contacts = new ArrayList<>();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void init() {
        Contact ram = new Contact("Ram", "Viber");
        Viber viber = new Viber(R.drawable.ic_launcher_foreground, "V1", "Yesterday");
        ram.setViber(viber);
        contacts.add(ram);

        Email email = new Email("ramesh@gmail.com");
        Contact ramesh = new Contact("Ramesh", "Email");
        ramesh.setEmail(email);
        contacts.add((ramesh);

        Duo duo = new Duo(true);
        contacts.add(new Contact("Ramesh", "Duo", ramesh));
    }
}
