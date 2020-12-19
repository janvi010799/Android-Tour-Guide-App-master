package com.example.android.nieporettourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link ViewPagerAdapter} is a {@link FragmentPagerAdapter} that provides the layout for
 * each category.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    // Context of the app
    private Context context;

    // Constructor - creating a new {@link ViewPagerAdapter} object.
    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    // Return the {@link Fragment} that will be displayed for the given page number.
    @Override
    public Fragment getItem(int pageNumber) {
        if (pageNumber == 0) {
            return new AttractionsFragment();
        } else if (pageNumber == 1) {
            return new HotelsFragment();
        } else if (pageNumber == 2) {
            return new RestaurantsFragment();
        } else {
            return new RentalsFragment();
        }
    }

    // Return the total number of pages.
    @Override
    public int getCount() {
        return 4;
    }

    // Return title of the given page
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.attractions);
            case 1:
                return context.getString(R.string.hotels);
            case 2:
                return context.getString(R.string.restaurants);
            default:
                return context.getString(R.string.rentals);
        }
    }
}