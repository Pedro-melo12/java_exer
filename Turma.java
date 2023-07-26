import java.util.List;
import java.util.ArrayList;

public class Turma {
      private String nome;
   private double preco;
   private int cargaHoraria;
    private List<Aluno> alunos = new ArrayList<>();

    void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Média: " + calcularPrecoPorHora());
        System.out.println("Quantidade de alunos: " + obterQuantidadeDeAlunos());

    }

    double calcularPrecoPorHora() {
        return preco / cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    int obterQuantidadeDeAlunos() {
        return this.alunos.size();
    }

    List<Aluno> adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);

        return this.alunos;
    }
}
