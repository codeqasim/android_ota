package ws.wolfsoft.hotelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.HomeHotelRecycleAdapter;
import ModelClass.HomeHotelModelClass;

public class HomeHotelActivity extends AppCompatActivity {


    private ArrayList<HomeHotelModelClass> homePriceModelClasses;
    private RecyclerView category_recyclerView;
    private HomeHotelRecycleAdapter mAdapter1;

    private Integer image[] = {R.drawable.ic_nearby,R.drawable.parish,R.drawable.switzerland,R.drawable.new_delhi,R.drawable.parish};
    private String title[] = {"Near by","Paris","Switzerland","New Delhi","Paris"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_hotel);



        category_recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        homePriceModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            HomeHotelModelClass beanClassForRecyclerView_contacts = new HomeHotelModelClass(image[i],title[i]);

            homePriceModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter1 = new HomeHotelRecycleAdapter(HomeHotelActivity.this, homePriceModelClasses);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(HomeHotelActivity.this, LinearLayoutManager.HORIZONTAL, false);
        category_recyclerView.setLayoutManager(mLayoutManager1);


        category_recyclerView.setLayoutManager(mLayoutManager1);
        category_recyclerView.setItemAnimator(new DefaultItemAnimator());
        category_recyclerView.setAdapter(mAdapter1);

    }
}
