
# SkillPath – Tech Career Advisor

### Discover Your Path in Technology 🚀

SkillPath is an interactive Android application designed to help students and beginners discover technology career paths that align with their interests.

Through a short assessment, users receive personalized career recommendations, explore essential technical skills, and discover practical steps to begin their career journey.

---

## 📌 Project Overview

Choosing a career path in technology can be challenging, especially for students and beginners who are unfamiliar with the available opportunities.

SkillPath simplifies this process by providing an interactive career assessment and personalized recommendations.

The application uses a rule-based scoring system to identify suitable career paths based on users' answers.

### Objectives

- Help users explore technology career opportunities.
- Identify career paths based on individual interests.
- Provide personalized career recommendations.
- Introduce essential technical skills.
- Suggest practical next steps for learning.

---

## ✨ Key Features

### Interactive Career Assessment
- 8 multiple-choice questions.
- 4 answer options per question.
- Visual feedback when selecting answers.
- Progress tracking throughout the assessment.

### Personalized Career Matching
- Automatic score calculation.
- Recommendations based on selected answers.
- Displays the top two matching career paths.
- Shows the score for each recommended career.

### Career Exploration
- Detailed career descriptions.
- Recommended technical skills.
- Suggested learning steps.

### User-Friendly Navigation
- Simple navigation between screens.
- Ability to retake the assessment.
- Options to return to the results or home screen.

---

## 💼 Supported Career Paths

SkillPath currently supports four technology career paths:

1. Data Analyst
2. Software Developer
3. Cybersecurity Specialist
4. UI/UX Designer

---

## 📱 Application Screens

### 1. Welcome Screen
Introduces the application and allows users to begin the career assessment.

### 2. Assessment Screen
Displays interactive multiple-choice questions with a progress indicator.

### 3. Results Screen
Shows the two highest-scoring career paths based on the user's responses.

### 4. Career Details Screen
Provides career information, essential skills, and recommended next steps.

---

## ⚙️ How It Works

1. Launch the SkillPath application.
2. Select **Start Assessment**.
3. Answer eight multiple-choice questions.
4. The application calculates scores based on the selected answers.
5. The two highest-scoring career paths are displayed.
6. Explore the recommended career's details.
7. Retake the assessment to explore different results.

### Career Recommendation Logic

SkillPath uses a rule-based scoring system implemented in Java.

Each answer contributes to one of four career categories. The application calculates the total scores and identifies the two highest-scoring career paths.

The recommendation process runs locally without requiring artificial intelligence, external APIs, or a database.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Android Studio | Development and testing |
| Java | Application logic and interactions |
| XML | User interface layouts |
| Android SDK | Android application functionality |
| Gradle | Build configuration |

---

## 📂 Project Structure

    app/
    └── src/
        └── main/
            ├── java/
            │   └── [application package]/
            │       ├── MainActivity.java
            │       ├── AssessmentActivity.java
            │       ├── ResultActivity.java
            │       └── CareerDetailsActivity.java
            ├── res/
            │   ├── layout/
            │   └── drawable/
            └── AndroidManifest.xml

---

## 🚀 Getting Started

### Requirements

- Android Studio
- Android SDK
- Android emulator or compatible Android device

### Installation

1. Clone the repository:

       git clone https://github.com/progamal/SkillPath-Tech-Career-Advisor.git

2. Open the project in Android Studio.
3. Wait for Gradle Sync to finish.
4. Select an Android emulator or connect an Android device.
5. Click **Run** to launch the application.

---

## 🧪 Testing

SkillPath was manually tested using the Android emulator.

The following features were verified:

- Screen navigation
- Answer selection
- Assessment progress tracking
- Score calculation
- Career recommendation results
- Career details display
- Retake assessment functionality

---

## 🔮 Future Enhancements

- Expand the available career paths.
- Add more assessment questions.
- Allow users to save their results.
- Include recommended learning resources.
- Improve accessibility and personalization.

---

## 🎯 Conclusion

SkillPath provides a simple and interactive approach to exploring technology career opportunities.

By combining a user-friendly interface with rule-based career recommendations, the application helps users identify potential career paths and understand the skills needed to get started.

---

**SkillPath – Discover Your Path in Technology.**
