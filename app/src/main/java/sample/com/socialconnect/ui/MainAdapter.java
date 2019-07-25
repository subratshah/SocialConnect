package sample.com.socialconnect.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sample.com.socialconnect.R;
import sample.com.socialconnect.databinding.ItemMainBinding;
import sample.com.socialconnect.model.Contact;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<Contact> contacts;

    public MainAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        ItemMainBinding itemMainBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_main, viewGroup, false);
        return new ViewHolder(itemMainBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Contact contact = contacts.get(position);
        viewHolder.bind(contact);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMainBinding itemMainBinding;

        public ViewHolder(@NonNull ItemMainBinding itemMainBinding) {
            super(itemMainBinding.getRoot());
            this.itemMainBinding = itemMainBinding;
        }

        public void bind(Contact contact) {
            this.itemMainBinding.setViewModel(contact);
        }
    }
}