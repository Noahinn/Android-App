package com.example.asus.myapplication;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final ImageView img1 = (ImageView) findViewById(R.id.imgMain);
//        final ImageView img = (ImageView) findViewById(R.id.imgMain1);
//        img.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // your code here
//                v.getId();
//                img1.setImageResource(R.drawable.logo);
//            }
//        });
    }
    public void onClick(View v) {
        // your code here
        int a = v.getId();
        final ImageView img = (ImageView) findViewById(R.id.imgMain);
        final ImageView img1 = (ImageView) findViewById(a);
        Drawable drawable = img1.getDrawable();
        BitmapDrawable bitmapDrawable = ((BitmapDrawable) drawable);
        Bitmap bitmap = bitmapDrawable .getBitmap();
        img.setImageBitmap(bitmap);
    }
}
