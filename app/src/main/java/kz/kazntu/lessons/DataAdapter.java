package kz.kazntu.lessons;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{
    private ArrayList<String> countries ;
    public DataAdapter(ArrayList<String> countries){
        this.countries = countries ;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row, parent, false) ;

        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_country.setText(countries.get(position));
    }


    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_country ;
        public ViewHolder(View view){
            super(view);
            tv_country = (TextView)view.findViewById(R.id.tv_country) ;
        }
    }
}
