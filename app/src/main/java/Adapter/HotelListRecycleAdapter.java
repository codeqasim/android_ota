package Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.HotelListModleClass;
import ws.wolfsoft.hotelup.R;


public class HotelListRecycleAdapter extends RecyclerView.Adapter<HotelListRecycleAdapter.MyViewHolder>{

    Context context;
    private Dialog slideDialog;

    private List<HotelListModleClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;

        ImageView imageView;



        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);

            imageView = (ImageView)view.findViewById(R.id.image);




        }

    }


    public HotelListRecycleAdapter(Context context, List<HotelListModleClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HotelListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hotel_list, parent, false);


        return new HotelListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final  int position) {
        HotelListModleClass lists = OfferList.get(position);
        holder.imageView.setImageResource(lists.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                slideDialog = new Dialog(context, R.style.CustomDialogAnimation);
                slideDialog.setContentView(R.layout.popup);
                slideDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                WindowManager.LayoutParams layoutParams1 = new WindowManager.LayoutParams();


                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                slideDialog.getWindow().getAttributes().windowAnimations = R.style.CustomDialogAnimation;
                layoutParams.copyFrom(slideDialog.getWindow().getAttributes());

                int width = (int) (holder.itemView.getResources().getDisplayMetrics().widthPixels * 0.85);
                int height = (int) (holder.itemView.getResources().getDisplayMetrics().heightPixels * 0.45);

                layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
                layoutParams.height = height;
                layoutParams.width = width;
                layoutParams.gravity = Gravity.BOTTOM;

                slideDialog.getWindow().setAttributes(layoutParams);
                slideDialog.setCancelable(true);
                slideDialog.setCanceledOnTouchOutside(true);
                slideDialog.show();


            }
        });


    }







    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


