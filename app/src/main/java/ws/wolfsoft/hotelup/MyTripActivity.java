package ws.wolfsoft.hotelup;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import Adapter.CategoryPagerAdapterMyTrip;

public class MyTripActivity extends AppCompatActivity {

    TextView textView;

    private TabLayout tabLayout;
    private Typeface mTypeface;
    private Typeface mTypefaceBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trip);

        textView = (TextView)findViewById(R.id.title);
        textView.setText("My Trips");


        tabLayout = (TabLayout) findViewById(R.id.tab_layout);


//        Tablyout in dash line code is here

        View root = tabLayout.getChildAt(0);
        if (root instanceof LinearLayout) {
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(getResources().getColor(R.color.view_line));
            drawable.setSize(2, 1);
            ((LinearLayout) root).setDividerPadding(20);
            ((LinearLayout) root).setDividerDrawable(drawable);

            tabLayout.setTabMode(TabLayout.MODE_FIXED);
            tabLayout.addTab(tabLayout.newTab().setText("Upcoming"));
            tabLayout.addTab(tabLayout.newTab().setText("Past"));


//            Tablayout customefonts code is here.

            Typeface mTypeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
            ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
            int tabsCount = vg.getChildCount();
            for (int j = 0; j < tabsCount; j++) {
                ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
                int tabChildsCount = vgTab.getChildCount();
                for (int i = 0; i < tabChildsCount; i++) {
                    View tabViewChild = vgTab.getChildAt(i);
                    if (tabViewChild instanceof TextView) {
                        ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                    }
                }
            }

            //  sliderAdd = (SliderLayout) view.findViewById(R.id.sliderAdd);


            setCustomFontAndStyle(tabLayout, 0);
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


            final ViewPager viewPager1 = (ViewPager) findViewById(R.id.pager);
            CategoryPagerAdapterMyTrip adapter = new CategoryPagerAdapterMyTrip(getSupportFragmentManager(), 2);
            viewPager1.setAdapter(adapter);
            viewPager1.setOffscreenPageLimit(1);
            viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager1.setCurrentItem(tab.getPosition());
                    setCustomFontAndStyle(tabLayout, tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {
                }
            });
        }
    }


    private void setCustomFontAndStyle(TabLayout tabLayout, Integer position) {
        mTypeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        mTypefaceBold = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    if (j == position) {
                        ((TextView) tabViewChild).setTypeface(mTypefaceBold, Typeface.NORMAL);
                    } else {
                        ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                    }
                }
            }
        }
    }
}
