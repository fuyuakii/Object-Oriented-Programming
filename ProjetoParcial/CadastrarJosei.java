// Autor: Carlos Gabriel Baratieri

public class CadastrarJosei extends CadastrarMangaBase {

    public void executar(String tipoEscolhido, String descricao) {
        Josei josei = new Josei();

        preencherDadosComuns(josei);

        switch (tipoEscolhido) {
            case "shokubaDorama":
                josei.setShokubaDorama(descricao);
                // Reflexividade
                josei.getGeneros().setAcao(false);
                josei.getGeneros().setComedia(true);    
                josei.getGeneros().setDrama(true);      
                josei.getGeneros().setSuspense(false);
                josei.getGeneros().setTerror(false);
                josei.getGeneros().setRomance(false);    
                break;
                
            case "kekkonSeikatsu":
                josei.setKekkonSeikatsu(descricao);
                // Reflexividade
                josei.getGeneros().setAcao(false);
                josei.getGeneros().setComedia(true);    
                josei.getGeneros().setDrama(true);      
                josei.getGeneros().setSuspense(false);
                josei.getGeneros().setTerror(false);
                josei.getGeneros().setRomance(true);   
                break;
                
            case "otonaDorama":
                josei.setOtonaDorama(descricao);
                // Reflexividade
                josei.getGeneros().setAcao(false);
                josei.getGeneros().setComedia(false);
                josei.getGeneros().setDrama(true);      
                josei.getGeneros().setSuspense(true);   
                josei.getGeneros().setTerror(false);
                josei.getGeneros().setRomance(true);    
                break;
        }

        Estoque.cadastrarManga(josei);
        System.out.println("Josei cadastrado com sucesso!");
    }
}
