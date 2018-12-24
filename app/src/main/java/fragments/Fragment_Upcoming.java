package fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.UpcomingRecycleAdapter;
import ModelClass.HotelInnListModelClass;
import ws.wolfsoft.hotelup.R;


public class Fragment_Upcoming extends Fragment {

    private ArrayList<HotelInnListModelClass> cocoNewsListModelClasses;
    private RecyclerView recyclerView;
    private UpcomingRecycleAdapter bAdapter;

    String txt[]={"Hotel Sunrise","Hotel Welcome"};

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_upcoming,container,false);

        recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cocoNewsListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            HotelInnListModelClass beanClassForRecyclerView_contacts = new HotelInnListModelClass(txt[i]);
            cocoNewsListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new UpcomingRecycleAdapter(getActivity(),cocoNewsListModelClasses);
        recyclerView.setAdapter(bAdapter);

        return view;
    }
}
