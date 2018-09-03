package com.example.newgen.tugasmosja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] aritmatika = {"silahkan pilih", "tambah(+)", "kurang(-)", "kali(*)", "bagi(/)"};
    EditText et1;
    EditText et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, aritmatika);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
        spin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(getApplicationContext(), aritmatika[position] , Toast.LENGTH_LONG).show();
        //deklarasi
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        String dt1 = et1.getText().toString();
        String dt2 = et2.getText().toString();
        tv1 = (TextView) findViewById(R.id.tvhasil);
        //deklarasi variable
        int n1 = Integer.valueOf(dt1);
        int n2 = Integer.valueOf(dt2);
        //mengatifkan
        int iCurrentSelection = spin.getSelectedItemPosition();
//        Toast.makeText(getApplicationContext(), iCurrentSelection , Toast.LENGTH_LONG).show();

        if (iCurrentSelection == 1) {
            // Your code here
            n1 = n1 + n2;
            tv1.setText(String.valueOf(n1));
        } else if (iCurrentSelection == 2) {
            // Your code here
            n1 = n1 - n2;
            tv1.setText(String.valueOf(n1));
        } else if (iCurrentSelection == 3) {
            // Your code here
            n1 = n1 * n2;
            tv1.setText(String.valueOf(n1));

        } else if (iCurrentSelection == 4) {
            // Your code here
            double nb = n1 / n2;
            tv1.setText(String.valueOf(nb));

        }
//       iCurrentSelection = position;
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
//    }
//    public int tambah(int nilai1, int nilai2){
//        return (nilai1+nilai2);
//    }
//    public int kurang(int nilai1, int nilai2){
//        return (nilai1-nilai2);
//    }
//    public double bagi(double nilai1, double nilai2){
//        return (nilai1/nilai2);
//    }
//    public int kali(int nilai1, int nilai2){
//        return (nilai1*nilai2);
//    }
    }
}
