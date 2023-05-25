package paci.iut.classroomcommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView profilTextView = findViewById(R.id.profilName);
        profilTextView.setText(getIntent().getStringExtra("user"));
        profilTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        profilTextView.setTextSize(20);
        String[] questions = new String[4];
        questions[0] = "Question 1 : quel pays fait parti de l'Europe ?";
        questions[1] = "Question 2 : Que fait 1 + 1 ?";
        questions[2] = "Question 3 : xxxx ?";
        questions[3] = "Question 4 : xxxx ?";
        String[][] reponses = new String[4][4];
        reponses[0][0] = "France.";
        reponses[0][1] = "Algerie";
        reponses[0][2] = "Chine";
        reponses[0][3] = "Bresil";
        reponses[1][0] = "0";
        reponses[1][1] = "1";
        reponses[1][2] = "-1";
        reponses[1][3] = "2";
        reponses[2][0] = "reponse A de la question 3.";
        reponses[2][1] = "reponse B de la question 3.";
        reponses[2][2] = "reponse C de la question 3.";
        reponses[2][3] = "reponse D de la question 3.";
        reponses[3][0] = "reponse A de la question 4.";
        reponses[3][1] = "reponse B de la question 4.";
        reponses[3][2] = "reponse C de la question 4.";
        reponses[3][3] = "reponse D de la question 4.";

        TextView question = findViewById(R.id.question);
        TextView option1 = findViewById(R.id.reponseA);
        TextView option2 = findViewById(R.id.reponseB);
        TextView option3 = findViewById(R.id.reponseC);
        TextView option4 = findViewById(R.id.reponseD);
        question.setText(questions[0]);
        option1.setText(reponses[0][0]);
        option2.setText(reponses[0][1]);
        option3.setText(reponses[0][2]);
        option4.setText(reponses[0][3]);

    }
}