package danielfnz.com.br.listviewexemplo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import danielfnz.com.br.listviewexemplo.R;
import danielfnz.com.br.listviewexemplo.model.Curso;
import danielfnz.com.br.listviewexemplo.model.EstadoAtual;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ListView lista = (ListView) findViewById(R.id.lista);
        List<Curso> cursos = todosOsCursos();
        ArrayAdapter<Curso> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cursos);
        lista.setAdapter(adapter);

    }

    private List<Curso> todosOsCursos() {

        return new ArrayList<>(Arrays.asList(
                new Curso("Java", "básico de Java", EstadoAtual.FINALIZADO),
                new Curso("HTML e CSS", "HTML 5 e suas novidades", EstadoAtual.FAZENDO),
                new Curso("Android", "boas práticas", EstadoAtual.FINALIZADO)));
    }
}
