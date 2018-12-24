package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import fragments.Fragment_Upcoming;


/**
 * Created by wolfsoft5 on 7/4/18.
 */

public class CategoryPagerAdapterMyTrip extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterMyTrip(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                Fragment_Upcoming tab1 = new Fragment_Upcoming();
                                return tab1;
                        case 1:
                                Fragment_Upcoming tab2 = new Fragment_Upcoming();
                                return tab2;


                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

