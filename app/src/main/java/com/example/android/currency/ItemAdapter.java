package com.example.android.currency;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by NORMAL on 10/21/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private LayoutInflater inflater;
    List<CurrencyFlags> currencyFlags = Collections.emptyList();
    CurrencyFlags current;
    int currentPos=0;

    public ItemAdapter(Context context, List<CurrencyFlags>currencyFlags) {
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
        myHolder.textbtcUSD.setText("USD:" + current.btcUSD);
        myHolder.textbtcEUR.setText("EUR" + current.btcEUR);
        myHolder.textbtcJPY.setText("JPY" + current.btcJPY);


    }
    @Override
    public int getItemCount() {
        return currencyFlags.size();
    }
    class MyHolder extends RecyclerView.ViewHolder {

        TextView textbtcUSD;
        TextView textbtcEUR;
        TextView textbtcJPY;
        public MyHolder(View itemView) {
            super(itemView);
            textbtcUSD = (TextView) itemView.findViewById(R.id.textbtcUSD);
            textbtcEUR = (TextView) itemView.findViewById(R.id.textbtcEUR);
            textbtcJPY = (TextView) itemView.findViewById(R.id.textbtcJPY);

        }
    }

}
