package com.example.kevy9099.trivialgame;

class EQuestions {
    final String[] questionsArray = {
            "A program designed to damage or compromise a computer or network?",
            "What do you do when your computer is infected?",
            "What is key logging?",
            "A program that includes worms, viruses, rootkits?",
            "Type of Malware named for a Greek horse?",
            "DoS attack means?",
            "How can you detect a virus?",
            "What is MITM / MiM?",
            "Dumping the database contents to the attacker is what?",
            "What should you do when you receive a unfamiliar sender?",
            "What kind of hacker have malicious intent?",
            "This kind of hacker sometimes hack the law but does not malicious intent?",
            "Expert hacker that refers to ethical hackers, who specializes in testing code",


    };

    private final String[][] allChoices = {
            {"Malware", "Trojan", "SQL Injection", "DDOS"},
            {"Use Anti-virus", "Call 911", "Scream", "Reset Your PC"},
            {"Sticking a key in log", "Starting log with a key", "Making a duplicate key",
                    "Recording Keystrokes"},
            {"DDOS", "Malware", "Trojan", "SQL Injection"},
            {"Trojan", "Pegasus", "Mustang", "Suzie"},
            {"Don't open Service", "Disruption of Service", "Denial of Service", "Down off Service"},
            {"Anti-Virus", "Google", "Help Desk", "Call a Friend"},
            {"Man-in-the-mood", "Man-in-the-middle attack", "Moon-in-the-Margin",
                    "Mike-in-the-Middle"},
            {"Recycling Bin", "Trash Bin", "SQL Injection", "Trojan"},
            {"Open mail", "Delete Mail", "Ignore Mail", "Send Mail"},
            {"Grey Hat Hacker", "White Hat Hacker", "Black Hat Hacker", "Nice Hat Hacker"},
            {"Mean Hat Hacker", "Grey Hat Hacker", "White Hat Hacker", "Grey Hat Hacker"},
            {"White Hat Hacker", "Green Hat Hacker", "Black Hat Hacker", "Grey Hat Hacker"}
    };

    private final String[] correctAnswers = {"Malware", "Use Anti-Virus", "Recording Keystrokes",
        "Malware", "Trojan", "Denial of Service", "Anti-Virus", "Man-in-the-middle attack",
        "SQL Injection", "Ignore Mail", "Black Hat Hacker", "Grey Hat Hacker", "White Hat Hacker"};

    String getQuestion(int a) {
        return questionsArray[a];
    }

    String getChoice1(int a) {
        return allChoices[a][0];
    }

    String getChoice2(int a) {
        return allChoices[a][1];
    }

    String getChoice3(int a) {
        return allChoices[a][2];
    }

    String getChoice4(int a) {
        return allChoices[a][3];
    }

    String getCorrectAnswer(int a) {
        return correctAnswers[a];
    }
}

