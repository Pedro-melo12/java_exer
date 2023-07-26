public class escola {
    public static void main(String[] args) {

        Turma turma = new Turma();
        turma.setNome("Turma de java");
        turma.setPreco(990); 
        turma.setCargaHoraria(8); 
        turma.exibirInfos();

        System.out.println("---------------");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro"); 
        aluno1.setMatricula("c23f456a7"); 
        aluno1.setIdade(18);
        aluno1.setSexo('M');
        aluno1.setCpf("154.009.233.28");
        aluno1.setEmail("Pedro@gmail.com");
        aluno1.setNota1(10);
        aluno1.setNota2(10);
        aluno1.exibirInfos();
System.out.println("---------------");
        Aluno aluno2 = new Aluno();

        aluno2.setNome("Igor");
        aluno2.setMatricula("99c10c00mp12");
        aluno2.setIdade(20);
        aluno2.setSexo('M');
        aluno2.setCpf("111.234.512.03");
        aluno2.setEmail("Igor@gmail.com");
        aluno2.setNota1(10);
        aluno2.setNota2(0);
        aluno2.exibirInfos();
System.out.println("---------------");
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.exibirInfos();

    }

}
