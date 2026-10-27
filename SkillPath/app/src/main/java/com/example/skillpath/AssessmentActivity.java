package com.example.skillpath;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AssessmentActivity extends AppCompatActivity {

    private TextView tvQuestion, tvProgress;
    private ProgressBar progressBar;
    private RadioGroup rgAnswers;
    private RadioButton[] options = new RadioButton[4];
    private Button btnNext;

    private int currentQuestion = 0;
    private int[] scores = new int[4];

    // Career order:
    // 0 = Data Analysis
    // 1 = Software Development
    // 2 = Cybersecurity
    // 3 = UI/UX Design

    private final String[] questions = {
            "What do you enjoy the most?",
            "Which task sounds most interesting?",
            "What would you like to learn?",
            "Which problem would you rather solve?",
            "What kind of project excites you?",
            "Which tool would you explore first?",
            "What is your strongest interest?",
            "Which achievement would make you proud?"
    };

    private final String[][] answers = {
            {
                    "Analyzing data and finding patterns",
                    "Building applications and writing code",
                    "Protecting systems from attacks",
                    "Designing creative interfaces"
            },
            {
                    "Creating reports from information",
                    "Developing a mobile application",
                    "Finding security vulnerabilities",
                    "Improving an application's appearance"
            },
            {
                    "SQL and data visualization",
                    "Java and programming",
                    "Network security",
                    "Figma and design principles"
            },
            {
                    "Understanding why sales dropped",
                    "Fixing a software bug",
                    "Preventing unauthorized access",
                    "Making an app easier to use"
            },
            {
                    "An interactive dashboard",
                    "A useful mobile app",
                    "A secure computer system",
                    "A beautiful website design"
            },
            {
                    "Power BI",
                    "Android Studio",
                    "Security testing tools",
                    "Figma"
            },
            {
                    "Discovering useful insights",
                    "Solving programming challenges",
                    "Investigating cyber threats",
                    "Creating visual experiences"
            },
            {
                    "Helping a company make data-driven decisions",
                    "Publishing my own application",
                    "Protecting users from cyberattacks",
                    "Designing an intuitive digital product"
            }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);

        tvQuestion = findViewById(R.id.tvQuestion);
        tvProgress = findViewById(R.id.tvProgress);
        progressBar = findViewById(R.id.progressBar);
        rgAnswers = findViewById(R.id.rgAnswers);
        btnNext = findViewById(R.id.btnNext);

        options[0] = findViewById(R.id.rbOption1);
        options[1] = findViewById(R.id.rbOption2);
        options[2] = findViewById(R.id.rbOption3);
        options[3] = findViewById(R.id.rbOption4);


        showQuestion();

        btnNext.setOnClickListener(v -> {

            int selectedId = rgAnswers.getCheckedRadioButtonId();

            if (selectedId == -1) {
                Toast.makeText(
                        this,
                        "Please select an answer",
                        Toast.LENGTH_SHORT
                ).show();
                return;
            }

            for (int i = 0; i < options.length; i++) {
                if (options[i].getId() == selectedId) {
                    scores[i]++;
                    break;
                }
            }

            currentQuestion++;

            if (currentQuestion < questions.length) {
                showQuestion();
            } else {
                finishAssessment();
            }
        });
    }

    private void showQuestion() {
        tvQuestion.setText(questions[currentQuestion]);

        tvProgress.setText(
                "Question " + (currentQuestion + 1)
                        + " of " + questions.length
        );

        progressBar.setMax(questions.length);
        progressBar.setProgress(currentQuestion + 1);

        rgAnswers.clearCheck();

        for (int i = 0; i < options.length; i++) {
            options[i].setText(answers[currentQuestion][i]);
        }

        if (currentQuestion == questions.length - 1) {
            btnNext.setText("See Results");
        } else {
            btnNext.setText("Next →");
        }
    }


    private void finishAssessment() {
        android.content.Intent intent =
                new android.content.Intent(this, ResultActivity.class);

        intent.putExtra("scores", scores);
        startActivity(intent);
        finish();
    }

}
