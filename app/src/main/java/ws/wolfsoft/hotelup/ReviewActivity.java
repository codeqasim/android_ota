package ws.wolfsoft.hotelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.ReviewRecycleAdapter;
import ModelClass.ReviewModelClass;

public class ReviewActivity extends AppCompatActivity {

    TextView textView;

    private ArrayList<ReviewModelClass> reviewModelClasses;
    private RecyclerView recyclerView;
    private ReviewRecycleAdapter Adapter;

    String txt[]= {"Must Go!","Awesome","Average"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        textView = (TextView)findViewById(R.id.title);
        textView.setText("Reviews");


//     Review Recyclerview Code is Here

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ReviewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        reviewModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            ReviewModelClass beanClassForRecyclerView_contacts = new ReviewModelClass(txt[i]);
            reviewModelClasses.add(beanClassForRecyclerView_contacts);
        }
        Adapter = new ReviewRecycleAdapter(ReviewActivity.this,reviewModelClasses);
        recyclerView.setAdapter(Adapter);


    }
}
