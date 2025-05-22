public class Professor {
    private String nome;
    private int matricula;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void manterCadastro(String aluno) {
        System.out.println("Cadastro mantido para o aluno: " + aluno);
    }

    public void gerenciarAtividade(String atividade, String aluno) {
        System.out.println("Atividade '" + atividade + "' gerenciada para o aluno: " + aluno);
        lancarNota(aluno, 9.5);
    }

    private void lancarNota(String aluno, double nota) {
        System.out.println("Nota " + nota + " lançada para o aluno: " + aluno);
    }

     public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}