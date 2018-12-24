package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.HotelUpListModelClass;
import ws.wolfsoft.hotelup.BookingSucessfullActivity;
import ws.wolfsoft.hotelup.FilterActivity;
import ws.wolfsoft.hotelup.HomeHotelActivity;
import ws.wolfsoft.hotelup.HotelDetailActivity;
import ws.wolfsoft.hotelup.HotelListActivity;
import ws.wolfsoft.hotelup.HotelMapViewActivity;
import ws.wolfsoft.hotelup.HotelSelectRoomActivity;
import ws.wolfsoft.hotelup.HotelUpLocationActivity;
import ws.wolfsoft.hotelup.LoginActivity;
import ws.wolfsoft.hotelup.MyTripActivity;
import ws.wolfsoft.hotelup.PaymentActivity;
import ws.wolfsoft.hotelup.PhoneVerificationActivity;
import ws.wolfsoft.hotelup.ProfileActivity;
import ws.wolfsoft.hotelup.R;
import ws.wolfsoft.hotelup.ReviewActivity;
import ws.wolfsoft.hotelup.ReviewBookingActivity;
import ws.wolfsoft.hotelup.SelectDateActivity;
import ws.wolfsoft.hotelup.Select_Room_Hotel_Activity;


public class HotelUpListRecycleAdapter extends RecyclerView.Adapter<HotelUpListRecycleAdapter.MyViewHolder>{

    Context context;


    private List<HotelUpListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);




        }

    }


    public HotelUpListRecycleAdapter(Context context, List<HotelUpListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HotelUpListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hotel_inn_list, parent, false);


        return new HotelUpListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        HotelUpListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, LoginActivity.class);
                    context.startActivity(i);
                }else if (position == 1) {
                    Intent i = new Intent(context, PhoneVerificationActivity.class);
                    context.startActivity(i);
                }else if (position == 2) {
                    Intent i = new Intent(context, HomeHotelActivity.class);
                    context.startActivity(i);
                }else if (position == 3) {
                    Intent i = new Intent(context, HotelUpLocationActivity.class);
                    context.startActivity(i);
                }else if (position == 4) {
                    Intent i = new Intent(context, SelectDateActivity.class);
                    context.startActivity(i);
                }else if (position == 5) {
                    Intent i = new Intent(context, HotelSelectRoomActivity.class);
                    context.startActivity(i);
                }else if (position == 6) {
                    Intent i = new Intent(context, HotelListActivity.class);
                    context.startActivity(i);
                }else if (position == 7) {
                    Intent i = new Intent(context, HotelMapViewActivity.class);
                    context.startActivity(i);
                }else if (position == 8) {
                    Intent i = new Intent(context, HotelDetailActivity.class);
                    context.startActivity(i);
                }else if (position == 9) {
                    Intent i = new Intent(context, ReviewActivity.class);
                    context.startActivity(i);
                }else if (position == 10) {
                    Intent i = new Intent(context, FilterActivity.class);
                    context.startActivity(i);
                }else if (position == 11) {
                    Intent i = new Intent(context, Select_Room_Hotel_Activity.class);
                    context.startActivity(i);
                }else if (position == 12) {
                    Intent i = new Intent(context, ReviewBookingActivity.class);
                    context.startActivity(i);
                }else if (position == 13) {
                    Intent i = new Intent(context, PaymentActivity.class);
                    context.startActivity(i);
                }else if (position == 14) {
                    Intent i = new Intent(context, BookingSucessfullActivity.class);
                    context.startActivity(i);
                }else if (position == 15) {
                    Intent i = new Intent(context, ProfileActivity.class);
                    context.startActivity(i);
                }else if (position == 16) {
                    Intent i = new Intent(context, MyTripActivity.class);
                    context.startActivity(i);
                }
            }

        });



    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


