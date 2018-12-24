package ws.wolfsoft.hotelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReviewBookingActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_booking);

        textView = (TextView)findViewById(R.id.title);
        textView.setText("Review Booking");
    }
}
