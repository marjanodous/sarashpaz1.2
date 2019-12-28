package com.example.sarashpaz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGrid extends BaseAdapter {

    private Context context;
    private String[] text;
    private int[] img;

    public CustomGrid(Context context, String[] text, int[] img) {
        this.context = context;
        this.text = text;
        this.img = img;
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
        grid =inflater.inflate(R.layout.item_menu,null);
        TextView textView=grid.findViewById(R.id.txt_itemmenu);
        ImageView imageView=grid.findViewById(R.id.img_itemmenu);
        textView.setText(text[i]);
        imageView.setImageResource(img[i]);
        }
        else {
            grid =viewGroup;
        }
        return grid;
    }
}
