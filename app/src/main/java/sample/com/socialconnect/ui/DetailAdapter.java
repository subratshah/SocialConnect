package sample.com.socialconnect.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sample.com.socialconnect.R;
import sample.com.socialconnect.databinding.ItemDetailBinding;
import sample.com.socialconnect.model.App;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {

    private List<App> apps;

    public DetailAdapter(List<App> apps) {
        this.apps = apps;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        ItemDetailBinding itemDetailBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_detail, viewGroup, false);
        return new ViewHolder(itemDetailBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        App app = apps.get(position);
        viewHolder.bind(app);
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemDetailBinding itemDetailBinding;

        public ViewHolder(@NonNull ItemDetailBinding itemDetailBinding) {
            super(itemDetailBinding.getRoot());
            this.itemDetailBinding = itemDetailBinding;
        }

        public void bind(App app) {
            this.itemDetailBinding.setViewModel(app);
        }
    }
}