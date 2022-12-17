package sample.com.socialconnect.viewModel;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import sample.com.socialconnect.R;
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
        ram.setApp("viber");
        ram.setViberId("V01");
        ram.setImage(R.drawable.ic_viber);
        ram.setLastSeen("Last seen Yesterday");
        contacts.add(ram);

        Contact ramesh = new Contact("Ramesh");
        ramesh.setApp("email");
        ramesh.setEmail("ramesh@email.com");
        contacts.add(ramesh);

        Contact ramesh2 = new Contact("Ramesh");
        ramesh2.setApp("duo");
        ramesh2.setAvailability("Offline");
        contacts.add(ramesh2);

        Contact someone = new Contact("Suresh");
        someone.setApp("facebook");
        someone.setAvailability("Online");
        contacts.add(someone);

        Contact suresh = new Contact("Suresh");
        suresh.setApp("whatsapp");
        suresh.setAvailability("Online");
        contacts.add(suresh);

        mainAdapter = new MainAdapter(contacts);
    }

    public MainAdapter getAdapter() {
        return new MainAdapter(contacts);
    }
}
