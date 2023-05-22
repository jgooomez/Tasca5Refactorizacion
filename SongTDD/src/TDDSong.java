import java.util.ArrayList;

public class TDDSong {
    public String generaCancion (ArrayList<String> listaAnimales) {
        String cancion = "";
        String animal;
        String animalAnterior;
        String animalSiguiente;

        for (int i = 0; i < listaAnimales.size(); i++) {
            animal = listaAnimales.get(i);
            cancion += "There was an old lady who swallowed a " + animal + ".\n";

            if (i > 0) {
                cancion += "That wriggled and wiggled and tickled inside her.\n";

                for (int j = i; j > 0 ; j--) {

                }
            }
        }
    }
}
