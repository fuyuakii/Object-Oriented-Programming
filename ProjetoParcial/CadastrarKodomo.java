// Autor: Carlos Gabriel Baratieri

public class CadastrarKodomo extends CadastrarMangaBase {

    public void executar(String tipoEscolhido, String descricao) {
        Kodomo kodomo = new Kodomo();

        preencherDadosComuns(kodomo);

        switch (tipoEscolhido) {
            case "educativo":
                kodomo.setEducativo(descricao);
                // Reflexividade
                kodomo.getGeneros().setAcao(false);
                kodomo.getGeneros().setComedia(true);
                kodomo.getGeneros().setDrama(false);
                kodomo.getGeneros().setSuspense(false);
                kodomo.getGeneros().setTerror(false);
                kodomo.getGeneros().setRomance(false);
                break;
                
            case "fabulaConto":
                kodomo.setFabulaConto(descricao);
                // Reflexividade
                kodomo.getGeneros().setAcao(true);
                kodomo.getGeneros().setComedia(false);
                kodomo.getGeneros().setDrama(true);
                kodomo.getGeneros().setSuspense(false);
                kodomo.getGeneros().setTerror(false);
                kodomo.getGeneros().setRomance(false);
                break;
                
            case "ilustrativo":
                kodomo.setIlustrativo(descricao);
                // Reflexividade
                kodomo.getGeneros().setAcao(false);
                kodomo.getGeneros().setComedia(true);
                kodomo.getGeneros().setDrama(false);
                kodomo.getGeneros().setSuspense(false);
                kodomo.getGeneros().setTerror(false);
                kodomo.getGeneros().setRomance(true);
                break;
        }

        Estoque.cadastrarManga(kodomo);
        System.out.println("Kodomo cadastrado com sucesso!");
    }
}
