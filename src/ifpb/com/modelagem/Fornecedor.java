package ifpb.com.modelagem;

import java.time.LocalDate;

public class Fornecedor extends Pessoa{
    private int codigo;
    private static int contador;
    private int CNPJ;

    /**
     *
     * @param CNPJ
     * @param nome
     * @param cpf
     * @param endereco
     * @param nascimento
     * @param email
     */
    public Fornecedor(int CNPJ, String nome, String cpf, String endereco, String nascimento, String email) {
        super(nome, cpf, endereco, nascimento, email);
        codigo = ++contador;
        this.CNPJ = CNPJ;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + this.contador;
        hash = 89 * hash + this.CNPJ;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.contador != other.contador) {
            return false;
        }
        if (this.CNPJ != other.CNPJ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "codigo=" + codigo + ", contador=" + contador + ", CNPJ=" + CNPJ + '}';
    }

    
}
