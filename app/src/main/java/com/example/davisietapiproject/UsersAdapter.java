package com.example.davisietapiproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserAdapterVH> {
    private List<UserResponse> userResponseList;
    private Context context;
    private ClickedItem clickedItem;

    public UsersAdapter(ClickedItem clickedItem) {
        this.clickedItem = clickedItem;
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
        //String displayName = userResponse.getTheActor().getDisplayName();
        String prefix;
        if (userResponse.isIs_Active()){
            prefix = "A";
        } else {
            prefix = "D";
        }

        holder.prefix.setText(prefix);
        holder.username.setText(username);
        //holder.displayName.setText(displayName);
        holder.imageMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedItem.ClickedUser(userResponse);
            }
        });
    }

    public interface ClickedItem{
        public void ClickedUser(UserResponse userResponse);
    }

    @Override
    // i need to fix this
    public int getItemCount() {
        return userResponseList.size();
    }

    public class UserAdapterVH extends RecyclerView.ViewHolder {
        TextView username;
        //TextView displayName;
        TextView prefix;
        ImageView imageMore;

        public UserAdapterVH(@NonNull View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.username);
            //displayName = itemView.findViewById(R.id.displayName);
            prefix = itemView.findViewById(R.id.prefix);
            imageMore = itemView.findViewById(R.id.imageMore);


        }
    }
}
