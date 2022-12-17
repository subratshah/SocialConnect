package sample.com.socialconnect.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sample.com.socialconnect.databinding.ItemDuoBinding;
import sample.com.socialconnect.databinding.ItemEmailBinding;
import sample.com.socialconnect.databinding.ItemInvalidBinding;
import sample.com.socialconnect.databinding.ItemViberBinding;
import sample.com.socialconnect.databinding.ItemWhatsappBinding;
import sample.com.socialconnect.viewModel.Contact;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Contact> contacts;

    public MainAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getItemViewType(int position) {
        return contacts.get(position).getContact_type();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {

            case 1:
                ItemDuoBinding itemDuoBinding = ItemDuoBinding.inflate(layoutInflater, viewGroup, false);
                return new DuoHolder(itemDuoBinding);
            case 2:
                ItemEmailBinding itemEmailBinding = ItemEmailBinding.inflate(layoutInflater, viewGroup, false);
                return new EmailHolder(itemEmailBinding);
            case 3:
                ItemWhatsappBinding itemWhatsappBinding = ItemWhatsappBinding.inflate(layoutInflater, viewGroup, false);
                return new WhatsappHolder(itemWhatsappBinding);
            case 4:
                ItemViberBinding itemViberBinding = ItemViberBinding.inflate(layoutInflater, viewGroup, false);
                return new ViberHolder(itemViberBinding);
        }
        ItemInvalidBinding itemInvalidBinding = ItemInvalidBinding.inflate(layoutInflater, viewGroup, false);
        return new InvalidHolder(itemInvalidBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (holder.getItemViewType()) {

            case 1:
                DuoHolder duoHolder = (DuoHolder) holder;
                duoHolder.bind(contacts.get(position));
                break;
            case 2:
                EmailHolder emailHolder = (EmailHolder) holder;
                emailHolder.bind(contacts.get(position));
                break;
            case 3:
                WhatsappHolder whatsappHolder = (WhatsappHolder) holder;
                whatsappHolder.bind(contacts.get(position));
                break;
            case 4:
                ViberHolder viberHolder = (ViberHolder) holder;
                viberHolder.bind(contacts.get(position));
                break;
            default:
                InvalidHolder invalidHolder = (InvalidHolder) holder;
                invalidHolder.bind(contacts.get(position));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class DuoHolder extends RecyclerView.ViewHolder {
        ItemDuoBinding itemDuoBinding;

        public DuoHolder(@NonNull ItemDuoBinding itemDuoBinding) {
            super(itemDuoBinding.getRoot());
            this.itemDuoBinding = itemDuoBinding;
        }

        public void bind(Contact contact) {
            itemDuoBinding.setViewModel(contact);
            itemDuoBinding.executePendingBindings();
        }
    }

    public class EmailHolder extends RecyclerView.ViewHolder {
        ItemEmailBinding itemEmailBinding;

        public EmailHolder(@NonNull ItemEmailBinding itemEmailBinding) {
            super(itemEmailBinding.getRoot());
            this.itemEmailBinding = itemEmailBinding;
        }

        public void bind(Contact contact) {
            itemEmailBinding.setViewModel(contact);
            itemEmailBinding.executePendingBindings();
        }
    }

    public class WhatsappHolder extends RecyclerView.ViewHolder {
        ItemWhatsappBinding itemWhatsappBinding;

        public WhatsappHolder(@NonNull ItemWhatsappBinding itemWhatsappBinding) {
            super(itemWhatsappBinding.getRoot());
            this.itemWhatsappBinding = itemWhatsappBinding;
        }

        public void bind(Contact contact) {
            itemWhatsappBinding.setViewModel(contact);
            itemWhatsappBinding.executePendingBindings();
        }
    }

    public class ViberHolder extends RecyclerView.ViewHolder {
        ItemViberBinding itemViberBinding;

        public ViberHolder(@NonNull ItemViberBinding itemViberBinding) {
            super(itemViberBinding.getRoot());
            this.itemViberBinding = itemViberBinding;
        }

        public void bind(Contact contact) {
            itemViberBinding.setViewModel(contact);
            itemViberBinding.executePendingBindings();
        }
    }

    public class InvalidHolder extends RecyclerView.ViewHolder {
        ItemInvalidBinding itemInvalidBinding;

        public InvalidHolder(@NonNull ItemInvalidBinding itemInvalidBinding) {
            super(itemInvalidBinding.getRoot());
            this.itemInvalidBinding = itemInvalidBinding;
        }

        public void bind(Contact contact) {
            itemInvalidBinding.setViewModel(contact);
            itemInvalidBinding.executePendingBindings();
        }
    }
}