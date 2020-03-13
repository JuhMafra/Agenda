package br.ifrr.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListaDeContatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_contatos);
        ListView lista = (ListView) findViewById(R.id.lista_contatos);
        String nomes[] = {"joão", "maria" , "coisinha","a","b","c","d","e","f","g"};
        ArrayAdapter adaptador=  new ArrayAdapter( this, android.R.layout.simple_list_item_1,nomes);
        lista.setAdapter(adaptador);

        Button btn_novo_contato = (Button) findViewById(R.id.novo_contato);
        btn_novo_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao_formulario = new Intent(ListaDeContatosActivity.this,FormularioActivity.class);
                startActivity(intencao_formulario);
            }
        });
    }
}
