// Autor: Carlos Gabriel Baratieri

import java.util.ArrayList;

public class Estoque {

    private static ArrayList<Manga> listaMangas = new ArrayList<>();

    // Construtor default
    public Estoque() {
    }

    public static void cadastrarManga(Manga manga) {
        listaMangas.add(manga);
        System.out.println("Manga cadastrado com sucesso no estoque!");
    }

    public static ArrayList<Manga> getListaMangas() {
        return listaMangas;
    }
    
    public static boolean removerManga(Manga manga) {
        return listaMangas.remove(manga);
    }
}
