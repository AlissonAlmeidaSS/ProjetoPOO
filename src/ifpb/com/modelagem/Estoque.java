package ifpb.com.modelagem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Estoque {
    private int cod;
    private Produto listaProduto [];
    private static int contador;
    private LocalDate data;

    public Estoque(int cod, Produto[] listaProduto, LocalDate data) {
        cod = ++contador;
        this.listaProduto = listaProduto;
        this.data = data;
    }

    public Produto[] getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(Produto[] listaProduto) {
        this.listaProduto = listaProduto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.cod;
        hash = 79 * hash + Arrays.deepHashCode(this.listaProduto);
        hash = 79 * hash + Objects.hashCode(this.data);
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
        final Estoque other = (Estoque) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Arrays.deepEquals(this.listaProduto, other.listaProduto)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estoque{" + "cod=" + cod + ", listaProduto=" + listaProduto + ", data=" + data + '}';
    }

       
}
