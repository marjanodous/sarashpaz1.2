package com.example.sarashpaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Menu extends AppCompatActivity {

    private ImageView imgBackDastebandi;
    public static String titleMenu;
    TextView txtTitle;
    ///////set Grid item
    //نام های قابل نمایش
//    GridView grid;
//    String[] texts = {
////            "Appinapps",
////            "Google",
////            "Apple",
////            "Dell",
////            "Asus",
////            "Samsung",
////            "Sony",
////            "Nokia",
////            "Microsoft",
////            "Android"
//    } ;
//    //تصاویر قابل نمایش
//    int[] imags = {
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
////            R.drawable.ic_cancel,
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        txtTitle=findViewById(R.id.txttitledastehbandi);
        txtTitle.setText(titleMenu);
        imgBackDastebandi=findViewById(R.id.img_backdastehbandi);
  ///back to dastebandi
        imgBackDastebandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
 //////معرفی یک اداپتر
//        CustomGrid adapter = new CustomGrid(Menu.this,texts,imags);
//        grid = findViewById(R.id.grid_menu);
//        grid.setAdapter(adapter);
////ایجاد قابلیت کلیک برای ایتم های گرید ویو
//        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            //با استفاده از این دستور بر روی هرکدوم از ایتم ها کلیک بشه نام اون رو نمایش بده
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
////                Toast.makeText(Menu.this, "You Clicked at " +texts[+ i],  Toast.LENGTH_SHORT).show();
//            }
//        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(android.view.Menu menu) {
////        return super.onCreateOptionsMenu(menu);
////        getMenuInflater().inflate(R.menu.bottom_navigation,menu);
//        return true;
//    }

    //======================change font===============================
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
