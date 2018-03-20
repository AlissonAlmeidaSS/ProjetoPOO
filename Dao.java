package ifpb.com.controle;

/**
 * Interface generica para DAO(Data Access Object)
 * @version 1
 * @author alisson
 * @param <T> 
 */
public interface Dao <T> {
    
/**
* Metodo que salva um Objeto.
* @param obj
*/
    public boolean salvar (T obj);
    
/**
* Metodo que busca um Objeto atraves do codigo do mesmo.
* @param codigo
*/
    public T buscar (int codigo);
    
/**
* Metodo que deleta um Objeto.
* @param obj
*/
    public boolean deletar (T obj);
    
}
