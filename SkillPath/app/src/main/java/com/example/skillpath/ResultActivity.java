package com.example.skillpath;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private final String[] careers = {
            "Data Analyst",
            "Software Developer",
            "Cybersecurity Specialist",
            "UI/UX Designer"
    };

    private final String[] descriptions = {
            "Analyze data, discover patterns, and support better decisions.",
            "Build applications and solve problems using programming.",
            "Protect systems, networks, and information from cyber threats.",
            "Design intuitive and engaging digital experiences."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int[] scores = getIntent().getIntArrayExtra("scores");

        if (scores == null || scores.length != 4) {
            scores = new int[]{0, 0, 0, 0};
        }

        int first = 0;
        int second = 1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > scores[first]) {
                first = i;
            }
        }

        second = first == 0 ? 1 : 0;

        for (int i = 0; i < scores.length; i++) {
            if (i != first && scores[i] > scores[second]) {
                second = i;
            }
        }

        TextView tvTopCareer = findViewById(R.id.tvTopCareer);
        TextView tvTopDescription = findViewById(R.id.tvTopDescription);
        TextView tvTopScore = findViewById(R.id.tvTopScore);

        TextView tvSecondCareer = findViewById(R.id.tvSecondCareer);
        TextView tvSecondDescription = findViewById(R.id.tvSecondDescription);
        TextView tvSecondScore = findViewById(R.id.tvSecondScore);

        tvTopCareer.setText(careers[first]);
        tvTopDescription.setText(descriptions[first]);
        tvTopScore.setText("Match Score: " + scores[first] + " / 8");

        tvSecondCareer.setText(careers[second]);
        tvSecondDescription.setText(descriptions[second]);
        tvSecondScore.setText("Match Score: " + scores[second] + " / 8");

        final int selectedCareer = first;

        Button btnCareerDetails = findViewById(R.id.btnCareerDetails);
        btnCareerDetails.setOnClickListener(v -> {
            Intent intent = new Intent(this, CareerDetailsActivity.class);
            intent.putExtra("careerIndex", selectedCareer);
            startActivity(intent);
        });

        Button btnRetake = findViewById(R.id.btnRetake);
        btnRetake.setOnClickListener(v -> {
            Intent intent = new Intent(this, AssessmentActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
