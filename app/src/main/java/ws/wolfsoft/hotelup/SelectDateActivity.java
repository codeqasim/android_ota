package ws.wolfsoft.hotelup;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.archit.calendardaterangepicker.customviews.DateRangeCalendarView;

import java.util.Calendar;

public class SelectDateActivity extends AppCompatActivity {

    TextView textView;

    DateRangeCalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_date);


        calendar=(DateRangeCalendarView)findViewById(R.id.calendar);
        textView = (TextView)findViewById(R.id.title);
        textView.setText("Choose Date");


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "LobsterTwo-Regular.ttf");
        calendar.setFonts(typeface);

        calendar.setCalendarListener(new DateRangeCalendarView.CalendarListener() {
            @Override
            public void onDateRangeSelected(Calendar startDate, Calendar endDate) {
                if (startDate != null && endDate != null) {
                    Toast.makeText(SelectDateActivity.this, "Date range selected.\nStart date- " + startDate.getTime() + "\nEnd date- " +             endDate.getTime(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancel() {

            }
        });
    }
}
