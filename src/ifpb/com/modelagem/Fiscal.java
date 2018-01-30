package ifpb.com.modelagem;

public class Fiscal {
    private int cod;
    private static int contador;
    private float chaveDeAcesso;

    public Fiscal(float chaveDeAcesso) {
        cod = ++contador;
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public float getChaveDeAcesso() {
        return chaveDeAcesso;
    }

    public void setChaveDeAcesso(float chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.cod;
        hash = 23 * hash + Float.floatToIntBits(this.chaveDeAcesso);
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
        final Fiscal other = (Fiscal) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (Float.floatToIntBits(this.chaveDeAcesso) != Float.floatToIntBits(other.chaveDeAcesso)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fiscal{" + "cod=" + cod + ", chaveDeAcesso=" + chaveDeAcesso + '}';
    }
    
    
    
    
    
}
