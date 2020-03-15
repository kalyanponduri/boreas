package com.boreas.adapters;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.e.boreas.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserChatViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    RelativeLayout chatRL;
    CircleImageView userIV;
    TextView nameTV;
    TextView messageTV;
    TextView lastMessageTimeTV;
    TextView unreadMessageCountTV;

    public UserChatViewHolder(View itemView) {
        super(itemView);

        chatRL = (RelativeLayout) itemView.findViewById(R.id.chatRL);
        userIV = (CircleImageView) itemView.findViewById(R.id.userIV);
        nameTV = (TextView) itemView.findViewById(R.id.nameTV);
        messageTV = (TextView) itemView.findViewById(R.id.messageTV);
        lastMessageTimeTV = (TextView) itemView.findViewById(R.id.lastMessageTimeTV);
        unreadMessageCountTV = (TextView) itemView.findViewById(R.id.unreadMessageCountTV);
//        chatRL.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

    }


}
