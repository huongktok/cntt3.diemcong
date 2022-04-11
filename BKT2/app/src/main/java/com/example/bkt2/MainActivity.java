package com.example.bkt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtValue = (EditText) findViewById(R.id.edt1);
        CheckBox c13 = (CheckBox) findViewById(R.id.CB1);
        CheckBox c15 = (CheckBox) findViewById(R.id.CB2);
        CheckBox c18 = (CheckBox) findViewById(R.id.CB3);
        Button nutTinh = (Button) findViewById(R.id.btnT);
        TextView tvShow = (TextView) findViewById(R.id.tvShow);

        nutTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tip_value = Double.parseDouble(edtValue.getText().toString());
                if(c13.isChecked() == true){
                    tip_value =  tip_value * 13/100;
                    tvShow.setText(String.valueOf(tip_value));
                }else if (c15.isChecked() == true){
                    tip_value =  tip_value * 15/100;
                    tvShow.setText(String.valueOf(tip_value));
                }else if (c18.isChecked() == true){
                    tip_value =  tip_value * 18/100;
                    tvShow.setText(String.valueOf(tip_value));
                }
            }
        });
    }

}