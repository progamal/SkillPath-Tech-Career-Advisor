package com.example.skillpath;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CareerDetailsActivity extends AppCompatActivity {

    private final String[] careers = {
            "Data Analyst",
            "Software Developer",
            "Cybersecurity Specialist",
            "UI/UX Designer"
    };

    private final String[] descriptions = {
            "Data Analysts collect, clean, and analyze data to discover patterns and help organizations make informed decisions.",

            "Software Developers design, build, test, and maintain applications that solve real-world problems.",

            "Cybersecurity Specialists protect computer systems, networks, and information from cyber threats and unauthorized access.",

            "UI/UX Designers create user-friendly digital products by combining visual design, research, and usability principles."
    };

    private final String[] skills = {
            "• Excel\n• SQL\n• Python\n• Power BI\n• Data Visualization",

            "• Java\n• Python\n• Problem Solving\n• Git\n• Software Testing",

            "• Networking\n• Linux\n• Security Fundamentals\n• Risk Assessment\n• Security Monitoring",

            "• Figma\n• Wireframing\n• Prototyping\n• User Research\n• Usability Testing"
    };

    private final String[] nextSteps = {
            "1. Learn Excel and SQL basics.\n2. Practice analyzing datasets.\n3. Create your first dashboard.",

            "1. Learn programming fundamentals.\n2. Build a small application.\n3. Publish your project on GitHub.",

            "1. Study networking and security basics.\n2. Practice in legal training labs.\n3. Build a security-focused project.",

            "1. Learn Figma and design principles.\n2. Design a mobile app prototype.\n3. Create a UI/UX portfolio."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_details);

        int careerIndex = getIntent().getIntExtra("careerIndex", 0);

        if (careerIndex < 0 || careerIndex >= careers.length) {
            careerIndex = 0;
        }

        TextView tvCareerTitle = findViewById(R.id.tvCareerTitle);
        TextView tvCareerDescription = findViewById(R.id.tvCareerDescription);
        TextView tvCareerSkills = findViewById(R.id.tvCareerSkills);
        TextView tvNextSteps = findViewById(R.id.tvNextSteps);

        tvCareerTitle.setText(careers[careerIndex]);
        tvCareerDescription.setText(descriptions[careerIndex]);
        tvCareerSkills.setText(skills[careerIndex]);
        tvNextSteps.setText(nextSteps[careerIndex]);

        Button btnBackResults = findViewById(R.id.btnBackResults);
        btnBackResults.setOnClickListener(v -> finish());

        Button btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP |
                            Intent.FLAG_ACTIVITY_SINGLE_TOP
            );
            startActivity(intent);
            finish();
        });
    }
}
