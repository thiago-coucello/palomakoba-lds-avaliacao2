package com.palomakoba.estudodebotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  
  private Button btnBotao1, btnBotao2;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    inicializarComponentes();
    
    btnBotao1.setOnClickListener(v -> Toast.makeText(this, "Este é o botão 1", Toast.LENGTH_SHORT).show());
    
    btnBotao2.setOnClickListener(v -> {
      Intent intent = new Intent(this, SegundaActivity.class);
      startActivity(intent);
    });
  }
  
  private void inicializarComponentes() {
    btnBotao1 = findViewById(R.id.btnBotao1);
    btnBotao2 = findViewById(R.id.btnBotao2);
  }
}