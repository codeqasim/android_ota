package ws.wolfsoft.hotelup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;

public class FilterActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;

    TextView one,two,three,four,five;

    ImageView star1,star2,star3,star4,star5;

    LinearLayout linear1, linear2, linear3, linear4,linear5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);



        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear5 = (LinearLayout) findViewById(R.id.linear5);

        one = (TextView)findViewById(R.id.one);
        two = (TextView)findViewById(R.id.two);
        three = (TextView)findViewById(R.id.three);
        four = (TextView)findViewById(R.id.four);
        five = (TextView)findViewById(R.id.five);

        star1 = (ImageView)findViewById(R.id.star1);
        star2 = (ImageView)findViewById(R.id.star2);
        star3 = (ImageView)findViewById(R.id.star3);
        star4 = (ImageView)findViewById(R.id.star4);
        star5 = (ImageView)findViewById(R.id.star5);


        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);









        textView = (TextView)findViewById(R.id.title);
        textView.setText("Filter");


        final CrystalRangeSeekbar rangeSeekbar = (CrystalRangeSeekbar) findViewById(R.id.rangeSeekbar1);


        final TextView tvMin = (TextView) findViewById(R.id.textMin1);
        final TextView tvMax = (TextView) findViewById(R.id.textMin2);

// set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                tvMin.setText("" + String.valueOf(minValue));
                tvMax.setText("$" + String.valueOf(maxValue));
            }
        });

// set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener(new OnRangeSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number minValue, Number maxValue) {
                Log.d("CRS=>", String.valueOf(minValue) + " : " + String.valueOf(maxValue));
            }
        });

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.linear1:

                linear1.setBackgroundResource(R.drawable.green_rect);
                linear2.setBackgroundResource(R.drawable.gray_border_rect);
                linear3.setBackgroundResource(R.drawable.gray_border_rect);
                linear4.setBackgroundResource(R.drawable.gray_border_rect);
                linear5.setBackgroundResource(R.drawable.gray_border_rect);

                star1.setImageResource(R.drawable.ic_star_white);
                star2.setImageResource(R.drawable.ic_star_gray);
                star3.setImageResource(R.drawable.ic_star_gray);
                star4.setImageResource(R.drawable.ic_star_gray);
                star5.setImageResource(R.drawable.ic_star_gray);


                one.setTextColor(Color.parseColor("#ffffff"));
                two.setTextColor(Color.parseColor("#8f948d"));
                three.setTextColor(Color.parseColor("#8f948d"));
                four.setTextColor(Color.parseColor("#8f948d"));
                five.setTextColor(Color.parseColor("#8f948d"));



                break;

            case R.id.linear2:

                linear1.setBackgroundResource(R.drawable.gray_border_rect);
                linear2.setBackgroundResource(R.drawable.green_rect);
                linear3.setBackgroundResource(R.drawable.gray_border_rect);
                linear4.setBackgroundResource(R.drawable.gray_border_rect);
                linear5.setBackgroundResource(R.drawable.gray_border_rect);

                star1.setImageResource(R.drawable.ic_star_gray);
                star2.setImageResource(R.drawable.ic_star_white);
                star3.setImageResource(R.drawable.ic_star_gray);
                star4.setImageResource(R.drawable.ic_star_gray);
                star5.setImageResource(R.drawable.ic_star_gray);


                one.setTextColor(Color.parseColor("#8f948d"));
                two.setTextColor(Color.parseColor("#ffffff"));
                three.setTextColor(Color.parseColor("#8f948d"));
                four.setTextColor(Color.parseColor("#8f948d"));
                five.setTextColor(Color.parseColor("#8f948d"));

                break;

            case R.id.linear3:

                linear1.setBackgroundResource(R.drawable.gray_border_rect);
                linear2.setBackgroundResource(R.drawable.gray_border_rect);
                linear3.setBackgroundResource(R.drawable.green_rect);
                linear4.setBackgroundResource(R.drawable.gray_border_rect);
                linear5.setBackgroundResource(R.drawable.gray_border_rect);

                star1.setImageResource(R.drawable.ic_star_gray);
                star2.setImageResource(R.drawable.ic_star_gray);
                star3.setImageResource(R.drawable.ic_star_white);
                star4.setImageResource(R.drawable.ic_star_gray);
                star5.setImageResource(R.drawable.ic_star_gray);


                one.setTextColor(Color.parseColor("#8f948d"));
                two.setTextColor(Color.parseColor("#8f948d"));
                three.setTextColor(Color.parseColor("#ffffff"));
                four.setTextColor(Color.parseColor("#8f948d"));
                five.setTextColor(Color.parseColor("#8f948d"));


                break;



            case R.id.linear4:



                linear1.setBackgroundResource(R.drawable.gray_border_rect);
                linear2.setBackgroundResource(R.drawable.gray_border_rect);
                linear3.setBackgroundResource(R.drawable.gray_border_rect);
                linear4.setBackgroundResource(R.drawable.green_rect);
                linear5.setBackgroundResource(R.drawable.gray_border_rect);

                star1.setImageResource(R.drawable.ic_star_gray);
                star2.setImageResource(R.drawable.ic_star_gray);
                star3.setImageResource(R.drawable.ic_star_gray);
                star4.setImageResource(R.drawable.ic_star_white);
                star5.setImageResource(R.drawable.ic_star_gray);


                one.setTextColor(Color.parseColor("#8f948d"));
                two.setTextColor(Color.parseColor("#8f948d"));
                three.setTextColor(Color.parseColor("#8f948d"));
                four.setTextColor(Color.parseColor("#ffffff"));
                five.setTextColor(Color.parseColor("#8f948d"));

                break;


            case R.id.linear5:



                linear1.setBackgroundResource(R.drawable.gray_border_rect);
                linear2.setBackgroundResource(R.drawable.gray_border_rect);
                linear3.setBackgroundResource(R.drawable.gray_border_rect);
                linear4.setBackgroundResource(R.drawable.gray_border_rect);
                linear5.setBackgroundResource(R.drawable.green_rect);

                star1.setImageResource(R.drawable.ic_star_gray);
                star2.setImageResource(R.drawable.ic_star_gray);
                star3.setImageResource(R.drawable.ic_star_gray);
                star4.setImageResource(R.drawable.ic_star_gray);
                star5.setImageResource(R.drawable.ic_star_white);


                one.setTextColor(Color.parseColor("#8f948d"));
                two.setTextColor(Color.parseColor("#8f948d"));
                three.setTextColor(Color.parseColor("#8f948d"));
                four.setTextColor(Color.parseColor("#8f948d"));
                five.setTextColor(Color.parseColor("#ffffff"));

                break;








        }
    }





}
