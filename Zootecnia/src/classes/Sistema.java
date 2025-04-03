package classes;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Usuario> usuarios;
    private List<Alimentacao> tiposAlimentacao;
    private List<Lote> lotesAtuais;

    public Sistema() {
        usuarios = new ArrayList<>();
        tiposAlimentacao = new ArrayList<>();
        lotesAtuais = new ArrayList<>();
    }

    // Método para cadastrar usuários
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para cadastrar alimentação
    public void cadastrarAlimentacao(Alimentacao alimentacao) {
        tiposAlimentacao.add(alimentacao);
    }

    // Outros métodos de exemplo
    public boolean autenticarUsuario(String username, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.validarSenha(password)) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarLote(Lote lote) {
        lotesAtuais.add(lote);
    }

    public List<Lote> listarLotesAtuais() {
        return lotesAtuais;
    }
}