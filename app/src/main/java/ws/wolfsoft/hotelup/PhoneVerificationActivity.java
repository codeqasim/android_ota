package ws.wolfsoft.hotelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PhoneVerificationActivity extends AppCompatActivity {
    Spinner sp_car_maker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

        sp_car_maker = (Spinner) findViewById(R.id.sp_car_maker);

        List<String> list = new ArrayList<String>();
        list.add("+91");
        list.add("+623");
        list.add("+90");
        list.add("+271");
        list.add("+233");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_car_maker.setAdapter(dataAdapter);

    }
}
