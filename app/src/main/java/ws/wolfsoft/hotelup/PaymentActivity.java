package ws.wolfsoft.hotelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.HomeHotelRecycleAdapter;
import Adapter.PaymentRecycleAdapter;
import ModelClass.HomeHotelModelClass;
import ModelClass.PaymentModelClass;

public class PaymentActivity extends AppCompatActivity {


    TextView textView;


    private ArrayList<PaymentModelClass> paymentModelClasses;
    private RecyclerView category_recyclerView;
    private PaymentRecycleAdapter mAdapter1;

    private Integer image[] = {R.drawable.ic_credit,R.drawable.ic_credit_gray,R.drawable.ic_netbanking,R.drawable.ic_payathotel};
    private String title[] = {"Debit Card","Credit Card","Net Banking","Pay @ Hotel"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        textView = (TextView)findViewById(R.id.title);

        textView.setText("Payment");



        category_recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        paymentModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            PaymentModelClass beanClassForRecyclerView_contacts = new PaymentModelClass(image[i],title[i]);

            paymentModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter1 = new PaymentRecycleAdapter(PaymentActivity.this, paymentModelClasses);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(PaymentActivity.this, LinearLayoutManager.HORIZONTAL, false);
        category_recyclerView.setLayoutManager(mLayoutManager1);


        category_recyclerView.setLayoutManager(mLayoutManager1);
        category_recyclerView.setItemAnimator(new DefaultItemAnimator());
        category_recyclerView.setAdapter(mAdapter1);
    }
}
