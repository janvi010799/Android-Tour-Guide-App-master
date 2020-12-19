package com.example.android.nieporettourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a restaurants' list.
 */
public class RestaurantsFragment extends Fragment {

    // Empty public constructor
    public RestaurantsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.locations_list, container, false);

        // Create a restaurants' list.
        final ArrayList<Location> restaurants = new ArrayList<>();
        restaurants.add(new Location(R.string.restaurant_name_1, R.string.restaurant_desc_1,
                R.string.restaurant_address_1, R.string.restaurant_website_1, R.drawable.restaurant_image_1));
        restaurants.add(new Location(R.string.restaurant_name_2, R.string.restaurant_desc_2,
                R.string.restaurant_address_2, R.string.restaurant_website_2, R.drawable.restaurant_image_2));
        restaurants.add(new Location(R.string.restaurant_name_3, R.string.restaurant_desc_3,
                R.string.restaurant_address_3, R.string.restaurant_website_3, R.drawable.restaurant_image_3));
        restaurants.add(new Location(R.string.restaurant_name_4, R.string.restaurant_desc_4,
                R.string.restaurant_address_4, R.string.restaurant_website_4, R.drawable.restaurant_image_4));

        // Creating a {@link LocationAdapter}
        LocationAdapter adapter = new LocationAdapter(getActivity(), restaurants);

        // Finding the {@link ListView} object
        ListView listView = (ListView) view.findViewById(R.id.locationsList);

        // Making the {@link ListView} use the {@link LocationAdapter}
        listView.setAdapter(adapter);

        return view;
    }
}