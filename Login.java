package ifpb.com.controle;

import ifpb.com.modelagem.Pessoa;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe que controla o login do usuario no sistema.
 * @author alisson
 */
public class Login {
    
 /**
 * cria um lista de pessoas apartir do List
 */
    private final List<Pessoa> pessoas;
    
 /**
 * Contrutor da classe aonde cria um LinkedList ou seja cria um lista duplamente encadeada dinamica
 */   

    public Login(){
        pessoas = new LinkedList<>();
    }
    
 /**
 * o metodo recebe esses parametros email e cpf e atraves do equals compara se o usario foi logado no sistema se por ventura esse usuario nao estiver cadastro na lista 
 * ele informara na tela a mensagem usuario não cadastrado tente novamente
 * @param email 
 * @param cpf 
 * @return true, false  
 */
    public boolean verifica(String email, String cpf){
        for(Pessoa pessoa : pessoas){
            if(pessoa.getEmail().equals(email) && pessoa.getCpf().equals(cpf)){
                System.out.println("Login Realizado");
                return true;
            }
        }
        System.err.println("Usuario Não Cadastrado!");
        System.err.println("Tente Novamente");
        return false;
    }
/**
 * Este metodo salvar o novo Usuario mas o mesmo ainda verifica esse ja não tem esse mesmo usuario ja cadastrado pois se o mesmo existir ele 
 * mostrara a mensagem informando que ja existe um usuario cadastro com esse email
 * @param o,objeto 
 * @return true, false  
 */    
    
    public boolean salvar(Pessoa o){
        if(pessoas.isEmpty()){
            pessoas.add(o);
        } else {
            for(Pessoa pessoa : pessoas){
                if( pessoa.getEmail().equals(o.getEmail())){
                    System.err.println("Usuário já cadastrado!");
                    return false;
                }
            }
        }
        pessoas.add(o);
        return true;
    }

}
