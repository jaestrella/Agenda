package com.iesvirgendelcarmen.dam.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String[]artistas={"MIGUEL ANGEL","LEONARDO","BOTICELLI","DONATELLO","RAFAEL","PERUGINO"};
    final String[]provincias={"JAEN","CORDOBA","GRANADA","SEVILLA","MALAGA","CADIZ","HUELVA","ALMERIA"};
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         <TextView
        android:id="@+id/textAutoComplete"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/autoComplete"/>

    <AutoCompleteTextView
        android:id="@+id/TextAuto"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:completionHint="Elige un artista"
        android:completionThreshold="1"/>

    <TextView
        android:id="@+id/textMultiComplete"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/multiComplete"/>

    <MultiAutoCompleteTextView
        android:id="@+id/MultiText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:completionHint="Elige un artista"
        android:completionThreshold="1"/>

    <TextView
        android:id="@+id/textSpinner"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/spinner"/>

    <Spinner
        android:id="@+id/spinner"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

        */

        /*ArrayAdapter<String>adaptadorAuto=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,artistas);
        AutoCompleteTextView texto=(AutoCompleteTextView)findViewById(R.id.TextAuto);
        texto.setAdapter(adaptadorAuto);

        ArrayAdapter<String>adaptadorMulti=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,artistas);
        MultiAutoCompleteTextView texto2=(MultiAutoCompleteTextView)findViewById(R.id.MultiText);
        texto2.setAdapter(adaptadorMulti);
        texto2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,provincias));*/

        final EditText etNombre=(EditText)findViewById(R.id.nombre);
        final EditText etEdad=(EditText)findViewById(R.id.edad);
        final EditText etEmail=(EditText)findViewById(R.id.email);

        tv=(TextView)findViewById(R.id.resultado);

        Button boton=(Button)findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato=etNombre.getText().toString();
                int dato2=Integer.parseInt(etEdad.getText().toString());
                String dato3=etEmail.getText().toString();


                tv.setText("Nombre: "+dato+"\nEdad: "+dato2+"\nEmail: "+dato3);

            }
        });

    }
}
