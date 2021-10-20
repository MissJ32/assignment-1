package com.example.thecakeadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class CakeAdvisorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake_advisor);
    }
  //
    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox)view).isChecked();

        switch(view.getId()){
            case R.id.checkBox_Sponge:
                if (checked){
                    //i dont know what i want it to do yet
                }

        }
    }
}