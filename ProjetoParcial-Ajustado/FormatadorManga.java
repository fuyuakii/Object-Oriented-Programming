// Autor: Carlos Gabriel Baratieri

public class FormatadorManga {
    
    public static String formatarDescricao(Manga manga) {
        String descricao = "";
        
        // Dados editoriais japoneses
        descricao = descricao + "Editora Original: " + manga.getInformacoesEditoriais().getEditorialJaponesa().getEditoraOriginal() + "\n";
        descricao = descricao + "Autor: " + manga.getInformacoesEditoriais().getEditorialJaponesa().getAutor() + "\n";
        descricao = descricao + "Desenhista: " + manga.getInformacoesEditoriais().getEditorialJaponesa().getDesenhista() + "\n";
        descricao = descricao + "Ano Publicação: " + manga.getInformacoesEditoriais().getEditorialJaponesa().getAnoPublicacao() + "\n";
        descricao = descricao + "Edição: " + manga.getInformacoesEditoriais().getEditorialJaponesa().getEdicao() + "\n\n";
        
        // Dados editoriais brasileiros
        descricao = descricao + "Título Romanizado: " + manga.getInformacoesEditoriais().getEditorialBrasileira().getTituloRomanizado() + "\n";
        descricao = descricao + "Tradutor: " + manga.getInformacoesEditoriais().getEditorialBrasileira().getTradutor() + "\n";
        descricao = descricao + "Revisor: " + manga.getInformacoesEditoriais().getEditorialBrasileira().getRevisor() + "\n";
        descricao = descricao + "Editora Brasileira: " + manga.getInformacoesEditoriais().getEditorialBrasileira().getEditora() + "\n";
        descricao = descricao + "Ano Publicação Brasil: " + manga.getInformacoesEditoriais().getEditorialBrasileira().getAnoPublicacao() + "\n";
        descricao = descricao + "Edição Brasil: " + manga.getInformacoesEditoriais().getEditorialBrasileira().getEdicao() + "\n\n";
        
        // Dados do volume
        descricao = descricao + "Número do Volume: " + manga.getInformacoesEditoriais().getVolume().getNumeroVolume() + "\n";
        descricao = descricao + "Tipo do Volume: " + manga.getInformacoesEditoriais().getVolume().getTipoVolume() + "\n";
        descricao = descricao + "Ano do Volume: " + manga.getInformacoesEditoriais().getVolume().getAnoPublicacao() + "\n\n";
        
        descricao = descricao + "ISBN: " + manga.getInformacoesEditoriais().getIsbn() + "\n\n";
        
        // Aspectos físicos
        descricao = descricao + "Altura: " + manga.getAspectosFisicos().getAltura() + " cm\n";
        descricao = descricao + "Largura: " + manga.getAspectosFisicos().getLargura() + " cm\n";
        descricao = descricao + "Peso: " + manga.getAspectosFisicos().getPeso() + " g\n";
        descricao = descricao + "Tipo de Capa: " + manga.getAspectosFisicos().getTipoCapa() + "\n";
        descricao = descricao + "Número de Páginas: " + manga.getAspectosFisicos().getNumPaginas() + "\n";
        descricao = descricao + "Tipo de Papel: " + manga.getAspectosFisicos().getTipoPapel() + "\n\n";
        
        // Estado de conservação
        descricao = descricao + "Condição: " + manga.getEstadoConservacao().getCondicao() + "\n";
        descricao = descricao + "Integridade Física: " + manga.getEstadoConservacao().getIntegridadeFisica() + "\n";
        descricao = descricao + "Preservação: " + manga.getEstadoConservacao().getPreservacao() + "\n\n";
        
        // Gêneros
        descricao = descricao + "Gêneros: ";
        if (manga.getGeneros().getAcao()) {
            descricao = descricao + "Ação ";
        }
        if (manga.getGeneros().getComedia()) {
            descricao = descricao + "Comédia ";
        }
        if (manga.getGeneros().getDrama()) {
            descricao = descricao + "Drama ";
        }
        if (manga.getGeneros().getSuspense()) {
            descricao = descricao + "Suspense ";
        }
        if (manga.getGeneros().getTerror()) {
            descricao = descricao + "Terror ";
        }
        if (manga.getGeneros().getRomance()) {
            descricao = descricao + "Romance ";
        }
        descricao = descricao + "\n\n";
        
        // Dados específicos por tipo de mangá
        descricao = descricao + adicionarDadosEspecificos(manga);
        
        // Preço
        descricao = descricao + "Preço: R$ " + manga.getPreco() + "\n";
        
        return descricao;
    }
    
    private static String adicionarDadosEspecificos(Manga manga) {
        String dadosEspecificos = "";
        
        if (manga instanceof Josei) {
            Josei josei = (Josei) manga;
            if (josei.getShokubaDorama() != null && !josei.getShokubaDorama().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Shokuba Dorama: " + josei.getShokubaDorama() + "\n";
            }
            if (josei.getKekkonSeikatsu() != null && !josei.getKekkonSeikatsu().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Kekkon Seikatsu: " + josei.getKekkonSeikatsu() + "\n";
            }
            if (josei.getOtonaDorama() != null && !josei.getOtonaDorama().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Otona Dorama: " + josei.getOtonaDorama() + "\n";
            }
                
        } else if (manga instanceof Kodomo) {
            Kodomo kodomo = (Kodomo) manga;
            if (kodomo.getEducativo() != null && !kodomo.getEducativo().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Educativo: " + kodomo.getEducativo() + "\n";
            }
            if (kodomo.getFabulaConto() != null && !kodomo.getFabulaConto().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Fábula/Conto: " + kodomo.getFabulaConto() + "\n";
            }
            if (kodomo.getIlustrativo() != null && !kodomo.getIlustrativo().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Ilustrativo: " + kodomo.getIlustrativo() + "\n";
            }
                
        } else if (manga instanceof Seinen) {
            Seinen seinen = (Seinen) manga;
            if (seinen.getShinriThriller() != null && !seinen.getShinriThriller().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Shinri/Thriller: " + seinen.getShinriThriller() + "\n";
            }
            if (seinen.getNingenDorama() != null && !seinen.getNingenDorama().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Ningen Dorama: " + seinen.getNingenDorama() + "\n";
            }
            if (seinen.getShakaiFushi() != null && !seinen.getShakaiFushi().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Shakai Fushi: " + seinen.getShakaiFushi() + "\n";
            }
            if (seinen.getAnkokuFantaji() != null && !seinen.getAnkokuFantaji().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Ankoku Fantaji: " + seinen.getAnkokuFantaji() + "\n";
            }
                
        } else if (manga instanceof Shoujo) {
            Shoujo shoujo = (Shoujo) manga;
            if (shoujo.getMahou() != null && !shoujo.getMahou().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Mahou: " + shoujo.getMahou() + "\n";
            }
            if (shoujo.getSeishunDorama() != null && !shoujo.getSeishunDorama().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Seishun Dorama: " + shoujo.getSeishunDorama() + "\n";
            }
            if (shoujo.getRomanceShoujo() != null && !shoujo.getRomanceShoujo().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Romance Shoujo: " + shoujo.getRomanceShoujo() + "\n";
            }
                
        } else if (manga instanceof Shounen) {
            Shounen shounen = (Shounen) manga;
            if (shounen.getBattleShonen() != null && !shounen.getBattleShonen().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Battle Shonen: " + shounen.getBattleShonen() + "\n";
            }
            if (shounen.getIsekai() != null && !shounen.getIsekai().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Isekai: " + shounen.getIsekai() + "\n";
            }
            if (shounen.getSportShonen() != null && !shounen.getSportShonen().isEmpty()) {
                dadosEspecificos = dadosEspecificos + "Sport Shonen: " + shounen.getSportShonen() + "\n";
            }
        }
        
        if (!dadosEspecificos.isEmpty()) {
            dadosEspecificos = dadosEspecificos + "\n";
        }
        
        return dadosEspecificos;
    }
    
    public static String formatarInformacoesEstoque(Manga manga) {
        String tipo = "";
        if (manga instanceof Josei) {
            tipo = "Josei";
        } else if (manga instanceof Kodomo) {
            tipo = "Kodomo";
        } else if (manga instanceof Seinen) {
            tipo = "Seinen";
        } else if (manga instanceof Shoujo) {
            tipo = "Shoujo";
        } else if (manga instanceof Shounen) {
            tipo = "Shounen";
        }
        
        return tipo + ": " + manga.getInformacoesEditoriais().getEditorialBrasileira().getTituloRomanizado() + "\n" +
               "Código: " + manga.getInformacoesEstoque().getCodigoInterno() + "\n" +
               "Estoque: " + manga.getInformacoesEstoque().getQuantidade() + "\n" +
               "Local: " + manga.getInformacoesEstoque().getLocalEstoque();
    }
}

