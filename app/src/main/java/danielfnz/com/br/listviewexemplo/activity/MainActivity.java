package danielfnz.com.br.listviewexemplo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import danielfnz.com.br.listviewexemplo.R;
import danielfnz.com.br.listviewexemplo.TimesAdapter;
import danielfnz.com.br.listviewexemplo.model.Time;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ListView lista = (ListView) findViewById(R.id.lista);
        List<Time> times = todosOsTimes();
        TimesAdapter adapter =  new TimesAdapter(this, (ArrayList<Time>) times);
        lista.setAdapter(adapter);
    }

    private List<Time> todosOsTimes() {

        return new ArrayList<>(Arrays.asList(
                new Time("Flamengo", R.drawable.flamengo),
                new Time("Sao paulo", R.drawable.saopaulo),
                new Time("Vasco", R.drawable.vasco)));
    }
}
