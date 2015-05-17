package audiolibros.example.com.audiolibros;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.Vector;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends Application {
    private Vector<Libro> vectorLibro;
    private AdapterLibros adapter;

    public void onCreated (){
        vectorLibro = Libro.ejemploLibros();
        adapter = new AdapterLibros(this, vectorLibro);
    }

    public AdapterLibros getAdapter(){
        return adapter;
    }
    public Vector<Libro> getVectorLibro(){
        return vectorLibro;
    }

}