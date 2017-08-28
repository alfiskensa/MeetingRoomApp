package com.kementan.pusdatin.meetingroomapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.kementan.pusdatin.meetingroomapp.R;
import com.kementan.pusdatin.meetingroomapp.api.APIService;
import com.kementan.pusdatin.meetingroomapp.api.APIUrl;
import com.kementan.pusdatin.meetingroomapp.helper.RoomAdapter;
import com.kementan.pusdatin.meetingroomapp.models.Rooms;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Belal on 14/04/17.
 */

public class RoomFragment extends Fragment {

    private RecyclerView recyclerViewRoom;
    private RecyclerView.Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rooms, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Rooms");

        recyclerViewRoom = (RecyclerView) view.findViewById(R.id.recyclerViewRooms);
        recyclerViewRoom.setHasFixedSize(true);
        recyclerViewRoom.setLayoutManager(new LinearLayoutManager(getActivity()));


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);

        Call<Rooms> call = service.getRooms();

        call.enqueue(new Callback<Rooms>() {
            @Override
            public void onResponse(Call<Rooms> call, Response<Rooms> response) {
                adapter = new RoomAdapter(response.body().getRooms(), getActivity());
                recyclerViewRoom.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Rooms> call, Throwable t) {

            }
        });
    }
}
