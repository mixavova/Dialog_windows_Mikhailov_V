package com.example.dialog_windows_mikhailov_v;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFon;
    ConstraintLayout ConstraintLayout;
    Context Context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFon = (Button) findViewById(R.id.id_btn);
        ConstraintLayout = (ConstraintLayout) findViewById(R.id.id_constL);
        Context = MainActivity.this;
        btnFon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);


        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0:
                        ConstraintLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(Context, R.string.red, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        ConstraintLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(Context, R.string.yellow, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                       ConstraintLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(Context, R.string.green, Toast.LENGTH_LONG).show();
                        break;
                }
            }


        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}