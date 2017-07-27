package com.example.guillo.umgloggin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {
    private EditText edt1;
    private EditText edt2;
    private ListView lv1;
    private List<String> resultado;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        resultado=new ArrayList<>();
        resultado.add("RESPUESTAS");


        edt1= (EditText) findViewById(R.id.et1);
        edt2= (EditText) findViewById(R.id.et2);
        lv1= (ListView) findViewById(R.id.lv1);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,resultado);
        lv1.setAdapter(adapter);
    }
    public void add(View view){
        String value=(edt1.getText().toString()+ "       " +edt2.getText().toString());
        resultado.add(value);
        adapter.notifyDataSetChanged();
        edt1.setText("");
        edt2.setText("");

}
}