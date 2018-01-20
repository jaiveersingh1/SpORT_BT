package com.led.led;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelSelection extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);

        configureLevel1Button();

    }
    private void configureLevel1Button(){
        Button level1Button = (Button) findViewById(R.id.level1Button);
        level1Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LevelSelection.this, Level1.class));
            }
        });
    }
}

