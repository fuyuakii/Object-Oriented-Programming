// Autor: Carlos Gabriel Baratieri

public class InformacoesEditoriais {

    private EditorialJaponesa editorialJaponesa;
    private EditorialBrasileira editorialBrasileira;
    private Volume volume;
    private String isbn;

    public InformacoesEditoriais() {
        this.editorialJaponesa = new EditorialJaponesa();
        this.editorialBrasileira = new EditorialBrasileira();
        this.volume = new Volume();
        this.isbn = "";
    }

    public EditorialJaponesa getEditorialJaponesa() {
        return editorialJaponesa;
    }

    public void setEditorialJaponesa(EditorialJaponesa editorialJaponesa) {
        this.editorialJaponesa = editorialJaponesa;
    }

    public EditorialBrasileira getEditorialBrasileira() {
        return editorialBrasileira;
    }

    public void setEditorialBrasileira(EditorialBrasileira editorialBrasileira) {
        this.editorialBrasileira = editorialBrasileira;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
