package com.example.sarashpaz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tozihat extends AppCompatActivity {

    private TextView titleTozihat;
    ImageView imgTozihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_tozihat);

        //////load from recycler_myanvade
        if(ItemAdapter_recycler_myanvade.flag_myanvade==true){
            /////set title tozihat
            titleTozihat = findViewById(R.id.matn_tozihat);
            Bundle bundle = getIntent().getExtras();
            titleTozihat.setText(bundle.getString("title_myanvade"));

            ///////setimage tozihat
            imgTozihat = findViewById(R.id.img_tozihat);
            Bundle bundle1 = getIntent().getExtras();
            Bundle bd = getIntent().getExtras();
            imgTozihat.setImageResource(bd.getInt("image_myanvade"));
        }
//////load from behtarin_dastoor_pokht_ha
        if(ItemAdapter_recycler_behtarin_dastoor_pokht_ha.flag_behtarin_dastoor_pokht_ha==true){
            /////set title tozihat
            titleTozihat = findViewById(R.id.matn_tozihat);
            Bundle bundle = getIntent().getExtras();
            titleTozihat.setText(bundle.getString("title_bdph"));

            ///////setimage tozihat
            imgTozihat = findViewById(R.id.img_tozihat);
            Bundle bundle1 = getIntent().getExtras();
            Bundle bd = getIntent().getExtras();
            imgTozihat.setImageResource(bd.getInt("image_bdph"));
        }
    }

    @Override
    public void onBackPressed() {
        ItemAdapter_recycler_myanvade.flag_myanvade=false;
        ItemAdapter_recycler_behtarin_dastoor_pokht_ha.flag_behtarin_dastoor_pokht_ha=false;
        ItemAdapter_recycler_img.flag_img=false;
        super.onBackPressed();
    }
}
