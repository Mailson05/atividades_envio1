public class Aluno {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    private double n1;
    private double n2;
    private double n3;

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }



     public double media(){
        return (n1+n2+n3) / 3;
    }

    public String situacao(){
        if (media()>=7){
            return "Aprovado";

        } else if (media()<4) {
            return "Reprovado";}
        else {
            return "Final";

        }
    }

    public void exibir(){
        System.out.println("Nome "+getNome());
        System.out.println("Media "+String.format("%.2f",media()));
        System.out.println("Situacao "+situacao());
    }



}
