package com.mango.autumnleaves.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.mango.autumnleaves.R;
import com.squareup.picasso.Picasso;

public class AboutActivity extends AppCompatActivity {
    private ImageView mFiqry , mFeby , mGbs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        mFiqry = findViewById(R.id.imgFiqry);
        mFeby = findViewById(R.id.imgFeby);
        mGbs = findViewById(R.id.profilegbs);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/mango-master.appspot.com/o/fiqrychoerudin.jpg?alt=media&token=f4972769-a84f-4b45-8d54-c65050243391").into(mFiqry);
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/mango-master.appspot.com/o/febby.jpg?alt=media&token=28aeb238-b23b-4410-b99f-0a2f204e7379").into(mFeby);
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/mango-master.appspot.com/o/Gandeva-Bayu-Satrya-ST.-MT.jpg?alt=media&token=3f362d56-0e04-4fee-b3dc-b0f40e132735").into(mGbs);
    }
}
