package edu.temple.colorspinner;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class ColorAdapter extends BaseAdapter {
    private Context context;
    private String[] colors;

    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView textView = new TextView(context);

        String colorVal = colors[i];

        textView.setText(colorVal);

        textView.setBackgroundColor(Color.parseColor(colorVal));


        return textView;
    }
}
