// Autor: Carlos Gabriel Baratieri

public class CadastrarShoujo extends CadastrarMangaBase {

    public void executar(String tipoEscolhido, String descricao) {
        Shoujo shoujo = new Shoujo();

        preencherDadosComuns(shoujo);

        switch (tipoEscolhido) {
            case "mahou":
                shoujo.setMahou(descricao);
                // Reflexividade
                shoujo.getGeneros().setAcao(true);
                shoujo.getGeneros().setComedia(true);
                shoujo.getGeneros().setDrama(true);
                shoujo.getGeneros().setSuspense(false);
                shoujo.getGeneros().setTerror(false);
                shoujo.getGeneros().setRomance(true);
                break;
                
            case "seishunDorama":
                shoujo.setSeishunDorama(descricao);
                // Reflexividade
                shoujo.getGeneros().setAcao(false);
                shoujo.getGeneros().setComedia(true);
                shoujo.getGeneros().setDrama(true);
                shoujo.getGeneros().setSuspense(false);
                shoujo.getGeneros().setTerror(false);
                shoujo.getGeneros().setRomance(true);
                break;
                
            case "romanceShoujo":
                shoujo.setRomanceShoujo(descricao);
                // Reflexividade
                shoujo.getGeneros().setAcao(false);
                shoujo.getGeneros().setComedia(false);
                shoujo.getGeneros().setDrama(true);
                shoujo.getGeneros().setSuspense(false);
                shoujo.getGeneros().setTerror(false);
                shoujo.getGeneros().setRomance(true);
                break;
        }

        Estoque.cadastrarManga(shoujo);
        System.out.println("Shoujo cadastrado com sucesso!");
    }
}
