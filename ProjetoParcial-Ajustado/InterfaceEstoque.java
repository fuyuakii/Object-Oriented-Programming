// Autor: Carlos Gabriel Baratieri

public interface InterfaceEstoque {
    void cadastrarManga(Manga manga);
    void consultar();           // Sobrecarga
    void consultar(int codigo); // Sobrecarga
    void excluirManga();
    void atualizarMangaEspecifica();
    void atualizarMangaCompleta();
}
