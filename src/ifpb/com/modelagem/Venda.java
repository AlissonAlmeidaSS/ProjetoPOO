package ifpb.com.modelagem;

import java.util.Arrays;
import java.util.Objects;

public class Venda {
    private int codigo;
    private static int contador;
    private String tipo;
    private Produto lista[];
    private int quantidade;
    private float valorTotal;

    public Venda(String tipo, Produto[] lista, int quantidade, float valorTotal) {
        codigo = ++contador;
        this.tipo = tipo;
        this.lista = lista;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Produto[] getLista() {
        return lista;
    }

    public void setLista(Produto[] lista) {
        this.lista = lista;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + Objects.hashCode(this.tipo);
        hash = 17 * hash + Arrays.deepHashCode(this.lista);
        hash = 17 * hash + this.quantidade;
        hash = 17 * hash + Float.floatToIntBits(this.valorTotal);
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
        final Venda other = (Venda) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Float.floatToIntBits(this.valorTotal) != Float.floatToIntBits(other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Arrays.deepEquals(this.lista, other.lista)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vendas{" + "codigo=" + codigo + ", tipo=" + tipo + ", lista=" + lista + ", quantidade=" + quantidade + ", valorTotal=" + valorTotal + '}';
    }
    
    
    
    
}
