package danielfnz.com.br.listviewexemplo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import danielfnz.com.br.listviewexemplo.model.Time;

/**
 * Created by Alunoinf_2 on 02/02/2019.
 */

public class TimesAdapter extends ArrayAdapter<Time> {

    private final Context context;
    private final ArrayList<Time> elementos;

    public TimesAdapter(Context context, ArrayList<Time>elementos){
        super(context,R.layout.item, elementos);
        this.context = context;
        this.elementos = elementos;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item,parent,false);

        TextView nome = (TextView) rowView.findViewById(R.id.nome);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        nome.setText(elementos.get(position).getNome());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }
}

