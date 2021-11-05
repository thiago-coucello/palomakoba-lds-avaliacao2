package com.palomakoba.estudodebotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {
  
  private Button btnVoltar;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_segunda);
    
    inicializarComponentes();
    
    btnVoltar.setOnClickListener(v -> finish());
  }
  
  private void inicializarComponentes() {
    btnVoltar = findViewById(R.id.btnVoltar);
  }
}