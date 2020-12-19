package com.example.android.nieporettourguide;

import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that provides the layout for each songs' list item
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    // Constructor - creating a new {@link LocationAdapter} object.
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checking if an existing view is being reused, otherwise inflate it
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.locations_list_item, parent, false);
        }

        // Return the {@link Location} object located at the given position in the locations' list
        Location currentLocation = getItem(position);

        // Find the TextView in the locations_list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name_text_view);
        // Get the location's name from the currentLocation object and set this text on the name_text_view TextView.
        nameTextView.setText(currentLocation.getNameId());

        // Find the TextView in the locations_list_item.xml layout with the ID desc_text_view.
        TextView descTextView = (TextView) convertView.findViewById(R.id.desc_text_view);
        // Get the description from the currentLocation object and set this text on the desc_text_view TextView.
        descTextView.setText(currentLocation.getDescId());

        // Find the TextView in the locations_list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) convertView.findViewById(R.id.address_text_view);
        // Get the address from the currentLocation object and set this text on the address_text_view TextView.
        addressTextView.setText(currentLocation.getAddressId());

        // Find the TextView in the locations_list_item.xml layout with the ID website_text_view.
        TextView websiteTextView = (TextView) convertView.findViewById(R.id.website_text_view);
        // Get the website from the currentLocation object and set this text on the website_text_view TextView.
        websiteTextView.setText(currentLocation.getWebsiteId());

        // Find the ImageView in the locations_list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        // Display the provided image
        imageView.setImageResource(currentLocation.getImageId());

        // Return the whole locations' list item layout
        return convertView;
    }
}