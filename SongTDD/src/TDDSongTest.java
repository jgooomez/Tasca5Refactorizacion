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

    @org.junit.jupiter.api.Test
    void testGeneraCancionSpider() {
        listaAnimales.add("spider");
        String resultadoActual = song.generaCancion(listaAnimales);
        String resultadoEsperado = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" ;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @org.junit.jupiter.api.Test
    void testGeneraCancionFlySpider() {
        listaAnimales.add("fly");
        listaAnimales.add("spider");
        String resultadoActual = song.generaCancion(listaAnimales);
        String resultadoEsperado = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n"+
                "There was an old lady who swallowed a spider.\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @org.junit.jupiter.api.Test
    void testGeneraCancionSpiderFly() {
        listaAnimales.add("spider");
        listaAnimales.add("fly");
        String resultadoActual = song.generaCancion(listaAnimales);
        String resultadoEsperado = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "There was an old lady who swallowed a fly.\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";
        assertEquals(resultadoEsperado, resultadoActual);
    }

}