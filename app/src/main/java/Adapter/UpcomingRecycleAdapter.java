package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.HotelInnListModelClass;
import ws.wolfsoft.hotelup.R;


public class UpcomingRecycleAdapter extends RecyclerView.Adapter<UpcomingRecycleAdapter.MyViewHolder>{

    Context context;


    private List<HotelInnListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);




        }

    }


    public UpcomingRecycleAdapter(Context context, List<HotelInnListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public UpcomingRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_upcoming_list, parent, false);


        return new UpcomingRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        HotelInnListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());





    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


