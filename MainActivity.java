import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("motleycrew") && password.getText().toString().equals("12345")){
                    //correct
                    Toast.makeText(MainActivity.this,"AUTHENTICATION APPROVED",Toast.LENGTH_SHORT).show();
                    openstartApp();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"AUTHENTICATION UNAPPROVED",Toast.LENGTH_SHORT).show();

            }
        });

        }
    private void openstartApp() {
        Intent intent = new Intent(this,startApp.class);
        startActivity(intent);
    }


    }