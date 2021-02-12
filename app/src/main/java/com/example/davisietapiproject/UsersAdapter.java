package com.example.davisietapiproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserAdapterVH> {

    private List<UserResponse> userResponseList;
    private Context context;

    public UsersAdapter() {

    }
    public void setData(List<UserResponse> userResponse) {
        this.userResponseList = userResponseList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new UsersAdapter.UserAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_users,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterVH holder, int position) {
        UserResponse userResponse = userResponseList.get(position);

        String title = userResponse.getTitle();
        String prefix;
        if (userResponse.isIs_Active()){
            prefix = "A";
        } else {
            prefix = "D";
        }

        holder.prefix.setText(prefix);
        holder.title.setText(title);

    }

    @Override
    // i need to fix this
    public int getItemCount() {
        return 0;
    }

    public class UserAdapterVH extends RecyclerView.ViewHolder {
        TextView title;
        TextView prefix;
        ImageView imageMore;

        public UserAdapterVH(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            prefix = itemView.findViewById(R.id.prefix);
            imageMore = itemView.findViewById(R.id.imageMore);


        }
    }
}
