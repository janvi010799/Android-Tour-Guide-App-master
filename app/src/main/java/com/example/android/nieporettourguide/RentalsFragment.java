package com.example.android.nieporettourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a rentals' list.
 */
public class RentalsFragment extends Fragment {

    // Empty public constructor
    public RentalsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.locations_list, container, false);

        // Create a rentals' list.
        final ArrayList<Location> rentals = new ArrayList<>();
        rentals.add(new Location(R.string.rental_name_1, R.string.rental_desc_1,
                R.string.rental_address_1, R.string.rental_website_1, R.drawable.rental_image));
        rentals.add(new Location(R.string.rental_name_2, R.string.rental_desc_2,
                R.string.rental_address_2, R.string.rental_website_2, R.drawable.rental_image));
        rentals.add(new Location(R.string.rental_name_3, R.string.rental_desc_3,
                R.string.rental_address_3, R.string.rental_website_3, R.drawable.rental_image));

        // Creating a {@link LocationAdapter}
        LocationAdapter adapter = new LocationAdapter(getActivity(), rentals);

        // Finding the {@link ListView} object
        ListView listView = (ListView) view.findViewById(R.id.locationsList);

        // Making the {@link ListView} use the {@link LocationAdapter}
        listView.setAdapter(adapter);

        return view;
    }
}