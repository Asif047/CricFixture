package com.example.asif047.cricketzzz;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Asif on 9/12/2017.
 */

public class CricketAdapter extends ArrayAdapter<CricInfoResponse.Datum> {


    private Context context;
    private List<CricInfoResponse.Datum> cricInfoList;

    TextView nameTV;
    TextView dateTV;


    public CricketAdapter(Context context, List<CricInfoResponse.Datum> cricInfoList) {
        super(context,R.layout.single_list_row,cricInfoList);

        this.context=context;
        this.cricInfoList=cricInfoList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.single_list_row,parent,false);

        nameTV= (TextView) convertView.findViewById(R.id.name_texview);
        dateTV= (TextView) convertView.findViewById(R.id.date_texview);

        nameTV.setText(cricInfoList.get(position).getName()+"");
        dateTV.setText(cricInfoList.get(position).getDate()+"");

        return convertView;

    }

    @Override
    public int getCount() {
        return cricInfoList.size();
    }

    @Nullable
    @Override
    public CricInfoResponse.Datum getItem(int position) {
        return cricInfoList.get(position);
    }
}
