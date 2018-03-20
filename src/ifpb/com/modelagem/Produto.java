package ifpb.com.modelagem;

import java.util.Objects;

public class Produto {
    private int codigo;
    private static int contador;
    private String descrição;
    private String tipo;
    private float preço;
    private int CFOP;
    private int ICMS;
    private int NCM;

    public Produto( String descrição, String tipo, float preço, int CFOP, int ICMS, int NCM) {
        this.codigo =++contador;
        this.descrição = descrição;
        this.tipo = tipo;
        this.preço = preço;
        this.CFOP = CFOP;
        this.ICMS = ICMS;
        this.NCM = NCM;
    }

    public Produto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public int getCFOP() {
        return CFOP;
    }

    public void setCFOP(int CFOP) {
        this.CFOP = CFOP;
    }

    public int getICMS() {
        return ICMS;
    }

    public void setICMS(int ICMS) {
        this.ICMS = ICMS;
    }

    public int getNCM() {
        return NCM;
    }

    public void setNCM(int NCM) {
        this.NCM = NCM;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.codigo;
        hash = 13 * hash + Objects.hashCode(this.descrição);
        hash = 13 * hash + Objects.hashCode(this.tipo);
        hash = 13 * hash + Float.floatToIntBits(this.preço);
        hash = 13 * hash + this.CFOP;
        hash = 13 * hash + this.ICMS;
        hash = 13 * hash + this.NCM;
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
        final Produto other = (Produto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Float.floatToIntBits(this.preço) != Float.floatToIntBits(other.preço)) {
            return false;
        }
        if (this.CFOP != other.CFOP) {
            return false;
        }
        if (this.ICMS != other.ICMS) {
            return false;
        }
        if (this.NCM != other.NCM) {
            return false;
        }
        if (!Objects.equals(this.descrição, other.descrição)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produtos{" + "codigo=" + codigo + ", descri\u00e7\u00e3o=" + descrição + ", tipo=" + tipo + ", pre\u00e7o=" + preço + ", CFOP=" + CFOP + ", ICMS=" + ICMS + ", NCM=" + NCM + '}';
    }
    
    
    
}
