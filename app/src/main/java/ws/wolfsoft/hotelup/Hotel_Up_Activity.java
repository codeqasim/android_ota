package ws.wolfsoft.hotelup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.HotelUpListRecycleAdapter;
import ModelClass.HotelUpListModelClass;


public class Hotel_Up_Activity extends AppCompatActivity {

    private ArrayList<HotelUpListModelClass> hotelUpListModelClasses;
    private RecyclerView recyclerView;
    private HotelUpListRecycleAdapter bAdapter;

    String txt[]= {"LoginActivity","PhoneVerificationActivity","HomeHotelActivity","HotelUpLocationActivity",
    "SelectDateActivity","HotelSelectRoomActivity","HotelListActivity","HotelMapViewActivity","HotelDetailActivity","ReviewActivity",
    "FilterActivity","Select_Room_Hotel_Activity","ReviewBookingActivity","PaymentActivity","BookingSucessfullActivity","ProfileActivity",
            "MyTripActivity"};

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_up__list);

        textView = (TextView)findViewById(R.id.number);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917490844738"));
                startActivity(intent);

            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Hotel_Up_Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        hotelUpListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            HotelUpListModelClass beanClassForRecyclerView_contacts = new HotelUpListModelClass(txt[i]);
            hotelUpListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new HotelUpListRecycleAdapter(Hotel_Up_Activity.this,hotelUpListModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
