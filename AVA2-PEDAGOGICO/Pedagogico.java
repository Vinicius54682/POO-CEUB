public class Professor {
    private String nome;
    private int matricula;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void manterCadastro(String nomeAluno) {
        System.out.println("Professor " + nome + " está mantendo o cadastro do aluno: " + nomeAluno);
    }

    public void gerenciarAtividade(String nomeAluno, String atividade) {
        System.out.println("Professor " + nome + " está gerenciando a atividade '" + atividade + "' para o aluno: " + nomeAluno);
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}


public class SistemaInclusao {
    private String nomeDoSistema;

    public SistemaInclusao(String nomeDoSistema) {
        this.nomeDoSistema = nomeDoSistema;
    }

    public void reconhecerProfessor(Professor professor) {
        System.out.println("Sistema " + nomeDoSistema + " reconheceu o professor: " + professor.getNome() + " (Matrícula: " + professor.getMatricula() + ")");
    }

    public void executarAcoes(Professor professor, String nomeAluno, String atividade) {
        professor.manterCadastro(nomeAluno);
        professor.gerenciarAtividade(nomeAluno, atividade);
    }
}
