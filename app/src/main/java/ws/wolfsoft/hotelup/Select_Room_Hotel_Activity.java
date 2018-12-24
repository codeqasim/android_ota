package ws.wolfsoft.hotelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.HotelListRecycleAdapter;
import Adapter.SelectRoomRecycleAdapter;
import ModelClass.HotelListModleClass;
import ModelClass.SelectRoomModelClass;

public class Select_Room_Hotel_Activity extends AppCompatActivity {


    private ArrayList<SelectRoomModelClass> selectRoomModelClasses;
    private RecyclerView recyclerView;
    private SelectRoomRecycleAdapter mAdapter;


    Integer image[] = {R.drawable.hotellisting1,R.drawable.select_room};
    String title[] = {"Classic Room","King Size Room"};
    String confirmation[]={"Free Cancelation, Sunrise Check-in Available","Non Refundable"};
    Integer pay_img[] = {R.drawable.ic_bill,R.drawable.ic_card};
    String payment[] = {"Pay at Hotel","Pay Now"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__room__hotel);

        recyclerView = findViewById(R.id.recyclerView);

        selectRoomModelClasses = new ArrayList<>();


        for (int i = 0; i < image.length; i++) {
            SelectRoomModelClass beanClassForRecyclerView_contacts = new SelectRoomModelClass(image[i],title[i],confirmation[i],pay_img[i],payment[i]);

            selectRoomModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new SelectRoomRecycleAdapter(Select_Room_Hotel_Activity.this,selectRoomModelClasses);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Select_Room_Hotel_Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }
}
