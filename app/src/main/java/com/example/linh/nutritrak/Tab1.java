package com.example.linh.nutritrak;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Duong D.T. Nguyen on 6/17/2017.
 */

public class Tab1 extends Fragment {

    private TextView tview,tviewfat,tviewcho,tviewsod,tviewpot,tviewcar,tviewpro;
    private ImageView iview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle b){
        this.tview = (TextView) view.findViewById(R.id.image_details);
        this.iview = (ImageView) view.findViewById(R.id.main_image);
        this.tviewfat = (TextView) view.findViewById(R.id.tab2fatdata);
        this.tviewcho = (TextView) view.findViewById(R.id.tab2chodata);
        this.tviewsod = (TextView) view.findViewById(R.id.tab2soddata);
        this.tviewpot = (TextView) view.findViewById(R.id.tab2potdata);
        this.tviewcar = (TextView) view.findViewById(R.id.tab2cardata);
        this.tviewpro = (TextView) view.findViewById(R.id.tab2prodata);

    }

    public TextView getTextView(){
        return tview;
    }
    public ImageView getImageview(){
        return iview;
    }

    public void setText(String s){
        tview.setText(s);
    }

    public void setImage(Bitmap bm){
        iview.setImageBitmap(bm);
    }


}
