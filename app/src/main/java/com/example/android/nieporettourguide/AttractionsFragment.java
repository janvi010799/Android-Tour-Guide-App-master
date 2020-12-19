package com.example.android.nieporettourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays an attractions' list.
 */
public class AttractionsFragment extends Fragment {

    // Empty public constructor
    public AttractionsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.locations_list, container, false);

        // Create an attractions' list.
        final ArrayList<Location> attractions = new ArrayList<>();
        attractions.add(new Location(R.string.attraction_name_1, R.string.attraction_desc_1,
                R.string.attraction_address_1, R.string.attraction_website_1, R.drawable.attraction_image_1));
        attractions.add(new Location(R.string.attraction_name_2, R.string.attraction_desc_2,
                R.string.attraction_address_2, R.string.attraction_website_2, R.drawable.attraction_image_2));
        attractions.add(new Location(R.string.attraction_name_3, R.string.attraction_desc_3,
                R.string.attraction_address_3, R.string.attraction_website_3, R.drawable.attraction_image_3));
        attractions.add(new Location(R.string.attraction_name_4, R.string.attraction_desc_4,
                R.string.attraction_address_4, R.string.attraction_website_4, R.drawable.attraction_image_4));

        // Creating a {@link LocationAdapter}
        LocationAdapter adapter = new LocationAdapter(getActivity(), attractions);

        // Finding the {@link ListView} object
        ListView listView = (ListView) view.findViewById(R.id.locationsList);

        // Making the {@link ListView} use the {@link LocationAdapter}
        listView.setAdapter(adapter);

        return view;
    }
}