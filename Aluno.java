

public class Aluno {
   private String nome;
   private String matricula;
   private  int idade;
    private char sexo;
    private String cpf;
    
    Aluno(){

    }

  Aluno (String nome) {
    this.nome = nome;
  }  
    
    
    public Aluno(String nome, String matricula, int idade, char sexo, String cpf, String email, double nota1,
      double nota2) {
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;
    this.sexo = sexo;
    this.cpf = cpf;
    this.email = email;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getMatricula() {
      return matricula;
    }

    public void setMatricula(String matricula) {
      this.matricula = matricula;
    }

    public int getIdade() {
      return idade;
    }

    public void setIdade(int idade) {
      this.idade = idade;
    }

    public char getSexo() {
      return sexo;
    }

    public void setSexo(char sexo) {
      this.sexo = sexo;
    }

    public String getCpf() {
      return cpf;
    }

    public void setCpf(String cpf) {
      this.cpf = cpf;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public double getNota1() {
      return nota1;
    }

    public void setNota1(double nota1) {
      this.nota1 = nota1;
    }

    public double getNota2() {
      return nota2;
    }

    public void setNota2(double nota2) {
      this.nota2 = nota2;
    }

    String email;
    double nota1;
    double nota2;


    double calcularMedia(){
        
      return  (nota1 + nota2) / 2;
 
    }

    boolean aprovado(){
      return calcularMedia() >= 7;
    }

    void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Nota 1 : " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        System.out.println(aprovado() ? "Aprovado" : "Reprovado");

    }
}
