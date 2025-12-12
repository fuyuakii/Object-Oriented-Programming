// Autor: Carlos Gabriel Baratieri

public class AtualizarManga {
    private ConsultarCodigoInterno consultar = new ConsultarCodigoInterno();
    private static Leitura leitura = Leitura.getLeitura();
    
    public boolean executarAtualizacaoEspecifica(int codigo) {
        try {
            Manga mangaEncontrado = consultar.buscarMangaPorCodigo(codigo);
            
            if (mangaEncontrado != null) {
                return atualizacaoEspecifica(mangaEncontrado);
            } else {
                System.out.println("Mangá com código " + codigo + " não encontrado");
                return false;
            }
        } catch (CodigoInvalidoException e) {
            System.out.println("Código inválido! Não foi possível atualizar o mangá.");
            return false;
        }
    }

    public boolean executarAtualizacaoCompleta(int codigo) {
        try {
            Manga mangaEncontrado = consultar.buscarMangaPorCodigo(codigo);
            
            if (mangaEncontrado != null) {
                Animacao.atualizando();
                return atualizacaoCompleta(mangaEncontrado);
            } else {
                System.out.println("Mangá com código " + codigo + " não encontrado");
                return false;
            }
        } catch (CodigoInvalidoException e) {
            System.out.println("Código inválido! Não foi possível atualizar o mangá.");
            return false;
        }
    }

    private boolean atualizacaoEspecifica(Manga manga) {
        int opcao;
        
        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println("      ATUALIZAÇÃO ESPECÍFICA");
            Animacao.esperar(1);
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println(" [1] | Dados Editoriais Japoneses");
            Animacao.esperar(1);
            System.out.println(" [2] | Dados Editoriais Brasileiros");
            Animacao.esperar(1);
            System.out.println(" [3] | Dados do Volume");
            Animacao.esperar(1);
            System.out.println(" [4] | Aspectos Físicos");
            Animacao.esperar(1);
            System.out.println(" [5] | Estado de Conservação");
            Animacao.esperar(1);
            System.out.println(" [6] | Gêneros");
            Animacao.esperar(1);
            System.out.println(" [7] | Preço");
            Animacao.esperar(1);
            System.out.println(" [8] | Informações de Estoque");
            Animacao.esperar(1);
            System.out.println(" [0] | Concluir Atualização");
            Animacao.esperar(1);
            System.out.println(">==================================<");
            
            opcao = leitura.lerInteiro("Escolha o campo para atualizar: ");

            switch(opcao) {
                case 1:
                    atualizarDadosEditoriaisJaponeses(manga);
                    Animacao.pressione();
                    break;
                case 2:
                    atualizarDadosEditoriaisBrasileiros(manga);
                    Animacao.pressione();
                    break;
                case 3:
                    atualizarDadosVolume(manga);
                    Animacao.pressione();
                    break;
                case 4:
                    atualizarAspectosFisicos(manga);
                    Animacao.pressione();
                    break;
                case 5:
                    atualizarEstadoConservacao(manga);
                    Animacao.pressione();
                    break;
                case 6:
                    atualizarGeneros(manga);
                    Animacao.pressione();
                    break;
                case 7:
                    atualizarPreco(manga);
                    Animacao.pressione();
                    break;
                case 8:
                    atualizarInformacoesEstoque(manga);
                    Animacao.pressione();
                    break;
                case 0:
                    System.out.println("Atualização específica concluída!");
                    return true;
                default:
                    System.out.println("Opção inválida!");
                    Animacao.pressione();
            }
        } while(opcao != 0);
        
        return true;
    }

    private boolean atualizacaoCompleta(Manga manga) {
        System.out.println("Iniciando atualização completa...");
        
        int codigoInterno = manga.getInformacoesEstoque().getCodigoInterno();
        Manga novoManga = criarMangaMesmoTipo(manga);
        
        if (novoManga != null) {
            preencherDadosAtualizacao(novoManga);
            novoManga.getInformacoesEstoque().setCodigoInterno(codigoInterno);
            
            Estoque.removerManga(manga);
            Estoque.cadastrarManga(novoManga);
            
            System.out.println("Atualização completa realizada com sucesso!");
            return true;
        } else {
            System.out.println("Erro na atualização completa!");
            return false;
        }
    }

    private void preencherDadosAtualizacao(Manga manga) {
        double preco = leitura.lerFloat("Informe o preço do mangá (float): ");
        manga.setPreco(preco);

        InformacoesEditoriais infoEdit = new InformacoesEditoriais();
        preencherDadosEditoriaisPadronizados(infoEdit);
        manga.setInformacoesEditoriais(infoEdit);

        AspectosFisicos fisico = new AspectosFisicos();
        preencherAspectosFisicosPadronizados(fisico);
        manga.setAspectosFisicos(fisico);

        EstadoConservacao estado = new EstadoConservacao();
        preencherEstadoConservacaoPadronizado(estado);
        manga.setEstadoConservacao(estado);

        Generos generos = new Generos();
        manga.setGeneros(generos);

        InformacoesEstoque estoque = new InformacoesEstoque();
        estoque.setQuantidade(leitura.lerInteiro("Informe a quantidade em estoque (int): "));
        estoque.setLocalEstoque(leitura.lerTexto("Informe o local de armazenamento (String): "));
        manga.setInformacoesEstoque(estoque);
    }

    private void preencherDadosEditoriaisPadronizados(InformacoesEditoriais infoEdit) {
        EditorialJaponesa ej = new EditorialJaponesa();
        preencherEditorialJaponesaPadronizada(ej);
        infoEdit.setEditorialJaponesa(ej);

        EditorialBrasileira eb = new EditorialBrasileira();
        preencherEditorialBrasileiraPadronizada(eb);
        infoEdit.setEditorialBrasileira(eb);

        Volume vol = new Volume();
        vol.setNumeroVolume(leitura.lerInteiro("Informe o número do volume (int): "));
        vol.setTipoVolume(leitura.lerTexto("Informe o tipo de volume (String): "));
        vol.setAnoPublicacao(leitura.lerInteiro("Informe o ano do volume (int): "));
        infoEdit.setVolume(vol);

        infoEdit.setIsbn(leitura.lerTexto("Informe o ISBN (String): "));
    }

    private void preencherEditorialJaponesaPadronizada(EditorialJaponesa ej) {
        int opcaoEditora = escolherEditoraJaponesa();
        switch (opcaoEditora) {
            case 1:
                ej.setEditoraOriginal("Shueisha");
                break;
            case 2:
                ej.setEditoraOriginal("Kodansha");
                break;
            case 3:
                ej.setEditoraOriginal("Shogakukan");
                break;
            case 4:
                ej.setEditoraOriginal("Kadokawa Shoten");
                break;
            case 5:
                ej.setEditoraOriginal("Akita Shoten");
                break;
            case 6:
                ej.setEditoraOriginal("Hakusensha");
                break;
            default:
                ej.setEditoraOriginal("Shueisha");
        }

        ej.setAutor(leitura.lerTexto("Informe o autor (String): "));
        
        String desenhista = leitura.lerTexto("Informe o desenhista (String) [Enter se for o mesmo autor]: ");
        if (desenhista.trim().isEmpty()) {
            ej.setDesenhista(ej.getAutor());
        } else {
            ej.setDesenhista(desenhista);
        }

        ej.setAnoPublicacao(leitura.lerInteiro("Informe o ano de publicação (int): "));
        ej.setEdicao(leitura.lerInteiro("Informe a edição (int): "));
    }

    private void preencherEditorialBrasileiraPadronizada(EditorialBrasileira eb) {
        int opcaoEditora = escolherEditoraBrasileira();
        switch (opcaoEditora) {
            case 1:
                eb.setEditora("Panini");
                break;
            case 2:
                eb.setEditora("JBC");
                break;
            case 3:
                eb.setEditora("NewPOP");
                break;
            case 4:
                eb.setEditora("Editora Abril");
                break;
            case 5:
                eb.setEditora("Conrad");
                break;
            case 6:
                eb.setEditora("Outra");
                String outraEditora = leitura.lerTexto("Informe o nome da editora: ");
                eb.setEditora(outraEditora);
                break;
            default:
                eb.setEditora("Panini");
        }

        eb.setTituloRomanizado(leitura.lerTexto("Informe o título romanizado (String): "));
        
        eb.setTradutor(leitura.lerTexto("Informe o tradutor (String): "));
        
        String revisor = leitura.lerTexto("Informe o revisor (String) [Enter se for o mesmo tradutor]: ");
        if (revisor.trim().isEmpty()) {
            eb.setRevisor(eb.getTradutor());
        } else {
            eb.setRevisor(revisor);
        }

        eb.setAnoPublicacao(leitura.lerInteiro("Informe o ano de publicação no Brasil (int): "));
        eb.setEdicao(leitura.lerInteiro("Informe a edição no Brasil (int): "));
    }

    private void preencherAspectosFisicosPadronizados(AspectosFisicos fisico) {
        int opcaoVolume = escolherTipoVolume();
        switch (opcaoVolume) {
            case 1:
                fisico.setAltura(18.2);
                fisico.setLargura(12.8);
                fisico.setPeso(180.0);
                fisico.setTipoCapa("Tankoubon");
                break;
            case 2:
                fisico.setAltura(15.0);
                fisico.setLargura(10.5);
                fisico.setPeso(120.0);
                fisico.setTipoCapa("Bunkobon");
                break;
            case 3:
                fisico.setAltura(21.0);
                fisico.setLargura(14.8);
                fisico.setPeso(220.0);
                fisico.setTipoCapa("Wideban");
                break;
            case 4:
                fisico.setAltura(22.5);
                fisico.setLargura(15.2);
                fisico.setPeso(280.0);
                fisico.setTipoCapa("Kanzenban");
                break;
            default:
                fisico.setAltura(18.2);
                fisico.setLargura(12.8);
                fisico.setPeso(180.0);
                fisico.setTipoCapa("Tankoubon");
        }

        fisico.setNumPaginas(leitura.lerInteiro("Informe o número de páginas (int): "));

        int opcaoPapel = escolherTipoPapel();
        switch (opcaoPapel) {
            case 1:
                fisico.setTipoPapel("Couché");
                break;
            case 2:
                fisico.setTipoPapel("Offset");
                break;
            case 3:
                fisico.setTipoPapel("Jornal");
                break;
            case 4:
                fisico.setTipoPapel("Reciclado");
                break;
            default:
                fisico.setTipoPapel("Offset");
        }
    }

    private void preencherEstadoConservacaoPadronizado(EstadoConservacao estado) {
        int opcaoCondicao = escolherCondicao();
        switch (opcaoCondicao) {
            case 1:
                estado.setCondicao("Novo");
                break;
            case 2:
                estado.setCondicao("Semi-novo");
                break;
            case 3:
                estado.setCondicao("Usado");
                break;
            case 4:
                estado.setCondicao("Restaurado");
                break;
            default:
                estado.setCondicao("Novo");
        }

        int opcaoIntegridade = escolherIntegridade();
        switch (opcaoIntegridade) {
            case 1:
                estado.setIntegridadeFisica("Íntegro");
                break;
            case 2:
                estado.setIntegridadeFisica("Pequenos danos");
                break;
            case 3:
                estado.setIntegridadeFisica("Danos moderados");
                break;
            case 4:
                estado.setIntegridadeFisica("Danos severos");
                break;
            default:
                estado.setIntegridadeFisica("Íntegro");
        }

        int opcaoPreservacao = escolherPreservacao();
        switch (opcaoPreservacao) {
            case 1:
                estado.setPreservacao("Excelente");
                break;
            case 2:
                estado.setPreservacao("Boa");
                break;
            case 3:
                estado.setPreservacao("Regular");
                break;
            case 4:
                estado.setPreservacao("Ruim");
                break;
            default:
                estado.setPreservacao("Boa");
        }
    }

    private void atualizarDadosEditoriaisJaponeses(Manga manga) {
        EditorialJaponesa ej = manga.getInformacoesEditoriais().getEditorialJaponesa();
        
        System.out.println();
        System.out.println(" [1] | Editora Original: " + ej.getEditoraOriginal());
        System.out.println(" [2] | Autor: " + ej.getAutor());
        System.out.println(" [3] | Desenhista: " + ej.getDesenhista());
        System.out.println(" [4] | Ano Publicação: " + ej.getAnoPublicacao());
        System.out.println(" [5] | Edição: " + ej.getEdicao());
        
        int campo = leitura.lerInteiro("Escolha o campo para atualizar: ");
        
        switch(campo) {
            case 1:
                ej.setEditoraOriginal(leitura.lerTexto("Nova editora original: "));
                break;
            case 2:
                ej.setAutor(leitura.lerTexto("Novo autor: "));
                break;
            case 3:
                ej.setDesenhista(leitura.lerTexto("Novo desenhista: "));
                break;
            case 4:
                ej.setAnoPublicacao(leitura.lerInteiro("Novo ano de publicação: "));
                break;
            case 5:
                ej.setEdicao(leitura.lerInteiro("Nova edição: "));
                break;
            default:
                System.out.println("Campo inválido!");
                return;
        }
        System.out.println("Dados editoriais japoneses atualizados!");
    }

    private void atualizarDadosEditoriaisBrasileiros(Manga manga) {
        EditorialBrasileira eb = manga.getInformacoesEditoriais().getEditorialBrasileira();
        
        System.out.println();
        System.out.println(" [1] | Título Romanizado: " + eb.getTituloRomanizado());
        System.out.println(" [2] | Tradutor: " + eb.getTradutor());
        System.out.println(" [3] | Revisor: " + eb.getRevisor());
        System.out.println(" [4] | Editora: " + eb.getEditora());
        System.out.println(" [5] | Ano Publicação Brasil: " + eb.getAnoPublicacao());
        System.out.println(" [6] | Edição Brasil: " + eb.getEdicao());
        
        int campo = leitura.lerInteiro("Escolha o campo para atualizar: ");
        
        switch(campo) {
            case 1:
                eb.setTituloRomanizado(leitura.lerTexto("Novo título romanizado: "));
                break;
            case 2:
                eb.setTradutor(leitura.lerTexto("Novo tradutor: "));
                break;
            case 3:
                eb.setRevisor(leitura.lerTexto("Novo revisor: "));
                break;
            case 4:
                eb.setEditora(leitura.lerTexto("Nova editora: "));
                break;
            case 5:
                eb.setAnoPublicacao(leitura.lerInteiro("Novo ano de publicação Brasil: "));
                break;
            case 6:
                eb.setEdicao(leitura.lerInteiro("Nova edição Brasil: "));
                break;
            default:
                System.out.println("Campo inválido!");
                return;
        }
        System.out.println("Dados editoriais brasileiros atualizados!");
    }

    private void atualizarDadosVolume(Manga manga) {
        Volume volume = manga.getInformacoesEditoriais().getVolume();
        
        System.out.println();
        System.out.println(" [1] | Número Volume: " + volume.getNumeroVolume());
        System.out.println(" [2] | Tipo Volume: " + volume.getTipoVolume());
        System.out.println(" [3] | Ano Volume: " + volume.getAnoPublicacao());
        
        int campo = leitura.lerInteiro("Escolha o campo para atualizar: ");
        
        switch(campo) {
            case 1:
                volume.setNumeroVolume(leitura.lerInteiro("Novo número do volume: "));
                break;
            case 2:
                volume.setTipoVolume(leitura.lerTexto("Novo tipo de volume: "));
                break;
            case 3:
                volume.setAnoPublicacao(leitura.lerInteiro("Novo ano do volume: "));
                break;
            default:
                System.out.println("Campo inválido!");
                return;
        }
        System.out.println("Dados do volume atualizados!");
    }

    private void atualizarAspectosFisicos(Manga manga) {
        AspectosFisicos af = manga.getAspectosFisicos();
        
        System.out.println();
        System.out.println(" [1] | Altura: " + af.getAltura() + " cm");
        System.out.println(" [2] | Largura: " + af.getLargura() + " cm");
        System.out.println(" [3] | Peso: " + af.getPeso() + " g");
        System.out.println(" [4] | Tipo Capa: " + af.getTipoCapa());
        System.out.println(" [5] | Número Páginas: " + af.getNumPaginas());
        System.out.println(" [6] | Tipo Papel: " + af.getTipoPapel());
        
        int campo = leitura.lerInteiro("Escolha o campo para atualizar: ");
        
        switch(campo) {
            case 1:
                af.setAltura(leitura.lerFloat("Nova altura (cm): "));
                break;
            case 2:
                af.setLargura(leitura.lerFloat("Nova largura (cm): "));
                break;
            case 3:
                af.setPeso(leitura.lerFloat("Novo peso (g): "));
                break;
            case 4:
                af.setTipoCapa(leitura.lerTexto("Novo tipo de capa: "));
                break;
            case 5:
                af.setNumPaginas(leitura.lerInteiro("Novo número de páginas: "));
                break;
            case 6:
                af.setTipoPapel(leitura.lerTexto("Novo tipo de papel: "));
                break;
            default:
                System.out.println("Campo inválido!");
                return;
        }
        System.out.println("Aspectos físicos atualizados!");
    }

    private void atualizarEstadoConservacao(Manga manga) {
        EstadoConservacao ec = manga.getEstadoConservacao();
        
        System.out.println();
        System.out.println(" [1] | Condição: " + ec.getCondicao());
        System.out.println(" [2] | Integridade Física: " + ec.getIntegridadeFisica());
        System.out.println(" [3] | Preservação: " + ec.getPreservacao());
        
        int campo = leitura.lerInteiro("Escolha o campo para atualizar: ");
        
        switch(campo) {
            case 1:
                ec.setCondicao(leitura.lerTexto("Nova condição: "));
                break;
            case 2:
                ec.setIntegridadeFisica(leitura.lerTexto("Nova integridade física: "));
                break;
            case 3:
                ec.setPreservacao(leitura.lerTexto("Nova preservação: "));
                break;
            default:
                System.out.println("Campo inválido!");
                return;
        }
        System.out.println("Estado de conservação atualizado!");
    }

    private void atualizarGeneros(Manga manga) {
        Generos generos = manga.getGeneros();
        
        System.out.println();
        System.out.println(" [1] | Ação: " + generos.getAcao());
        System.out.println(" [2] | Comédia: " + generos.getComedia());
        System.out.println(" [3] | Drama: " + generos.getDrama());
        System.out.println(" [4] | Suspense: " + generos.getSuspense());
        System.out.println(" [5] | Terror: " + generos.getTerror());
        System.out.println(" [6] | Romance: " + generos.getRomance());
        
        int campo = leitura.lerInteiro("Escolha o gênero para atualizar: ");
        
        switch(campo) {
            case 1:
                generos.setAcao(!generos.getAcao());
                break;
            case 2:
                generos.setComedia(!generos.getComedia());
                break;
            case 3:
                generos.setDrama(!generos.getDrama());
                break;
            case 4:
                generos.setSuspense(!generos.getSuspense());
                break;
            case 5:
                generos.setTerror(!generos.getTerror());
                break;
            case 6:
                generos.setRomance(!generos.getRomance());
                break;
            default:
                System.out.println("Campo inválido!");
                return;
        }
        System.out.println("Gêneros atualizados!");
    }

    private void atualizarPreco(Manga manga) {
        double precoAtual = manga.getPreco();
        System.out.println("Preço atual: R$ " + precoAtual);
        double novoPreco = leitura.lerFloat("Novo preço: R$ ");
        manga.setPreco(novoPreco);
        System.out.println("Preço atualizado para: R$ " + novoPreco);
    }

    private void atualizarInformacoesEstoque(Manga manga) {
        InformacoesEstoque estoque = manga.getInformacoesEstoque();
        
        System.out.println();
        System.out.println(" [1] | Quantidade: " + estoque.getQuantidade());
        System.out.println(" [2] | Local Estoque: " + estoque.getLocalEstoque());
        
        int campo = leitura.lerInteiro("Escolha o campo para atualizar: ");
        
        switch(campo) {
            case 1:
                estoque.setQuantidade(leitura.lerInteiro("Nova quantidade: "));
                break;
            case 2:
                estoque.setLocalEstoque(leitura.lerTexto("Novo local de estoque: "));
                break;
            default:
                System.out.println("Campo inválido!");
                return;
        }
        System.out.println("Informações de estoque atualizadas!");
    }

    private int escolherEditoraJaponesa() {
        System.out.println();
        System.out.println(" [1] | Shueisha (Shonen Jump, etc.)");
        System.out.println(" [2] | Kodansha (Shonen Magazine, etc.)");
        System.out.println(" [3] | Shogakukan (Shonen Sunday, etc.)");
        System.out.println(" [4] | Kadokawa Shoten");
        System.out.println(" [5] | Akita Shoten");
        System.out.println(" [6] | Hakusensha");
        return leitura.lerInteiro("> ");
    }

    private int escolherEditoraBrasileira() {
        System.out.println();
        System.out.println(" [1] | Panini (Manga Line)");
        System.out.println(" [2] | JBC");
        System.out.println(" [3] | NewPOP");
        System.out.println(" [4] | Editora Abril");
        System.out.println(" [5] | Conrad");
        System.out.println(" [6] | Outra");
        return leitura.lerInteiro("> ");
    }

    private int escolherTipoVolume() {
        System.out.println();
        System.out.println(" [1] | Tankoubon (Formato padrão)");
        System.out.println("      Altura: 18.2cm, Largura: 12.8cm, Peso: 180g");
        System.out.println(" [2] | Bunkobon (Formato menor e econômico)");
        System.out.println("      Altura: 15.0cm, Largura: 10.5cm, Peso: 120g");
        System.out.println(" [3] | Wideban (Formato maior)");
        System.out.println("      Altura: 21.0cm, Largura: 14.8cm, Peso: 220g");
        System.out.println(" [4] | Kanzenban/Aizouban (Edição de colecionador)");
        System.out.println("      Altura: 22.5cm, Largura: 15.2cm, Peso: 280g");
        return leitura.lerInteiro("> ");
    }

    private int escolherTipoPapel() {
        System.out.println();
        System.out.println(" [1] | Couché (Alta qualidade)");
        System.out.println(" [2] | Offset (Qualidade padrão)");
        System.out.println(" [3] | Jornal (Econômico)");
        System.out.println(" [4] | Reciclado (Ecológico)");
        return leitura.lerInteiro("> ");
    }

    private int escolherCondicao() {
        System.out.println();
        System.out.println(" [1] | Novo (Lacrado/ Nunca usado)");
        System.out.println(" [2] | Semi-novo (Pouco uso)");
        System.out.println(" [3] | Usado (Sinais de uso visíveis)");
        System.out.println(" [4] | Restaurado (Danos reparados)");
        return leitura.lerInteiro("> ");
    }

    private int escolherIntegridade() {
        System.out.println();
        System.out.println(" [1] | Íntegro (Sem danos)");
        System.out.println(" [2] | Pequenos danos (Amassados leves)");
        System.out.println(" [3] | Danos moderados (Páginas soltas)");
        System.out.println(" [4] | Danos severos (Capa danificada)");
        return leitura.lerInteiro("> ");
    }

    private int escolherPreservacao() {
        System.out.println();
        System.out.println(" [1] | Excelente (Conservado perfeitamente)");
        System.out.println(" [2] | Boa (Pequenos sinais de tempo)");
        System.out.println(" [3] | Regular (Amarelecimento/ Manchas)");
        System.out.println(" [4] | Ruim (Deterioração avançada)");
        return leitura.lerInteiro("> ");
    }

    private Manga criarMangaMesmoTipo(Manga manga) {
        if (manga instanceof Josei) {
            return new Josei();
        } else if (manga instanceof Kodomo) {
            return new Kodomo();
        } else if (manga instanceof Seinen) {
            return new Seinen();
        } else if (manga instanceof Shoujo) {
            return new Shoujo();
        } else if (manga instanceof Shounen) {
            return new Shounen();
        }
        return null;
    }
}
