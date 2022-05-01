package com.example.coder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
EditText user_name,password;
Button login,Cancel;
String  correct_name="hammum";


        String correct_password="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        user_name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        //
        login=findViewById(R.id.login);
        login.setOnClickListener(this);
        //
        Cancel=findViewById(R.id.cancel);
        Cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){



            case R.id.login:
                String name2=user_name.getText().toString();
                String password2=password.getText().toString();
if ( name2.equalsIgnoreCase(correct_name) &&password2.equalsIgnoreCase(correct_password)){
    Toast.makeText(this,"تم",Toast.LENGTH_LONG).show();


}
else {
    Toast.makeText(this,"filed",Toast.LENGTH_LONG).show();
}





            break;
            case R.id.cancel:
user_name.setText("");
password.setText("");

                break;
        }

    }
}