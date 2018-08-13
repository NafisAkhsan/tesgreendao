package org.akhsan.greendaotes.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import org.akhsan.greendaotes.R;
import org.akhsan.greendaotes.Repository;
import org.akhsan.greendaotes.User;
import org.akhsan.greendaotes.View.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView listView;
    Repository repository;
    MyAdapter adapter;
    List<User> list;
    Button input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listUser);
        input=findViewById(R.id.inputButton);

        repository=new Repository();

        list=new ArrayList<>();

        adapter=new MyAdapter(list,this);

        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setHasFixedSize(true);
        listView.setItemAnimator(new DefaultItemAnimator());
        listView.setAdapter(adapter);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InputActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        list.clear();
        list.addAll(repository.getAllData());
        adapter.notifyDataSetChanged();


    }
}
