package com.example.android.nieporettourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a hotels' list.
 */
public class HotelsFragment extends Fragment {

    // Empty public constructor
    public HotelsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.locations_list, container, false);

        // Create a hotels' list.
        final ArrayList<Location> hotels = new ArrayList<>();
        hotels.add(new Location(R.string.hotel_name_1, R.string.hotel_desc_1,
                R.string.hotel_address_1, R.string.hotel_website_1, R.drawable.hotel_image_1));
        hotels.add(new Location(R.string.hotel_name_2, R.string.hotel_desc_2,
                R.string.hotel_address_2, R.string.hotel_website_2, R.drawable.hotel_image_2));
        hotels.add(new Location(R.string.hotel_name_3, R.string.hotel_desc_3,
                R.string.hotel_address_3, R.string.hotel_website_3, R.drawable.hotel_image_3));

        // Creating a {@link LocationAdapter}
        LocationAdapter adapter = new LocationAdapter(getActivity(), hotels);

        // Finding the {@link ListView} object
        ListView listView = (ListView) view.findViewById(R.id.locationsList);

        // Making the {@link ListView} use the {@link LocationAdapter}
        listView.setAdapter(adapter);

        return view;
    }
}