package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nishkarsh on 26/03/15.
 */
public class ResultActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
    }

    public void calculate(View view) {
        TextView result = (TextView) findViewById(R.id.result);

        Integer num = getIntent().getIntExtra("Result", 0);
        result.setText(num.toString());

        EditText numThree = (EditText) findViewById(R.id.number_input_three);

        Intent intent = new Intent();

        intent.putExtra("Result", (num - Integer.parseInt(String.valueOf(numThree.getText()))));

        setResult(4, intent);
        finish();
    }
}
