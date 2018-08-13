package org.akhsan.greendaotes.View;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.akhsan.greendaotes.R;
import org.akhsan.greendaotes.User;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<User> list;
    Context context;

    public MyAdapter(List<User> list, Context context){
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MyViewHolder item=(MyViewHolder) viewHolder;
        User user=list.get(i);

        item.getName().setText(user.getName());

        Log.e("name",user.getName());
    }


    @Override
    public int getItemCount() {

        return list.size();
    }
}
