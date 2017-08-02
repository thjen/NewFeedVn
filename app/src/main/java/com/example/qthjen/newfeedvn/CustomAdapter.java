package com.example.qthjen.newfeedvn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context          mContext;
    int              mLayout;
    List<Attributes> mList;

    public CustomAdapter(Context context, int layout, List<Attributes> list) {

        mContext = context;
        mLayout  = layout;
        mList    = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {

        ImageView ivList;
        TextView  tvList;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder = new ViewHolder();

        if ( view == null ) {

            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(mLayout, null);

            viewHolder.ivList = (ImageView) view.findViewById(R.id.ivList);
            viewHolder.tvList = (TextView)  view.findViewById(R.id.tvList);

            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Picasso.with(mContext).load(mList.get(i).mImage).into(viewHolder.ivList);
        viewHolder.tvList.setText(mList.get(i).mTitle);

        return view;
    }
}
