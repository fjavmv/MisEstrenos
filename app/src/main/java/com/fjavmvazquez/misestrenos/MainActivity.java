package com.fjavmvazquez.misestrenos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ImageView mImageViewRegistrar;
    ImageView mImageViewConsultar;
    TextView mTextViewRegistrar;
    TextView mTextViewConsultar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultamos barras de estado y action bar
        ocultarBarraDeEstado();
        //Inicializamos componentes
        inicializarComponentes();
        //onClick
        mImageViewConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display(view.toString());
            }
        });

        mTextViewConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display(view.toString());
            }
        });
        mImageViewRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display(view.toString());
            }
        });
        mTextViewRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display(view.toString());
            }
        });

    }

    public void inicializarComponentes(){
        mImageViewConsultar = findViewById(R.id.imgvConsultar);
        mImageViewRegistrar = findViewById(R.id.imgvRegistrar);
        mTextViewRegistrar = findViewById(R.id.txtRegistrar);
        mTextViewConsultar = findViewById(R.id.txtConsultar);
    }

    public void onClick(View v){

    }


    public void ocultarBarraDeEstado(){
        //Permite ocultar el actionBar
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void display(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }
}