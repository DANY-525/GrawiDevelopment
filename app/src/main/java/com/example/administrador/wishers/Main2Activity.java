package com.example.administrador.wishers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        ProgramacionAdapter  programacionAdapter=new ProgramacionAdapter(this);



        GridView gridView=(GridView)findViewById(R.id.grid);


        gridView.setAdapter(programacionAdapter);




    }
}
