package com.example.myducument.quanliquan.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.myducument.quanliquan.R;
import com.example.myducument.quanliquan.object.BanHang;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class AdapterListViewBanHang extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<BanHang> objects = new ArrayList<>();

    public AdapterListViewBanHang(Context context, int resource, ArrayList<BanHang> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_banhang,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.tv_soban = convertView.findViewById(R.id.tv_soban);
            viewHolder.tv_songuoi = convertView.findViewById(R.id.tv_songuoi);
            viewHolder.tv_giasanpham = convertView.findViewById(R.id.tv_giasanpham);
            viewHolder.tv_tensanpham = convertView.findViewById(R.id.tv_tensanpham);
            viewHolder.tv_sosanpham = convertView.findViewById(R.id.tv_sosanpham);
            viewHolder.btn_huy = convertView.findViewById(R.id.btn_huy);
            viewHolder.btn_thutien = convertView.findViewById(R.id.btn_thutien);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        BanHang tmp = objects.get(position);
        viewHolder.tv_soban.setText(tmp.getSoBan()+"");
        viewHolder.tv_songuoi.setText(tmp.getSoNguoi()+"");
        viewHolder.tv_giasanpham.setText(tmp.getSoTien()+"");
        viewHolder.tv_tensanpham.setText(tmp.getTenMatHang());
        viewHolder.tv_sosanpham.setText(tmp.getSoLuongMatHang()+"");

        return convertView;
    }
    public class ViewHolder {
        TextView tv_soban,tv_songuoi,tv_tensanpham,tv_giasanpham,tv_sosanpham;
        Button btn_huy,btn_thutien;

    }
}
