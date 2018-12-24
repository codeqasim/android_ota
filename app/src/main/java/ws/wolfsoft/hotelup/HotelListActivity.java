package ws.wolfsoft.hotelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

import Adapter.HotelListRecycleAdapter;
import ModelClass.HotelListModleClass;

public class HotelListActivity extends AppCompatActivity {

    LinearLayout linear;

    private ArrayList<HotelListModleClass> hotelListModleClasses;
    private RecyclerView recyclerView;
    private HotelListRecycleAdapter mAdapter;


    Integer image[] = {R.drawable.hotel_list12,R.drawable.hotel_list12,R.drawable.hotel_list12,R.drawable.hotel_list12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        linear = (LinearLayout)findViewById(R.id.linear);
        linear.setVisibility(View.VISIBLE);

        //        HotelName List Recyclerview code is here.

        recyclerView = findViewById(R.id.recyclerView);

        hotelListModleClasses = new ArrayList<>();


        for (int i = 0; i < image.length; i++) {
            HotelListModleClass beanClassForRecyclerView_contacts = new HotelListModleClass(image[i]);

            hotelListModleClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new HotelListRecycleAdapter(HotelListActivity.this, hotelListModleClasses);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HotelListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }
}
