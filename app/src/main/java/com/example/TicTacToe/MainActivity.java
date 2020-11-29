package com.example.TicTacToe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button [][] buttons=new Button[3][3];
    private boolean player1Turn=true;
    private int roundCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                String buttonId="button_" + i + j;
                int resId=getResources().getIdentifier(buttonId,"id",getPackageName());
                buttons[i][j]=findViewById(resId);
                buttons[i][j].setOnClickListener(this);

            }
            
        }









        }












    public boolean checkWinner()
    {
        String[][] field=new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j]=buttons[i][j].getText().toString();

            }

        }
        for (int i = 0; i < 3; i++) {
            if(field[i][0].equals(field[i][1]) && field[i][0].equals(field[i][2])
                && !field[i][0].equals("")
                ){
                return true;

            }
        }
        for (int i = 0; i < 3; i++) {
            if(field[0][i].equals(field[1][i]) && field[0][i].equals(field[2][i])
                    && !field[0][i].equals("")
            ){
                return true;

            }
        }
        if(field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2])
                && !field[0][0].equals("")
        ){
            return true;

        }
        if (field[0][2].equals(field[1][1]) && field[0][2].equals(field[2][0])
                && !field[0][2].equals("")
            )
        {
            return true;

        }
        return false;


    }

    private void showAlert(String winner)
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Congratulations "+winner);
        alert.setMessage(" Play again ? ");
        alert.setCancelable(false);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                resetBoard();
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


    @Override
    public void onClick(View v) {
        if(!((Button) v) .getText().toString().equals(""))
        {
            return ;
        }
        if(player1Turn){
             ((Button) v).setText("X");
        }
        else{
            ((Button) v).setText("O");
        }
        roundCount++;
        if(checkWinner()){
            if(player1Turn){
                player1Wins();
            }else{
                player2Wins();
            }
        }else if(roundCount==9){
            draw();
        }else{
            player1Turn=!player1Turn;
        }

    }
    private void player1Wins(){
        showAlert("X");
        Toast.makeText(this, "player 1 wins", Toast.LENGTH_SHORT).show();

    }
    private void player2Wins(){
        showAlert("O");
        Toast.makeText(this, "player 2 wins", Toast.LENGTH_SHORT).show();


    }
    private void draw(){
        Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
        resetBoard();

    }
    private void resetBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");

            }

        }
        roundCount=0;
        player1Turn=true;
    }
}