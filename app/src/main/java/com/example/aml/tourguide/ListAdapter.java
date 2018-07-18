package com.example.aml.tourguide;

/**
 * Created by Aml on 2017-12-12.
 */
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<List> {
    private int mColorResourceId;

    public ListAdapter(Activity context, ArrayList<List> lists, int colorResourceId) {
        super(context, 0, lists);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
       List currentList = getItem(position);
        TextView listTextView = (TextView) listItemView.findViewById(R.id.list_text_view);
        listTextView.setText(currentList.getItem());

       /* ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        if(currentList.hasImage()) {
            imageView.setImageResource(currentList.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        */
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
            }

}