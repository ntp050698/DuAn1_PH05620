package com.abc.phongnguyen.duan_cafemanage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.abc.phongnguyen.duan_cafemanage.model.Coffee;

import java.util.ArrayList;


public class CoffeeMenuAdapter extends ArrayAdapter<Coffee> {

    private Context mContext;
    private int layoutResourceId;
    private ArrayList data = new ArrayList();

    public CoffeeMenuAdapter(Context context, int layoutResourceId, ArrayList data){
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = context;
        this.data = data;
    }
    static class ViewHolder{
        TextView imageTitle;
        ImageView image;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){


        ViewHolder holder = null;
        Coffee currentCoffee = getItem(position);

        if (convertView == null) {

            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
            holder = new ViewHolder();
            holder.imageTitle = (TextView) convertView.findViewById(R.id.tea_grid_name);
            holder.image = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();;
        }

        holder.imageTitle.setText(currentCoffee.getTeaName());
        holder.image.setImageResource(currentCoffee.getImageResourceId());
        return convertView;
    }
}
