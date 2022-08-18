package br.edu.ifsp.scl.ads.pdm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.pdm.views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // referência para classe de viewBinding
    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
    }

    public void onClickBotao(View botao) {
        if (botao.getId() == R.id.salvarBt) {
            Toast.makeText(this, "Clicou em Salvar", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Clicou no Limpar", Toast.LENGTH_SHORT).show();
        }
    }
}