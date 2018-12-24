package ws.wolfsoft.hotelup;

import android.app.Dialog;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import Adapter.HotelPagerAdapter;

public class HotelDetailActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private HotelPagerAdapter hotelPagerAdapter;

    TextView textView;

    Dialog myDialog;


    CardView facilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);


        facilities = (CardView)findViewById(R.id.facilities);

        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myDialog = new Dialog(HotelDetailActivity.this);
                myDialog.getWindow();
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.facility_popup);
                myDialog.show();

            }
        });


        viewPager = (ViewPager) findViewById(R.id.viewpager);

        textView = (TextView)findViewById(R.id.text);


        hotelPagerAdapter = new HotelPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(hotelPagerAdapter);


         viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                textView.setText("" + (position +1));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });




    }
}
