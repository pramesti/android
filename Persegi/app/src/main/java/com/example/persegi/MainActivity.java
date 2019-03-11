package com.example.persegi;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editSisi, edithasil, editKeliling;
    private Button btnOk;
    private TextView txtSisi, txtLuas, txtKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }
    private void initUI() {
        txtSisi=(TextView) findViewById(R.id.txtsisi);
        txtLuas=(TextView) findViewById(R.id.txtLuas);
        txtKeliling=(TextView) findViewById(R.id.txtKeliling);
        editSisi=(EditText) findViewById(R.id.editSisi);
        edithasil=(EditText) findViewById(R.id.edithasil);
        editKeliling=(EditText) findViewById(R.id.editKeliling);
        btnOk=(Button) findViewById(R.id.btnOk);
    }
    private void initEvent() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }
    private void hitungLuas() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi * sisi;
        edithasil.setText(luas+"");
    }
    private void hitungKeliling(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4 * sisi;
        editKeliling.setText(keliling+"");
    }
}
