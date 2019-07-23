package sample.com.socialconnect;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sample.com.socialconnect.Object.Contact;
import sample.com.socialconnect.databinding.ContactlistItemBinding;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Contact> contacts;

    RecyclerAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContactlistItemBinding contactlistItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.contactlist_item, parent, false);
        return new ViewHolder(contactlistItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.bind(contact);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ContactlistItemBinding contactlistItemBinding;

        public ViewHolder(@NonNull ContactlistItemBinding contactlistItemBinding) {
            super(contactlistItemBinding.getRoot());
            this.contactlistItemBinding = contactlistItemBinding;
        }

        public void bind(Contact contact) {
            this.contactlistItemBinding.setViewModel(contact);
        }
    }
}