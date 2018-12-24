package ws.wolfsoft.hotelup;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.ahmadrosid.lib.drawroutemap.DrawMarker;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

import Adapter.MapViewRecycleAdapter;
import ModelClass.ReviewModelClass;

public class HotelMapViewActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker customMarker;
    private LatLng origin, destination, three, four, five, six, seven;

    TextView textView;

    private ArrayList<ReviewModelClass> reviewModelClasses;
    private RecyclerView recyclerView;
    private MapViewRecycleAdapter mAdapter;

    String txt[] = {"Hotel Sunrise", "Hotel Sunrise", "Hotel Sunrise"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_map_view);

        textView = (TextView) findViewById(R.id.title);
        textView.setText("Montreal, canada");



        //HotelName List Recyclerview code is here


        recyclerView = findViewById(R.id.recyclerView);


        reviewModelClasses = new ArrayList<>();


        for (int i = 0; i < txt.length; i++) {
            ReviewModelClass beanClassForRecyclerView_contacts = new ReviewModelClass(txt[i]);

            reviewModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new MapViewRecycleAdapter(HotelMapViewActivity.this, reviewModelClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(HotelMapViewActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);


        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


//        Google map code is here.


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);

        //lat & long for the points on map
        origin = new LatLng(-7.788969, 110.338382);
        destination = new LatLng(-7.781200, 110.349709);
        three = new LatLng(-7.781800, 110.347001);
        four = new LatLng(-7.785002, 110.349010);
        five = new LatLng(-7.787050, 110.343000);
        six = new LatLng(-7.790020, 110.343000);
        seven = new LatLng(-7.780020, 110.333000);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        DrawMarker.getInstance(this).draw(mMap, origin, R.drawable.ic_pin_red, "My Location");
        DrawMarker.getInstance(this).draw(mMap, destination, R.drawable.ic_pin_red, "Destination");
        DrawMarker.getInstance(this).draw(mMap, three, R.drawable.ic_pin_red, "Destination");
        DrawMarker.getInstance(this).draw(mMap, four, R.drawable.ic_pin_red, "Destination");
        DrawMarker.getInstance(this).draw(mMap, five, R.drawable.ic_pin_red, "Destination");
        DrawMarker.getInstance(this).draw(mMap, six, R.drawable.ic_pin_red, "Destination");
        DrawMarker.getInstance(this).draw(mMap, seven, R.drawable.ic_pin_red, "Destination");

        //it binds the camera postition to the above two points
        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(origin)
                .include(destination)
                .include(three)
                .include(four)
                .include(five)
                .include(six).build();
        Point displaySize = new Point();
        getWindowManager().getDefaultDisplay().getSize(displaySize);
        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, displaySize.x, 260, 30));

        //for automatic zoomin when you open the activity....
        //the vaalue can be changed according to your use.....
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15.3f));

    }
}
