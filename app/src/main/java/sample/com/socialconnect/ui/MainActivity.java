package sample.com.socialconnect.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import sample.com.socialconnect.viewModel.ContactViewModel;
import sample.com.socialconnect.R;
import sample.com.socialconnect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    @Inject
    ContactViewModel contactViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidInjection.inject(this);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        this.getLifecycle().addObserver(contactViewModel);

        activityMainBinding.setViewModel(contactViewModel);
    }
}
