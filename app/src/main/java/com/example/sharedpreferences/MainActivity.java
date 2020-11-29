package com.example.sharedpreferences;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    int pos=1;
    int full=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().equals("X") || b1.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b1.setText("X");
                    else
                        b1.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                //Toast.makeText(getBaseContext(),winner,Toast.LENGTH_SHORT).show();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().equals("X") || b2.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b2.setText("X");
                    else
                        b2.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().equals("X") || b3.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b3.setText("X");
                    else
                        b3.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().equals("X") || b4.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b4.setText("X");
                    else
                        b4.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().equals("X") || b5.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b5.setText("X");
                    else
                        b5.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().equals("X") || b6.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b6.setText("X");
                    else
                        b6.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().equals("X") || b7.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b7.setText("X");
                    else
                        b7.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().equals("X") || b8.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b8.setText("X");
                    else
                        b8.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {

                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().equals("X") || b9.getText().equals("O"))
                    ;
                else {
                    if (checkPos(pos))
                        b9.setText("X");
                    else
                        b9.setText("O");
                    pos++;
                    ++full;
                }
                String winner=checkWiner();
                if(winner != null && !winner.equals("")) {
                    showAlert(winner);
                }
                else if(full==9)
                {
                    Toast.makeText(getBaseContext(),"The Board Is Full",Toast.LENGTH_SHORT).show();
                    cleanGame();
                }
            }
        });
    }

    public boolean checkPos(int pos)
    {
        if(pos%2!=0)
            return true; // x
        return false; //y

    }
    public String checkWiner()
    {
        if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText()))
            return (String) b1.getText();
        if(b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText()))
            return (String) b4.getText();
        if(b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText()))
            return (String) b7.getText();
        if(b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText()))
            return (String) b1.getText();
        if(b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText()))
            return (String) b2.getText();
        if(b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText()))
            return (String) b3.getText();
        if(b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()))
            return (String) b1.getText();
        if(b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText()))
            return (String) b3.getText();
        return null;
    }
    public void cleanGame()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        pos=1;
        full=0;
    }
    public void showAlert(String winner)
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Congratulations "+winner);
        alert.setMessage("Do you want to play again");
        alert.setCancelable(false);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                cleanGame();
            }
        });
        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();

            }
        });
        alert.show();
    }

  
}