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
}