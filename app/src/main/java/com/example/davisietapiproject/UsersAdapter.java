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

    public void setData(List<UserResponse> userResponseList) {
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

        String username = userResponse.getTitle();
        String prefix;
        if (userResponse.isIs_Active()){
            prefix = "A";
        } else {
            prefix = "D";
        }

        holder.prefix.setText(prefix);
        holder.username.setText(username);

    }

    @Override
    // i need to fix this
    public int getItemCount() {
        return userResponseList.size();
    }

    public class UserAdapterVH extends RecyclerView.ViewHolder {
        TextView username;
        TextView prefix;
        ImageView imageMore;

        public UserAdapterVH(@NonNull View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.username);
            prefix = itemView.findViewById(R.id.prefix);
            imageMore = itemView.findViewById(R.id.imageMore);


        }
    }
}
