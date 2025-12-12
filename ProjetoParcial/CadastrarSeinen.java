// Autor: Carlos Gabriel Baratieri

public class CadastrarSeinen extends CadastrarMangaBase {

    public void executar(String tipoEscolhido, String descricao) {
        Seinen seinen = new Seinen();

        preencherDadosComuns(seinen);

        switch (tipoEscolhido) {
            case "shinriThriller":
                seinen.setShinriThriller(descricao);
                // Reflexividade
                seinen.getGeneros().setAcao(false);
                seinen.getGeneros().setComedia(false);
                seinen.getGeneros().setDrama(true);
                seinen.getGeneros().setSuspense(true);
                seinen.getGeneros().setTerror(true);
                seinen.getGeneros().setRomance(false);
                break;
                
            case "ningenDorama":
                seinen.setNingenDorama(descricao);
                // Reflexividade
                seinen.getGeneros().setAcao(false);
                seinen.getGeneros().setComedia(false);
                seinen.getGeneros().setDrama(true);
                seinen.getGeneros().setSuspense(false);
                seinen.getGeneros().setTerror(false);
                seinen.getGeneros().setRomance(true);
                break;
                
            case "shakaiFushi":
                seinen.setShakaiFushi(descricao);
                // Reflexividade
                seinen.getGeneros().setAcao(false);
                seinen.getGeneros().setComedia(true);
                seinen.getGeneros().setDrama(true);
                seinen.getGeneros().setSuspense(false);
                seinen.getGeneros().setTerror(false);
                seinen.getGeneros().setRomance(false);
                break;
                
            case "ankokuFantaji":
                seinen.setAnkokuFantaji(descricao);
                // Reflexividade
                seinen.getGeneros().setAcao(true);
                seinen.getGeneros().setComedia(false);
                seinen.getGeneros().setDrama(false);
                seinen.getGeneros().setSuspense(true);
                seinen.getGeneros().setTerror(true);
                seinen.getGeneros().setRomance(false);
                break;
        }

        Estoque.cadastrarManga(seinen);
        System.out.println("Seinen cadastrado com sucesso!");
    }
}
