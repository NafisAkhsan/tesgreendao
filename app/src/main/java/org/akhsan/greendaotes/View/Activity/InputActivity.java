package org.akhsan.greendaotes.View.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.akhsan.greendaotes.R;
import org.akhsan.greendaotes.Repository;
import org.akhsan.greendaotes.User;

public class InputActivity extends AppCompatActivity {

    Button submit;
    EditText nameText,addressText;
    Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        submit=findViewById(R.id.submit);
        nameText=findViewById(R.id.name);
        addressText=findViewById(R.id.address);

        repository=new Repository();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User();
                user.setAddress(addressText.getText().toString().trim());
                user.setName(nameText.getText().toString().trim());
                repository.addData(user);

                Log.e("size",String.valueOf(addressText.getText().toString().trim())+nameText.getText().toString().trim());

                Toast.makeText(InputActivity.this,"Add user success",Toast.LENGTH_LONG).show();
            }
        });
    }
}
