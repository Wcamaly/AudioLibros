package audiolibros.example.com.audiolibros;

import java.util.Vector;

/**
 * Created by Wally1 on 17/05/2015.
 */
public class Libro {
    public String titulo;
    public String autor;
    public int image;
    public String UrlAudio;
    public String genero;
    public boolean novedad;
    public boolean leido;
    public final static String G_TODOS = "Todos los Géneros";
    public final static String G_EPICO = "Poema épico";
    public final static String G_S_XIX = "Literatura siglo XIX";
    public final static String G_SUPENSE = "Suspense";
    public final static String[] G_ARRAY = new String[] {G_TODOS, G_EPICO, G_S_XIX, G_SUPENSE};
    public Libro(String titulo, String autor, int image, String url, String genero, boolean novedad, boolean leido){
        this.autor = autor;this.titulo = titulo; this.image = image; this.UrlAudio = url; this.genero = genero;
        this.novedad = novedad; this.leido = leido;
    }
    public static Vector<Libro> ejemploLibros(){
        final String SERVIDOR = "http://www.dcomg.upv.es/~jtomas/android/audiolibros/";
        Vector<Libro> libros = new Vector<Libro>();
        libros.add(new Libro("Kappa", "Akutagawa", R.drawable.kappa, SERVIDOR + "Kapa.mp3", Libro.G_S_XIX, false, false ));
        libros.add(new Libro("Avecilla", "Alas Clarin, Leopoldo", R.drawable.avecilla, SERVIDOR + "avecilla.mp3", Libro.G_S_XIX, false, false ));
        libros.add(new Libro("Divina Comedia", "Dante", R.drawable.divinacomedia, SERVIDOR + "divina_comedia.mp3", Libro.G_EPICO, true, false ));
        libros.add(new Libro("VIejo Pancho, El", "Alonso y Trelles, José", R.drawable.viejo_pancho, SERVIDOR + "viejo_pancho.mp3", Libro.G_S_XIX, true, true ));
        libros.add(new Libro("Canción de Ronaldo", "Anónima", R.drawable.cancion_rolando, SERVIDOR + "cancion_rolando.mp3", Libro.G_EPICO, false, true ));
        libros.add(new Libro("Matrimonio de sabuesos", "Agata Christie", R.drawable.matrimonio_sabuesos, SERVIDOR + "matrim_sabuesos.mp3", Libro.G_SUPENSE, false, true ));
        libros.add(new Libro("La iliada", "Homero", R.drawable.iliada, SERVIDOR + "la_iliada.mp3", Libro.G_EPICO, true, false ));

        return libros;



    }

}
