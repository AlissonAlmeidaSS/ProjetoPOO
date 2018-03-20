package ifpb.com.modelagem;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{
       private String nome;
       private String cpf;
       private String endereco;
       private String nascimento;
       private String email;
       
        public Pessoa(){
    }

    public Pessoa(String nome, String cpf, String endereco, String nascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.cpf);
        hash = 79 * hash + Objects.hashCode(this.endereco);
        hash = 79 * hash + Objects.hashCode(this.nascimento);
        hash = 79 * hash + Objects.hashCode(this.email);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", nascimento=" + nascimento + ", email=" + email + '}';
    }
   
    @Override
    public int compareTo(Pessoa o) {
        if (this.equals(o)) {
			//São iguais
			return 0;
		} else if (getNome().equals(o.getNome())
                          || getCpf().equals(o.getCpf()) 
                          || getEndereco().equals(o.getEndereco())
			  || getNascimento().equals(o.getNascimento())
			  || getEmail().equals(o.getEmail())){
			//Se alguma coisa igual
			return 1;
		}
		//Se forem diferentes
		return -1;
    }

    
}
