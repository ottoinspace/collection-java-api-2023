package set.OperacoesBasicas;

public class Convidado {
    // atributos
    private String nome;
    private int condigoConvite;

    public Convidado(String nome, int condigoConvite) {
        this.nome = nome;
        this.condigoConvite = condigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCondigoConvite() {
        return condigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", condigoConvite=" + condigoConvite +
                '}';
    }
}
