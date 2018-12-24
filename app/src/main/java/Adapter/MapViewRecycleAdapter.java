package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.ReviewModelClass;
import ws.wolfsoft.hotelup.R;


public class MapViewRecycleAdapter extends RecyclerView.Adapter<MapViewRecycleAdapter.MyViewHolder>{

    Context context;


    private List<ReviewModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);




        }

    }


    public MapViewRecycleAdapter(Context context, List<ReviewModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MapViewRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hotel_list1, parent, false);


        return new MapViewRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        ReviewModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());





    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


