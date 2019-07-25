package sample.com.socialconnect.model;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import sample.com.socialconnect.ui.DetailAdapter;

public class Contact extends ViewModel implements LifecycleObserver {

    public List<App> apps = new ArrayList<>();
    public DetailAdapter detailAdapter;

    private String name;

    @Inject
    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}