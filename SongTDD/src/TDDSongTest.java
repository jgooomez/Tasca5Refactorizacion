import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {
    TDDSong song = new TDDSong();
    ArrayList<String> listaAnimales = new ArrayList<>();

    @org.junit.jupiter.api.Test
    void testGeneraCancionVacia() {
        String resultadoActual = song.generaCancion(listaAnimales);
        String resultadoEsperado = "";
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @org.junit.jupiter.api.Test
    void testGeneraCancionFly() {
        listaAnimales.add("fly");
        String resultadoActual = song.generaCancion(listaAnimales);
        String resultadoEsperado = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" ;;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}