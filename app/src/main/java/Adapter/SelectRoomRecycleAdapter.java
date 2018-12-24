package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.HomeHotelModelClass;
import ModelClass.SelectRoomModelClass;
import ws.wolfsoft.hotelup.R;


public class SelectRoomRecycleAdapter extends RecyclerView.Adapter<SelectRoomRecycleAdapter.MyViewHolder>{

    Context context;


    private List<SelectRoomModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView,pay_img;

        TextView title,payment,confirmation;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);
            confirmation=(TextView)view.findViewById(R.id.confirmation);
            payment=(TextView)view.findViewById(R.id.payment);
            imageView = (ImageView)view.findViewById(R.id.image);
            pay_img = (ImageView)view.findViewById(R.id.pay_img);


        }

    }


    public SelectRoomRecycleAdapter(Context context, List<SelectRoomModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public SelectRoomRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_select_room, parent, false);


        return new SelectRoomRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        SelectRoomModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());
        holder.confirmation.setText(lists.getConfirmation());
        holder.payment.setText(lists.getPayment());
        holder.imageView.setImageResource(lists.getImage());
        holder.pay_img.setImageResource(lists.getPay_img());


        if(position ==1){

            holder.confirmation.setTextColor(Color.parseColor("#ed4a47"));

        }else {

            holder.confirmation.setTextColor(Color.parseColor("#26b63a"));
        }

    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


