package sample.com.socialconnect.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import sample.com.socialconnect.R;
import sample.com.socialconnect.databinding.ActivityDetailBinding;
import sample.com.socialconnect.model.Contact;

public class DetailActivity extends AppCompatActivity {

    @Inject
    Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        AndroidInjection.inject(this);
        ActivityDetailBinding activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        activityDetailBinding.setViewModel(contact);
    }
}
