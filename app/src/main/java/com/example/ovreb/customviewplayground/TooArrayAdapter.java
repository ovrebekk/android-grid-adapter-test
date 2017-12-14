package com.example.ovreb.customviewplayground;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ovreb on 14.12.2017.
 */

public class TooArrayAdapter extends BaseAdapter {
    private final Context context;
    private final TooObjectManager mObjectManager;

    public TooArrayAdapter(@NonNull Context context, @NonNull TooObjectManager tooObjectManager) {
        this.context = context;
        mObjectManager = tooObjectManager;
    }

    @Override
    public int getCount() {
        return mObjectManager.getCount();
    }

    @Override
    public Object getItem(int i) {
        return mObjectManager.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.too_list_layout, parent, false);
        TooObject myObject = mObjectManager.get(position);

        TextView textView = (TextView) rowView.findViewById(R.id.secondLine);
        textView.setText(myObject.mText);

        textView = (TextView)rowView.findViewById(R.id.firstLine);
        textView.setText(myObject.mHeader);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        switch(myObject.mImgIndex){
            case 0:
                imageView.setImageResource(R.drawable.icon_1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.icon_2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.icon_3);
                break;
            default:
                imageView.setImageResource(R.drawable.icon_4);
                break;
        }

        return rowView;
    }
}
