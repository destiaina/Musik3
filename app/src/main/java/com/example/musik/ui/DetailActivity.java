package com.example.musik.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import com.example.musik.R;

import java.net.URI;

public class DetailActivity extends AppCompatActivity {

    private Button download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        download = findViewById(R.id.dwn);


       // download.getOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View v) {
       //         openWebPage(urlaudio);
       //     }
       // });

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void newDownload(String url) {
        DownloadManager downloadmanager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri webpage = Uri.parse(url);
        DownloadManager.Request request  = new DownloadManager.Request(webpage);
        request.setTitle("My File");
        request.setDescription("Downloading");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "music.mp3");
        downloadmanager.enqueue(request);
    }

     public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        intent.setDataAndType(webpage, "audio/*");
        startActivity(intent);
    }
}
