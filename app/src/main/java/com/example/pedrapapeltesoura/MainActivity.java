package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionadoPedra(View view){
        this.opcaoSelecao("Pedra");
    }
    public void selecionadoPapel(View view){
        this.opcaoSelecao("Papel");
    }
    public void selecionadoTesoura(View view){
        this.opcaoSelecao("Tesoura");
    }

    public void opcaoSelecao(String opcaoSelecao){
        ImageView imgresult = findViewById(R.id.imageResultado);
        TextView txtresult = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3); //cria aleatorio de 0, 1, 2
        String[] opcoes = {"Pedra","Papel","Tesoura"}; //Array
        String opcApp = opcoes[numero]; // variavel com a opcao do app array[indice]

        switch (opcApp){
            case "Pedra":
                imgresult.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imgresult.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imgresult.setImageResource(R.drawable.tesoura);
                break;

        }

        if (opcApp == opcaoSelecao){
            txtresult.setText("Empatou");

        } else if(
                (opcApp == "Pedra" && opcaoSelecao == "Papel")||
                (opcApp == "Papel" && opcaoSelecao == "Tesoura")||
                (opcApp == "Tesoura" && opcaoSelecao=="Pedra") ){ //usuario ganha
            txtresult.setText("Você Ganhou!");

        } else {
            txtresult.setText("Você Perdeu");
        }
    }
}
