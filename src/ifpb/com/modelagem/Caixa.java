package ifpb.com.modelagem;

import java.time.LocalDate;
import java.util.Objects;

public class Caixa {
    private int codigo;
    private Venda listaVenda[];
    private itemDeVenda lista[];
    private static int contador;
    private float abertura;
    private float fechamento;
    private float valorTotal;
    private LocalDate horaAbertura;

    public Caixa(int codigo, Venda[] listaVenda, itemDeVenda[] lista, float abertura, float fechamento, float valorTotal, LocalDate horaAbertura) {
        this.codigo = codigo;
        this.listaVenda = listaVenda;
        this.lista = lista;
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.valorTotal = valorTotal;
        this.horaAbertura = horaAbertura;
    }

    public Venda[] getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(Venda[] listaVenda) {
        this.listaVenda = listaVenda;
    }

    public itemDeVenda[] getLista() {
        return lista;
    }

    public void setLista(itemDeVenda[] lista) {
        this.lista = lista;
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

    public float getAbertura() {
        return abertura;
    }

    public void setAbertura(float abertura) {
        this.abertura = abertura;
    }

    public float getFechamento() {
        return fechamento;
    }

    public void setFechamento(float fechamento) {
        this.fechamento = fechamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(LocalDate horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codigo;
        hash = 97 * hash + Float.floatToIntBits(this.abertura);
        hash = 97 * hash + Float.floatToIntBits(this.fechamento);
        hash = 97 * hash + Float.floatToIntBits(this.valorTotal);
        hash = 97 * hash + Objects.hashCode(this.horaAbertura);
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
        final Caixa other = (Caixa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Float.floatToIntBits(this.abertura) != Float.floatToIntBits(other.abertura)) {
            return false;
        }
        if (Float.floatToIntBits(this.fechamento) != Float.floatToIntBits(other.fechamento)) {
            return false;
        }
        if (Float.floatToIntBits(this.valorTotal) != Float.floatToIntBits(other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.horaAbertura, other.horaAbertura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caixa{" + "codigo=" + codigo + ", abertura=" + abertura + ", fechamento=" + fechamento + ", valorTotal=" + valorTotal + ", horaAbertura=" + horaAbertura + '}';
    }
    
    
    
    
}
