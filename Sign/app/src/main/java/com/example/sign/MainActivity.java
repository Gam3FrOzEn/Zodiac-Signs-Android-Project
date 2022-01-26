package com.example.sign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<SignData> signDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        prepareSignData();

    }

   private void prepareSignData(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ImageView imageView = findViewById(R.id.imageView);

        SignAdapter signAdapter = new SignAdapter(this, signDataList);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(signAdapter);

        String[] signArray = {"taurus", "gemini", "cancer", "leo", "virgo", "libra", "scorpio", "sagittarius", "capricorn", "aquarius", "pisces"};

        SignData signData = new SignData("ARIES", "aries_sign", imageView);
        signDataList.add(signData);
        for(String sign:signArray){
            signData = new SignData(sign.toUpperCase(), sign.toLowerCase()+"_sign", imageView);
            signDataList.add(signData);
       }
    }
}