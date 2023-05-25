package paci.iut.classroomcommunity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private String email = "email@gmail.com";
    private String mdp = "mdp1234";
    private String userName = "Sashtiga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView backToHomeButton = findViewById(R.id.backHomeButton);
        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button login = findViewById(R.id.loginButton);
        TextView email = findViewById(R.id.emailText);
        TextView mdp = findViewById(R.id.mdpText);
        String rightMdp = this.mdp;
        String rightEmail = this.email;
        String username = this.userName;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals(rightEmail) && mdp.getText().toString().equals(rightMdp)) {
                    Toast t = Toast.makeText(getApplicationContext(), "Vous êtes connecté !", Toast.LENGTH_SHORT);
                    t.show();
                    Intent profilPage = new Intent(getApplicationContext(), HomeActivity.class);
                    profilPage.putExtra("user", userName);
                    startActivity(profilPage);
                    finish();
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(), "L'email ou le mot de passe ne corresponds pas.", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

    }
}