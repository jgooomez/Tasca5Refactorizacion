import java.util.ArrayList;

public class TDDSong {
    public String generaCancion (ArrayList<String> listaAnimales) {
        String cancion = "";
        String animal;
        String animalAnterior;
        String animalActual;

        for (int i = 0; i < listaAnimales.size(); i++) {
            animal = listaAnimales.get(i);
            cancion += "There was an old lady who swallowed a " + animal + ".\n";

            if (i > 0) {
                cancion += "That wriggled and wiggled and tickled inside her.\n";

                for (int j = i; j > 0 ; j--) {
                    animalAnterior = listaAnimales.get(j - 1);
                    animalActual = listaAnimales.get(j);

                    cancion += "She swallowed the " + animalAnterior + " to catch the " + animalActual + ";\n";
                }
            }

            cancion += "I don't know why she swallowed a " + animal + " - perhaps she'll die!\n\n";
        }

        return cancion;
    }
}
