package sample.com.socialconnect;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sample.com.socialconnect.Object.Contact;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Contact> contacts;

    RecyclerAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        RecyclerviewItemBinding recyclerviewItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.contactlist_item, viewGroup, false);
        return new ViewHolder(recyclerviewItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder viewHolder, int i) {
        Contact contact = contacts.get(i);
        viewHolder.bind(contact);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerviewItemBinding recyclerviewItemBinding;

        public ViewHolder(@NonNull RecyclerviewItemBinding recyclerviewItemBinding) {
            super(recyclerviewItemBinding.getRoot());
            this.recyclerviewItemBinding = recyclerviewItemBinding;
        }

        public void bind(Contact contacts) {
            recyclerviewItemBinding.setContact(contacts);
        }
    }
}