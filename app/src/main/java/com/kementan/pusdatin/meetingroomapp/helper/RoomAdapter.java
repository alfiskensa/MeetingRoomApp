package com.kementan.pusdatin.meetingroomapp.helper;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.kementan.pusdatin.meetingroomapp.R;
import com.kementan.pusdatin.meetingroomapp.api.APIService;
import com.kementan.pusdatin.meetingroomapp.api.APIUrl;
import com.kementan.pusdatin.meetingroomapp.models.Room;
import com.kementan.pusdatin.meetingroomapp.models.RoomResponse;
import com.kementan.pusdatin.meetingroomapp.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by PUSDATIN15 on 8/28/2017.
 */

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.ViewHolder> {

    private List<Room> rooms;
    private Context mCtx;

    public RoomAdapter(List<Room> rooms, Context mCtx) {
        this.rooms = rooms;
        this.mCtx = mCtx;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_rooms, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RoomAdapter.ViewHolder holder, int position) {
        final Room room = rooms.get(position);
        holder.textViewNameRoom.setText("Nama Ruangan: "+room.getNama_ruangan());
        holder.textViewKapasitas.setText("Kapasitas: "+room.getKapasitas());

    }
        @Override
        public int getItemCount() {
            return rooms.size();
        }


        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView textViewNameRoom;
            public TextView textViewKapasitas;

            public ViewHolder(View itemView) {
                super(itemView);

                textViewNameRoom = (TextView) itemView.findViewById(R.id.textViewRoomName);
                textViewKapasitas = (TextView) itemView.findViewById(R.id.textViewKapasitas);
            }
        }
    }
