package com.example.musik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.musik.adapter.ListAdapter;
import com.example.musik.api.helper.ServiceGenerator;
import com.example.musik.api.models.Envelope;
import com.example.musik.api.models.Song;
import com.example.musik.api.services.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DaftarActivity extends AppCompatActivity {
    List song = new ArrayList<>();
    ListAdapter listAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        recyclerView = findViewById(R.id.rv_teams);

        LinearLayoutManager layoutManager = new LinearLayoutManager(DaftarActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        listAdapter = new ListAdapter(DaftarActivity.this, song);
        recyclerView.setAdapter(listAdapter);

        loadData();
    }

    private void loadData() {
        ApiInterface apiService = ServiceGenerator.createService(ApiInterface.class);
        Call<Envelope<List<Song>>> call = apiService.getLagu("21c5ff23", "jsonpretty", "");
        call.enqueue(new Callback<Envelope<List<Song>>>() {
            @Override
            public void onResponse(Call<Envelope<List<Song>>> call, Response<Envelope<List<Song>>> response) {
                listAdapter.setLagu(response.body().getResults());
            }

            @Override
            public void onFailure(Call<Envelope<List<Song>>> call, Throwable t) {
                Toast.makeText(DaftarActivity.this, "Gagal Menampilkan Data Lagu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
