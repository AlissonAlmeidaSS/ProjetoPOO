package ifpb.com.modelagem;

import java.util.Arrays;

public class ItemDeVenda {
    private Produto lista[];
    private int quantidade;

    public ItemDeVenda(Produto[] lista, int quantidade) {
        this.lista = lista;
        this.quantidade = quantidade;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Arrays.deepHashCode(this.lista);
        hash = 83 * hash + this.quantidade;
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
        final ItemDeVenda other = (ItemDeVenda) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Arrays.deepEquals(this.lista, other.lista)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemDeVenda{" + "lista=" + lista + ", quantidade=" + quantidade + '}';
    }
    
    
}
