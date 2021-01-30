package com.example.simple_form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<Bean> bean;
    private Context context;
    private Dao dao;

    public Adapter(List<Bean> bean, Context context) {
        this.bean = bean;
        this.context = context;
        dao = new Dao(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_main, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Bean b = bean.get(position);

        holder.id.setText(Integer.toString(b.getId()));
        holder.name.setText(b.getName());
        holder.last_name.setText(b.getLast_name());
        holder.choose_state.setText(b.getState());
        holder.city.setText(b.getCity());
        holder.address.setText(b.getAddress());
        holder.telephone.setText(Integer.toString(b.getTelephone()));
        holder.cellphone.setText(Integer.toString(b.getCellphone()));
    }

    @Override
    public int getItemCount() {
        return bean.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView id;
        private EditText name, last_name, choose_state, city, address, telephone, cellphone, email;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.text_id);
            name = itemView.findViewById(R.id.name);
            last_name = itemView.findViewById(R.id.last_name);
            choose_state = itemView.findViewById(R.id.choose_state);
            city = itemView.findViewById(R.id.city);
            address = itemView.findViewById(R.id.address);
            telephone = itemView.findViewById(R.id.telephone);
            cellphone = itemView.findViewById(R.id.cellphone);
            email = itemView.findViewById(R.id.email);
        }
    }
}
