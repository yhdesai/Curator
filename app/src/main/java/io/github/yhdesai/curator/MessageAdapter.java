package io.github.yhdesai.curator;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<FriendlyMessage> {
    public MessageAdapter(Context context, int resource, List<FriendlyMessage> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView videoNameTextView = (TextView) convertView.findViewById(R.id.videoNameTextView);
        TextView videoTokenTextView = (TextView) convertView.findViewById(R.id.videoTokenTextView);

        FriendlyMessage message = getItem(position);


        /*
        boolean isPhoto = message.getPhotoUrl() != null;
        if (isPhoto) {
            videoNameTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(message.getPhotoUrl())
                    .into(photoImageView);
        } else {
            videoNameTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            videoNameTextView.setText(message.getText());
        }

        */
        videoNameTextView.setText(message.getText());
        videoTokenTextView.setText(message.getName());

        return convertView;
    }
}
