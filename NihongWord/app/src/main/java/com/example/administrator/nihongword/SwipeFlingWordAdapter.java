package com.example.administrator.nihongword;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by WangZeshuang on 2016/12/20.
 */

public class SwipeFlingWordAdapter extends BaseAdapter {
    private ArrayList<Word> mList;
    private int mWidth;
    private int mHeight;
    private int mColor=0xFF8BC34A;

    public SwipeFlingWordAdapter(int width,int height) {
        mList = new ArrayList<>();
        mWidth = width;
        mHeight = height;
    }

    public void randomColor(){
        int[] colors= {0xff8BC34A,0xff607D8B,0xff673AB7,0xffFF5722,0xff795548,0xffE91E63};
        Random random = new Random();
        mColor = colors[random.nextInt(6)];
        notifyDataSetChanged();
    }

    public void addAll(Collection<Word> collection) {
        if (isEmpty()) {
            mList.addAll(collection);
            notifyDataSetChanged();
        } else
            mList.addAll(collection);
    }

    public boolean isEmpty() {
        return mList.isEmpty();
    }

    public void remove(int index) {
        if (index > -1 && index < mList.size()) {
            mList.remove(index);
            notifyDataSetChanged();
        }
    }

    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (mList != null)
            return mList.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        if (mList == null || mList.size() == 0) return null;
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        Word word = (Word) getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_new_item, parent, false);
            holder = new ViewHolder();
            convertView.setTag(holder);
            convertView.getLayoutParams().width = mWidth;
//            convertView.getLayoutParams().height = mHeight;
            holder.findViewById(convertView);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.bind(word,mColor);
        return convertView;
    }

    private class ViewHolder {
        TextView tVjpWord;
        TextView tVJpCnWord;
        TextView tVCnWord;

        public void findViewById(View convertView) {
            tVjpWord = (TextView) convertView.findViewById(R.id.japanese_word);
            tVJpCnWord = (TextView) convertView.findViewById(R.id.chinese_jp_word);
            tVCnWord = (TextView) convertView.findViewById(R.id.chinese_word);
        }

        public void bind(Word word,int color) {
            tVjpWord.setText(word.getJpWord());
            tVjpWord.setTextColor(color);
            tVCnWord.setTextColor(color);
            tVJpCnWord.setTextColor(color);
            tVJpCnWord.setText(word.getJpCnWord());
            tVCnWord.setText(word.getCnWord());
        }
    }
}
