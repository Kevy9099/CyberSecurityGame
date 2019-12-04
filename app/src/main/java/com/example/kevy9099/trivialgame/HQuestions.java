package com.example.kevy9099.trivialgame;

class HQuestions {
    final String[] questionsArray = {
            "A program designed to damage or compromise a computer or network?",
            "A Hacker who identifies and exploits weaknesses in telephones.",
            "A hacker who uses hacking to send social, religious, and political messages.",
            "which one is a non-skilled person who gains access to computer system using existing tools?",
            "What is the process of encoding information in a way others cannot read or access?",
            "What is the act of following keystrokes of the user?",
            "Which one is ensures that your network/computer is secure?",
            "On February 7,2000, who orchestrated DoS against several e-commerce sites?",
            "Practice and study for securing information and communication mainly protecting data.",
            "What detects intrusions and the administrator has to take care of preventing intrusion?",
            "What detects the intrusion and also takes action to prevent intrusion?",
            "Which one converts readable data to unreadable data and cannot be converted back?",
            "What tool shows the path of the packets?",
            "An entity unintentionally send data to an unauthorized person do to a fault.",
            "Authorized entity sends data to an unauthorized entity on purpose.",
            "Hacking techniques to cause data leakage.",
            "Responsible for transmission of digital data from sender to receiver through the communication media.",
            "Handles the movement of data to and from the physical link. It is also responsible for encoding and decoding of data bits.",
            "Responsible for packet forwarding and providing routing paths for network communication.",
            "Responsible for end-to-end communication of the network.",
            "Controls connection between the sender and the receiver.",
            "Deals with presenting the data in a proper format and data structure instead of sending raw data or packets.",
            "Provides interface between the application and the network.",
            "What is used to create a safe and encrypted connection?"

    };

    private final String[][] allChoices = {
            {"Malware", "Trojan", "SQL Injection", "DDOS"},
            {"Phreaker", "Hacktivist", "Script Kiddies", "Grey Hat Hacker"},
            {"Script Kiddies", "Phreaker", "Hacktivist", "Blue Hat Hacker"},
            {"Little kids", "Programmer", "Script Kiddies", "White Hat Hacker"},
            {"Coding", "Encryption", "Redaction", "Decryption"},
            {"Fingerprinting", "Copy & Paste", "KeyLogging", "Data Hacking"},
            {"Anti-Virus", "Updated Systems", "Fire-Wall", "All the Above"},
            {"Resilient", "Astra", "mafiaBoy", "King Chili"},
            {"Cryptography","Encryption","Cryptology","Encryptology"},
            {"IDS","IPS","IPD","IDK"},
            {"DIP","IDS","IPS","COD"},
            {"Encrypting","Decrypting","Analyzing","Hashing"},
            {"GPS","Routetrace","Traceroot","Directions"},
            {"System Hack","Accidental Breach","Intentional Breach","Hacking"},
            {"Intentional Breach","Accidental Breach","System Hack","Data Leakage"},
            {"Intrusion","Data Leakage","Cyber Attack","System Hack"},
            {"Physical Layer","Network Layer","Data Link Layer","Transport Layer"},
            {"Session Layer","Data Link Layer","Network Layer","Transport Layer"},
            {"Transport Layer","Network Layer","Presentation Layer","Session Layer"},
            {"Transport Layer","Application Layer","Physical Layer", "Network Layer"},
            {"Physical Layer","Session Layer","Session Layer","Network Layer"},
            {"Network Layer","Application Layer","Session Layer","Presentation Layer"},
            {"Physical Layer","Application Layer","Transport Layer","Session Layer"},
            {"VPN","VIP","CPN","SPN"}
    };

    private final String[] correctAnswers = {"Malware", "Phreaker", "Hacktivist", "Script Kiddies",
        "Encryption", "KeyLogging", "All the Above", "mafiaBoy","Cryptography","IDS","IPS",
        "Hashing", "Traceroute","Accidental Breach","Intentional Breach","System Hack",
        "Physical Layer","DataL Link Layer","Network Layer","Transport Layer","Session Layer",
        "Presentation Layer","Application Layer","VPN"};

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
