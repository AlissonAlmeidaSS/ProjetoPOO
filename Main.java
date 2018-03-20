package ifpb.com.visao;

import ifpb.com.modelagem.Pessoa;
import ifpb.com.controle.Login;
import ifpb.com.controle.ProdutoDao;
import ifpb.com.modelagem.Produto;
import java.util.Scanner;

/**
 *
 * @author alisson
 */
public class Main {

    public static void main(String[] args) {

        Login lista = new Login();
        ProdutoDao prod = new ProdutoDao();

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem Vindo ao Sistema.");
        System.out.println();

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Digite 1 para se cadastrar.");
            System.out.println("Digite 2 para logar no sistema.");
            System.out.println("Digite 3 para sair do sistema.");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1: {
                    Pessoa pessoa = new Pessoa();
                    System.out.println("Digite seu Nome:");
                    pessoa.setNome(scan.next());
                    System.out.println("Digite seu CPF:");
                    pessoa.setCpf(scan.next());
                    System.out.println("Digite sua Data de Nascimento:");
                    pessoa.setNascimento(scan.next());
                    System.out.println("Digite seu Endereço");
                    pessoa.setEndereco(scan.next());
                    System.out.println("Diga seu Email:");
                    pessoa.setEmail(scan.next());
                    if (lista.salvar(pessoa)) {
                        System.err.println("Usuário cadastrado com sucesso!");
                    } else {
                        System.err.println("Tente Novamente");
                    }

                    System.out.println(pessoa.toString());
                    System.out.println();
                    break;
                }

                case 2: {
                    String email;
                    String cpf;
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println(" Para Logar Utilize Seu Email e CPF");
                    System.out.println("------------------------------------");
                    System.out.println();
                    System.out.println("Digite seu Email:");
                    email = scan.next();
                    System.out.println("Digite seu Cpf:");
                    cpf = scan.next();
                    boolean verificador = lista.verifica(email, cpf);
                    System.out.println();

                    int opcao2 = 0;
                    while (verificador != false && opcao2 != 5) {
                        System.out.println();
                        System.out.println("Digite 1 Para Inserir um Produto: ");
                        System.out.println("Digite 2 Para Buscar um Produto: ");
                        System.out.println("Digite 3 Para Deletar um Produto: ");
                        System.out.println("Digite 4 Para mostrar todos os Produtos cadastrado: ");
                        System.out.println("Digite 5 Para Sair ");
                        opcao2 = scan.nextInt();
                        switch (opcao2) {

                            case 1: {
                                //int codigo = 0;
                                
                                System.out.println("Digite a Descrição do Produto: ");
                                String descrição = scan.next();
                                System.out.println("Digite o Tipo de Produto");
                                String tipo = scan.next();
                                System.out.println("Digite o Preço do Produto: ");
                                float preço = scan.nextFloat();
                                System.out.println("Digite o CFOP do Produto");
                                int CFOP = scan.nextInt();
                                System.out.println("Digite o ICMS do Produto");
                                int ICMS = scan.nextInt();
                                System.out.println("Digite o NCM do Produto");
                                int NCM = scan.nextInt();
                                Produto produto = new Produto( descrição, tipo, preço, CFOP, ICMS, NCM);
                                prod.salvar(produto);
                                System.out.println(produto);
                                break;
                            }

                            case 2: {

                                System.out.println("Digite o Codigo do Produto que Deseja Buscar");
                                int cod = scan.nextInt();
                                Produto existe = prod.buscar(cod);
                                if (existe == null) {
                                    System.err.println("Produto Não Encontrado");
                                } else {
                                    System.out.println(existe);
                                }
                                break;
                            }

                            case 3: {

                                System.out.println("Digite o Codigo do Produto que Deseja Excluir");
                                int cod = scan.nextInt();
                                Produto excluir = prod.buscar(cod);
                                prod.deletar(excluir);
                                break;
                            }
                            case 4:{
                                System.out.println(prod.listarTodos());
                                break;
                            }
                        }
                    }
                    break;
                }
                default: {
                    opcao = 3;
                }
                System.out.println("Obrigado Por Utilizar Nosso Sistema");

            }
        }
    }
}