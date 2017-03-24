package com.example.administrator.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next(View view){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
        finish();
    }
    public void web(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.2345.com")));
    }
    public void call(View view){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tell:"+"15118063659")));
    }
    public void app(View view){
        Intent intent=new Intent();
        intent.setClassName("com.example.administrator.myapplication","com.example.administrator.myapplication.MainActivity");
        startActivity(intent);
    }
}
