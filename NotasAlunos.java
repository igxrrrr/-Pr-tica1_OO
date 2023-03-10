public class NotasAlunos {

    private String nome;
    private String matricula;
    double notaAV1, notaAV2, notaAE, somaNota;
    private String curso;
    private int periodo;

    public NotasAlunos(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }
    public void alterarAV1(double nota){
        this.notaAV1=nota;
    }
    public void alterarAV2(double nota){
        this.notaAV2=nota;
    }
    public void alterarAE(double nota){
        this.notaAE=nota;
    }
    public void avaliarAluno(){
        somaNota=this.notaAV1+this.notaAV2;
        if ((this.notaAV1+this.notaAV2)>=60)
            System.out.println("Aprovado");
        else
            System.out.println("Recuperação  ");
    }
    public void avaliarRecuperacao(double notaAE){
        if(((somaNota+notaAE)/2)>=60)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

    }

}