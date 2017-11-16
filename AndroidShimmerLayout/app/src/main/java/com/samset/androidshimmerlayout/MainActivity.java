package com.samset.androidshimmerlayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.samset.samsetshimmerlayout.views.ShimmerRecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ShimmerRecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.showShimmerAdapter();

        recyclerView.postDelayed(new Runnable() {
            @Override
            public void run() {
                //recyclerView.hideShimmerAdapter();
                recyclerView.setAdapter(new ShimmerAdapter(MainActivity.this));
            }
        }, 10000);
    }


    public class ShimmerAdapter extends RecyclerView.Adapter<ShimmerAdapter.MyViewHolder> {
        private Context context;

        public ShimmerAdapter(Context ctx) {
            this.context = ctx;
        }

        @Override
        public int getItemCount() {
            return 20;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
            return new MyViewHolder(itemView);

        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {
                holder.container.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(intent);
                    }
                });
        }


        public class MyViewHolder extends RecyclerView.ViewHolder {
            LinearLayout container;


            public MyViewHolder(View view) {
                super(view);
                container = view.findViewById(R.id.llcontainer);

            }
        }

    }

}
