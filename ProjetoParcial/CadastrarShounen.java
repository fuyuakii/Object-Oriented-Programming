// Autor: Carlos Gabriel Baratieri

public class CadastrarShounen extends CadastrarMangaBase {

    public void executar(String tipoEscolhido, String descricao) {
        Shounen shounen = new Shounen();

        preencherDadosComuns(shounen);

        switch (tipoEscolhido) {
            case "battleShonen":
                shounen.setBattleShonen(descricao);
                // Reflexividade
                shounen.getGeneros().setAcao(true);
                shounen.getGeneros().setComedia(true);
                shounen.getGeneros().setDrama(true);
                shounen.getGeneros().setSuspense(false);
                shounen.getGeneros().setTerror(false);
                shounen.getGeneros().setRomance(false);
                break;
                
            case "isekai":
                shounen.setIsekai(descricao);
                // Reflexividade
                shounen.getGeneros().setAcao(true);
                shounen.getGeneros().setComedia(false);
                shounen.getGeneros().setDrama(true);
                shounen.getGeneros().setSuspense(true);
                shounen.getGeneros().setTerror(false);
                shounen.getGeneros().setRomance(true);
                break;
                
            case "sportShonen":
                shounen.setSportShonen(descricao);
                // Reflexividade
                shounen.getGeneros().setAcao(false);
                shounen.getGeneros().setComedia(false);
                shounen.getGeneros().setDrama(true);
                shounen.getGeneros().setSuspense(true);
                shounen.getGeneros().setTerror(false);
                shounen.getGeneros().setRomance(false);
                break;
        }

        Estoque.cadastrarManga(shounen);
        System.out.println("Shounen cadastrado com sucesso!");
    }
}
