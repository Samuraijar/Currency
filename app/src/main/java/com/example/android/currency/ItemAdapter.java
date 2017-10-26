package com.example.android.currency;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by NORMAL on 10/21/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private LayoutInflater inflater;
    ArrayList<CurrencyFlags> currencyFlags = new ArrayList<>();
    CurrencyFlags current;
    int currentPos=0;

    public ItemAdapter(Context context, ArrayList<CurrencyFlags> currencyFlags) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.currencyFlags = currencyFlags;
    }

    @Override
    public RecyclerView.ViewHolder
    onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.container, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder = (MyHolder) holder;
        CurrencyFlags current = currencyFlags.get(position);
        myHolder.moneyFlag.setText(current.flag);
        myHolder.btcValue.setText(current.btcValue.toString());
        myHolder.ethValue.setText(current.ethValue.toString());


    }
    @Override
    public int getItemCount() {
        return currencyFlags.size();
    }
    class MyHolder extends RecyclerView.ViewHolder {

        TextView moneyFlag;
        TextView btcValue;
        TextView ethValue;
        public MyHolder(View itemView) {
            super(itemView);
            moneyFlag = (TextView) itemView.findViewById(R.id.moneyFlag);
            btcValue = (TextView) itemView.findViewById(R.id.btcValue);
            ethValue = (TextView) itemView.findViewById(R.id.ethValue);

        }
    }

}
