package com.example.cinc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class VSActivity extends AppCompatActivity {

    private Button btn;
    private TextView textview;
    private final Random r = new Random();
    private HashMap<String, String> problems;
    private ArrayList<String> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs);

        btn = findViewById(R.id.vsbtn);
        textview = findViewById(R.id.textview);

        problems = new HashMap<String, String>();
        questions = new ArrayList<String>();

        problems.put("Java was created by", "James Gosling");
        problems.put("What keyword indicates that the method does not return anything?", "void");
        problems.put("IDE stands for:", "Integrated Development Environment");
        problems.put("JRE stands for:", "Java Runtime Environment");
        problems.put("JDK stands for:", "Java Development Kit");
        problems.put("A byte can store integer numbers from -128 to:", "127");
        problems.put("true or false: Math.random() method returns a number from 0(inclusive) to 1(inclusive)", "false");
        problems.put("true or false: A string is a primitive type?", "false");
        problems.put("fill in the blank: A class can have properties and _______", "methods");
        problems.put("Given that a string has been initialized in the variable str, write the code to find the length of the string.", "str.length();");
        problems.put("Given that an array is stored in the variable arr, write the code to find the number of items in the array.", "arr.length;");
        problems.put("An array is initialized as follows:\nint[] arr = {1,2,3,4};\nWhat will you get when you print arr[3]?", "4");
        problems.put("What special \'class\' is used for storing constants?", "enum");
        problems.put("Consider the following code:\nint num = 1;\nSystem.out.println(num++)\n What is printed out in the console?", "1");
        problems.put("Consider the following code:\nint num = 1;\nSystem.out.println(++num)\n What is printed out in the console?", "2");
        problems.put("Consider the following code:\nArrayList<Integer> arrli = new ArrayList<>();\narrli.add(1);\narrli.add(2);\narrli.add(3)\narrli.remove(2);\narrli.set(1,4);\narrli.add(1,5);\narrli.set(2,6);\nfor(int num : arrli)\nSystem.out.print(num + \" \");\n What is printed?", "1 5 6");

        questions.addAll(problems.keySet());

        textview.setText(questions.get(r.nextInt(questions.size())));

    }
}
