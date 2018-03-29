package com.example.tcsexam.trainingday1;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spin1, spin2, spin3, spin4, spin5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting screen orientation
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //Handling Screen Orientation
        /*
        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        if (display.getWidth()>display.getHeight()){
            showResult("Landscape");
        } else
            showResult("Portrait");

        */
        String[] Cities = {"Mumbai","Bhopal","Kolkata","Indore","Baisalpur","Raipur","Kanpur","Pune"};
        spin1 = findViewById(R.id.spinner1);
        spin2 = findViewById(R.id.spinner2);
        spin3 = findViewById(R.id.spinner3);
        spin4 = findViewById(R.id.spinner4);

        spin5 = findViewById(R.id.spinner5);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                (getBaseContext(),android.R.layout.simple_dropdown_item_1line,Cities);

        spin1.setAdapter(adapter1);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                showResult("Spin1:" + spin1.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                showResult("Spin2:" + spin2.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (getBaseContext(),R.array.spin2,android.R.layout.simple_spinner_dropdown_item);

        spin3.setAdapter(adapter2);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                showResult("Spin3:" + spin3.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayList<String> list = new ArrayList<>();
        list.add("Kolkata");
        list.add("Kolhapur");
        list.add("Mumbai");
        list.add("Bhopal");
        list.add("Azamgarh");
        list.add("Pune");
        list.add("Jalan");
        list.add("Varanasi");
        list.add("Jaunpur");
        list.add("Barabanki");
        list.add("Kanpur");
        list.add("Lucknow");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>
                (getBaseContext(),android.R.layout.simple_spinner_dropdown_item,list);
        spin4.setAdapter(adapter3);
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                showResult("Spin4:" + spin4.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>
                (getBaseContext(),android.R.layout.simple_spinner_dropdown_item,list);
        spin5.setAdapter(adapter4);
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                showResult("Spin5:" + spin5.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Setting AutoCompleteTextView
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter3);
        autoCompleteTextView.setThreshold(2);
    }
    public void showResult(String selectedItem){
        Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_LONG).show();
    }
}
