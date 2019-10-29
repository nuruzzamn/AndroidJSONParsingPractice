package com.example.employeereg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    private Button bsc,bsce,hc,hsce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        bsc=(Button) findViewById(R.id.BSE);
        bsce=(Button) findViewById(R.id.BSCE);
        hc=(Button) findViewById(R.id.HSE);
        hsce=(Button) findViewById(R.id.HSCE);

    }

    public void BaseSE(View view) {

        Intent BS=new Intent(Categories.this,BaseSalariedEmployee.class);
        startActivity(BS);
    }

    public void BaseSCE(View view) {
        Intent BSC=new Intent(Categories.this,BaseSalaryCommission.class);
        startActivity(BSC);
    }

    public void HourlySE(View view) {

        Intent HS=new Intent(Categories.this,HourlySalary.class);
        startActivity(HS);

    }

    public void HourlySCE(View view) {
        Intent HCS=new Intent(Categories.this,HourlySalaried_Commission.class);
        startActivity(HCS);
    }
}
