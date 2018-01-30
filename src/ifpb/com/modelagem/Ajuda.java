package ifpb.com.modelagem;

import java.util.Objects;

public class Ajuda {
    
    private String descricaoSistema;
    private String contato;

    public Ajuda(String descricaoSistema, String contato) {
        this.descricaoSistema = descricaoSistema;
        this.contato = contato;
    }
    
    public String getDescricaoSistema() {
        return descricaoSistema;
    }

    public void setDescricaoSistema(String descricaoSistema) {
        this.descricaoSistema = descricaoSistema;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.descricaoSistema);
        hash = 31 * hash + Objects.hashCode(this.contato);
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
        final Ajuda other = (Ajuda) obj;
        if (!Objects.equals(this.descricaoSistema, other.descricaoSistema)) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ajuda{" + "descricaoSistema=" + descricaoSistema + ", contato=" + contato + '}';
    }
    
    
    
}
