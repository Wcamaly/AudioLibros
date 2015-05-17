package audiolibros.example.com.audiolibros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Vector;

/**
 * Created by Wally1 on 17/05/2015.
 */
public class AdapterLibros extends BaseAdapter {
    private LayoutInflater inflater;
    protected Vector<Libro> vectorLibro;
    public AdapterLibros(Context context, Vector<Libro> vectorLibro) {
       inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       this.vectorLibro = vectorLibro;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Libro libro = vectorLibro.elementAt(i);
        if (view == null ){
            view = inflater.inflate(R.layout.elemto_selector, null);
        }
        TextView



        return null;
    }
}
