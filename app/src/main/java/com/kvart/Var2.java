package com.kvart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Var2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_var2);

        TextView txtView = (TextView) findViewById(R.id.textView2);
        txtView.setText("Negative values n = n-2 - n-1: \n" + fibonacci());
    }

    private String fibonacci () {
        List<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(0);
        listFibonacci.add(-1);

        for (int i = 2; i <= 20; i++) {
            listFibonacci.add(listFibonacci.get(i - 2) - listFibonacci.get(i - 1));
        }

        return listFibonacci.toString();
    }
}
