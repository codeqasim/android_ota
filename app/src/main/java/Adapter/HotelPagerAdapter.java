package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragments.First_Fragment;

/**
 * Created by wolfsoft on 10/11/2015.
 */
public class HotelPagerAdapter extends FragmentStatePagerAdapter {



    public HotelPagerAdapter(FragmentManager fm) {
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                First_Fragment tab1 = new First_Fragment();
                return tab1;

            case 1:
                First_Fragment tab6 = new First_Fragment();
                return tab6;


            case 2:
                First_Fragment tab2 = new First_Fragment();
                return tab2;

            case 3:
                First_Fragment tab3 = new First_Fragment();
                return tab3;

            case 4:
                First_Fragment tab4 = new First_Fragment();
                return tab4;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}