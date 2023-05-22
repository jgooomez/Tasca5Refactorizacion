import java.util.ArrayList;

public class TDDSong {
    public String generaCancion(ArrayList<String> listaAnimales) {
        String cancion = "";
        String animal;
        String animalAnterior;
        String animalActual;

        for (int i = 0; i < listaAnimales.size(); i++) {
            animal = listaAnimales.get(i);
            cancion += "There was an old lady who swallowed a " + animal + ".\n";

            if (i > 0) {
                cancion += "That wriggled and wiggled and tickled inside her.\n";

                for (int j = i; j > 0; j--) {
                    animalAnterior = listaAnimales.get(j - 1);
                    animalActual = listaAnimales.get(j);

                    cancion += "She swallowed the " + animalActual + " to catch the " + animalAnterior + ".\n";
                }
            }

            if (i < listaAnimales.size() - 1) {
                cancion += "I don't know why she swallowed a " + animal + " - perhaps she'll die!\n";
            } else {
                cancion += "I don't know why she swallowed a " + listaAnimales.get(0) + " - perhaps she'll die!\n";
            }
        }

        return cancion;
    }

}
