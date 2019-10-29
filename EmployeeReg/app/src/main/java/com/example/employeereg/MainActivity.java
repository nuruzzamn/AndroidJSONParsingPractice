package com.example.employeereg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=(Button) findViewById(R.id.clickHere);
    }

    public void clickHere(View view) {
        Intent cli=new Intent(MainActivity.this, Categories.class);
        startActivity(cli);
    }
}
