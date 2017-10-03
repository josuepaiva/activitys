package com.example.josue.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import utils.MementoFormulário;

public class SegundaActivity extends AppCompatActivity {
    private MementoFormulário mementoFormulário;

    @Override
    protected void onStart() {
        Log.d("On Start", "Methodo start");
        if(this.mementoFormulário != null){
            String texto = mementoFormulário.getSolicitante();
            Log.d("TextMemento","Entrou no if");
            EditText texto_recuperado = (EditText) findViewById(R.id.editText);
            texto_recuperado.setText(texto,EditText.BufferType.EDITABLE);
        }

        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("On Stop", "Activity suspensa");
        EditText solicitante =(EditText) findViewById(R.id.editText);

        String texto = solicitante.getText().toString();
        mementoFormulário = new MementoFormulário(texto);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("On Destroy","Activity onDestroy");
        EditText solicitante =(EditText) findViewById(R.id.editText);

        String texto = solicitante.getText().toString();
        mementoFormulário = new MementoFormulário(texto);
        super.onDestroy();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }
}
