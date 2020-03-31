package com.example.alertdialog25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlert;
    int index = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAlert = findViewById(R.id.buttonAlert);

        mBtnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo mới");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                //Mảng con vật
                final String[] arrayAnimals = {"Mèo","Chó","Heo","Gà","Voi","Ngựa"};
                // Single choice
                builder.setSingleChoiceItems(arrayAnimals, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        index = i;
                    }
                });
                builder.setPositiveButton("Chọn", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, arrayAnimals[index] , Toast.LENGTH_SHORT).show();
                    }
                });
                // Multiple choice


                builder.show();
            }
        });
    }
}
