package org.akhsan.greendaotes.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.akhsan.greendaotes.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView name;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.item_name );
    }

    public TextView getName() {
        return name;
    }
}
