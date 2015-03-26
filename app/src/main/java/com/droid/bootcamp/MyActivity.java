package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void add(View view){
        EditText numOne = (EditText) findViewById(R.id.number_input_one);
        EditText numTwo = (EditText) findViewById(R.id.number_input_two);

        Integer result = Integer.parseInt(String.valueOf(numOne.getText())) + Integer.parseInt(String.valueOf(numTwo.getText()));

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("Result", result);
        startActivityForResult(intent, 5);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(data.getIntExtra("Result", 0)));
    }
}
