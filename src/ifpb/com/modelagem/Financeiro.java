package ifpb.com.modelagem;

import java.util.Arrays;

public class Financeiro {
    private int cod;
    private Caixa listaCaixa[];
    private Venda listaVenda[];
    private static int contador;
    private float contaReceber;
    private float contasPagar;
    private float saldo;

    public Financeiro(int cod, Caixa[] listaCaixa, Venda[] listaVenda, float contaReceber, float contasPagar) {
        this.cod = cod;
        this.listaCaixa = listaCaixa;
        this.listaVenda = listaVenda;
        this.contaReceber = contaReceber;
        this.contasPagar = contasPagar;
        
    }

    public Caixa[] getListaCaixa() {
        return listaCaixa;
    }

    public void setListaCaixa(Caixa[] listaCaixa) {
        this.listaCaixa = listaCaixa;
    }

    public Venda[] getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(Venda[] listaVenda) {
        this.listaVenda = listaVenda;
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

    public float getContaReceber() {
        return contaReceber;
    }

    public void setContaReceber(float contaReceber) {
        this.contaReceber = contaReceber;
    }

    public float getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(float contasPagar) {
        this.contasPagar = contasPagar;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.cod;
        hash = 59 * hash + Arrays.deepHashCode(this.listaCaixa);
        hash = 59 * hash + Arrays.deepHashCode(this.listaVenda);
        hash = 59 * hash + Float.floatToIntBits(this.contaReceber);
        hash = 59 * hash + Float.floatToIntBits(this.contasPagar);
        hash = 59 * hash + Float.floatToIntBits(this.saldo);
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
        final Financeiro other = (Financeiro) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (Float.floatToIntBits(this.contaReceber) != Float.floatToIntBits(other.contaReceber)) {
            return false;
        }
        if (Float.floatToIntBits(this.contasPagar) != Float.floatToIntBits(other.contasPagar)) {
            return false;
        }
        if (Float.floatToIntBits(this.saldo) != Float.floatToIntBits(other.saldo)) {
            return false;
        }
        if (!Arrays.deepEquals(this.listaCaixa, other.listaCaixa)) {
            return false;
        }
        if (!Arrays.deepEquals(this.listaVenda, other.listaVenda)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Financeiro{" + "cod=" + cod + ", listaCaixa=" + listaCaixa + ", listaVenda=" + listaVenda + ", contaReceber=" + contaReceber + ", contasPagar=" + contasPagar + ", saldo=" + saldo + '}';
    }

    
    
}
