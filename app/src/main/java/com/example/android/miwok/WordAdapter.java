package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/5/2.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorResource;
    public WordAdapter(Context context, ArrayList<Word> words,int colorResourceid){
        super(context,0,words);
        colorResource = colorResourceid;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word w = getItem(position);
        TextView foreText = (TextView) listItemView.findViewById(R.id.fore_text_view);
        foreText.setText(w.getmMiwokTranslation());
        TextView nativeText = (TextView) listItemView.findViewById(R.id.native_text_view);
        nativeText.setText(w.getmDefaultTranslation());
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        if(w.hasImage()){
            imageView.setImageResource(w.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colorResource);
        textContainer.setBackgroundColor(color);
//        final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(),w.getmRadioId());
//        listItemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.start();
//            }
//        });
        return listItemView;
    }
}
