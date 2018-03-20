package ifpb.com.controle;

import ifpb.com.modelagem.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *Classe que implementa Dao de Produto e com isso herdar todos os metodos de Dao 
 * @author alisson
 */
public class ProdutoDao implements Dao <Produto>{ 

    private final List<Produto> produtos;

/**
 * Contrutor da Classe aonde ele cria lista duplamente encadeada
 */
    public ProdutoDao() {
        produtos = new ArrayList <>();
    }
    
/**
 * Metodo adiciona um produto a lista atraves ADD que e um servico de List
 * @param obj
 */    
    @Override
    public boolean salvar(Produto obj) {
        return produtos.add (obj);
    }

/**
 * Metodo buscar um produto a lista atraves for usando codigo passado pelo usuario e o mesmo retorna o Produto se encontrado e se não encontrar retorna null
 * @param codigo
 */    
    @Override
    public Produto buscar(int codigo) {
        for(Produto p: produtos){
            if(p.getCodigo()== codigo){
                return p;
            }
        }       
        return null;        
    }

/**
 * Metodo remove um produto da lista atraves remove que e um servico de List
 * @param obj
 */    
    @Override
    public boolean deletar(Produto obj) {
        return produtos.remove(obj);
    }

/**
 * Metodo Listar todos retorna a lista de produtos cadastrado
 * @return produtos
 */    
    public List<Produto> listarTodos(){
        return produtos;
    }

}