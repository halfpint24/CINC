package com.example.cinc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class VSActivity extends AppCompatActivity {

    enum Difficulty {
        EASY, MEDIUM, HARD
    }

    private int currentround = 0;
    private final int NUMROUNDS = 5;
    private Button btn;
    private TextView textview;
    private EditText edittext;
    private String currentquestion;
    private int yourscore = 0;
    private int computerscore = 0;
    private Difficulty difficulty = Difficulty.EASY;
    private final Random r = new Random();
    private HashMap<String, String> problems;
    private ArrayList<String> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs);

        btn = findViewById(R.id.vsbtn);
        textview = findViewById(R.id.textview);
        edittext = findViewById(R.id.edittext);

        problems = new HashMap<String, String>();
        questions = new ArrayList<String>();

        problems.put("Java was created by", "james gosling");
        problems.put("What keyword indicates that the method does not return anything?", "void");
        problems.put("IDE stands for:", "integrated development environment");
        problems.put("JRE stands for:", "java runtime environment");
        problems.put("JDK stands for:", "java development kit");
        problems.put("A byte can store integer numbers from -128 to:", "127");
        problems.put("true or false: Math.random() method returns a number from 0(inclusive) to 1(inclusive)", "false");
        problems.put("true or false: A string is a primitive type.", "false");
        problems.put("fill in the blank: A class can have properties and _______", "methods");
        problems.put("Given that a string has been initialized in the variable str, write the code to find the length of the string.", "str.length();");
        problems.put("Given that an array is stored in the variable arr, write the code to find the number of items in the array.", "arr.length;");
        problems.put("An array is initialized as follows:\nint[] arr = {1,2,3,4};\nWhat will you get when you print arr[3]?", "4");
        problems.put("What special \'class\' is used for storing constants?", "enum");
        problems.put("Consider the following code:\nint num = 1;\nSystem.out.println(num++)\n What is printed out in the console?", "1");
        problems.put("Consider the following code:\nint num = 1;\nSystem.out.println(++num)\n What is printed out in the console?", "2");
        problems.put("Consider the following code:\nArrayList<Integer> arrli = new ArrayList<>();\narrli.add(1);\narrli.add(2);\narrli.add(3)\narrli.remove(2);\narrli.set(1,4);\narrli.add(1,5);\narrli.set(2,6);\nfor(int num : arrli)\nSystem.out.print(num + \" \");\n What is printed?", "1 5 6");

        questions.addAll(problems.keySet());

        AlertDialog.Builder alertdialog = new AlertDialog.Builder(VSActivity.this);
        CharSequence[] difficulties = {"Easy", "Medium", "Hard"};
        alertdialog.setTitle("Select difficulty");
        alertdialog.setPositiveButton("Confirm", null);
        alertdialog.setSingleChoiceItems(difficulties, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                switch(which) {
                    case 0:
                        difficulty = Difficulty.EASY;
                        break;
                    case 1:
                        difficulty = Difficulty.MEDIUM;
                        break;
                    case 2:
                        difficulty = Difficulty.HARD;
                        break;
                }

            }
        });
        alertdialog.show();

        currentquestion = questions.get(r.nextInt(questions.size()));
        textview.setText(currentquestion);

    }

    public void onSubmit(View view) {

        String userresponse = edittext.getText().toString();

        switch(difficulty) {
            case EASY:
                if((r.nextInt(100) < 50)) {
                    computerscore++;
                }
                break;
            case MEDIUM:
                if((r.nextInt(100) < 75)) {
                    computerscore++;
                }
                break;
            case HARD:
                if((r.nextInt(100) < 90)) {
                    computerscore++;
                }
                break;
        }

        if(userresponse.toLowerCase().equals(problems.get(currentquestion))) {
            yourscore++;
            AlertDialog alertdialog = new AlertDialog.Builder(VSActivity.this).create();
            alertdialog.setTitle("Woohoo!");
            alertdialog.setMessage("You got it right!\nScore: " + yourscore);
            alertdialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertdialog.show();
        }
        else {
            AlertDialog alertdialog = new AlertDialog.Builder(VSActivity.this).create();
            alertdialog.setTitle("Oh no!");
            alertdialog.setMessage("Whoops! You got it wrong :(\nThe answer was " + problems.get(currentquestion));
            alertdialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertdialog.show();
        }

        edittext.setText("");
        currentquestion = questions.get(r.nextInt(questions.size()));
        textview.setText(currentquestion);
        currentround++;

        if(currentround >= NUMROUNDS) {
            final Intent intent = new Intent(this, GameActivity.class);
            AlertDialog alertdialog = new AlertDialog.Builder(VSActivity.this).create();
            alertdialog.setTitle("That's the game!");
            alertdialog.setMessage("Game Over!\nYour score: " + yourscore + "\nComputer score: " + computerscore);
            alertdialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertdialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {
                    startActivity(intent);
                }
            });
            alertdialog.show();
        }

    }

}
