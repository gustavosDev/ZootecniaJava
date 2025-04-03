package classes;

public class Main {
    public static void main(String[] args) {
        // Inicializa o sistema
        Sistema sistema = new Sistema();

        // Adiciona um usuário de exemplo
        Usuario usuario = new Usuario("admin", "1234");
        sistema.cadastrarUsuario(usuario);

        // Adiciona um tipo de alimentação de exemplo
        Alimentacao alimentacao = new Alimentacao("Pasto", 12.5, 3.5);
        sistema.cadastrarAlimentacao(alimentacao);

        // Valida login
        boolean autenticado = sistema.autenticarUsuario("admin", "1234");
        if (autenticado) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }

        // Exemplo de cadastro de lote
        Lote lote1 = new Lote();
        sistema.cadastrarLote(lote1);

        System.out.println("Lotes cadastrados: ");
        for (Lote lote : sistema.listarLotesAtuais()) {
            System.out.println("- ID: " + lote.getId() + ", Raça: " + lote.getRaca());
        }
    }
}