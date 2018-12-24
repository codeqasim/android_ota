package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.HomeHotelModelClass;
import ModelClass.HotelUpListModelClass;
import ws.wolfsoft.hotelup.BookingSucessfullActivity;
import ws.wolfsoft.hotelup.HotelListActivity;
import ws.wolfsoft.hotelup.HotelSelectRoomActivity;
import ws.wolfsoft.hotelup.HotelUpLocationActivity;
import ws.wolfsoft.hotelup.LoginActivity;
import ws.wolfsoft.hotelup.R;


public class HomeHotelRecycleAdapter extends RecyclerView.Adapter<HomeHotelRecycleAdapter.MyViewHolder>{

    Context context;


    private List<HomeHotelModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;

        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);
            imageView = (ImageView)view.findViewById(R.id.image);


        }

    }


    public HomeHotelRecycleAdapter(Context context, List<HomeHotelModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HomeHotelRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_homehori_list, parent, false);


        return new HomeHotelRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        HomeHotelModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());
        holder.imageView.setImageResource(lists.getImage());


    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


