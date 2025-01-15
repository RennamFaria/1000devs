package br.com.api;

import java.util.ArrayList;

import spark.Spark;
import spark.Request;
import spark.Response;
import spark.Route;

public class AppPessoa {
    // Aqui definimos a lista contatos como variaveis globais
    // pois já estamos utilizando a orientação a objetos para ter uma melhor
    // separação não sendo necessário termos tanta proteção às variaveis do
    // programa principal
    private static ArrayList<Pessoa> listaContatos = new ArrayList<Pessoa>();

    public static void main(String[] args) {

        Spark.port(8080);

        Spark.get("/usuario/listar", listarUsuario());
        Spark.post("/usuario/cadastrar", incluirContato());
        Spark.get("/usuario/cadastrar/:nome/:email/:telefone", incluirContatoURL());
        Spark.delete("/usuario/deletar/:codigo/:nome", excluirContato());
        Spark.post("/usuario/cadastrar/:nome", incluirContatoURL2());

        // Spark.delete(/caminho/da/rota/:codigo,metodo); //rota para excluir um valor
        // Spark.put(/caminho/da/rota/:codigo,metodo); //rota para atualizar um valor
    }

    private static Route incluirContato() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {

                String name = request.queryParams("nome");
                String email = request.queryParams("email");
                String telefone = request.queryParams("telefone");

                Pessoa novaPessoa = new Pessoa(name, telefone, email);
                listaContatos.add(novaPessoa);

                response.status(201);
                return "Contato incluído com sucesso!";
            }
        };
    }

    private static Route incluirContatoURL() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {

                String name = request.params("nome");
                String email = request.params("email");
                String telefone = request.params("telefone");

                Pessoa novaPessoa = new Pessoa(name, telefone, email);
                listaContatos.add(novaPessoa);

                response.status(201);
                return "Contato incluído com sucesso!";
            }
        };
    }

    private static Route incluirContatoURL2() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {

                String name = request.params("nome");
                String email = request.queryParams("email");
                String telefone = request.queryParams("telefone");

                Pessoa novaPessoa = new Pessoa(name, telefone, email);
                listaContatos.add(novaPessoa);

                response.status(201);
                return "Contato incluído com sucesso!";
            }
        };
    }

    private static Route listarUsuario() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                String resposta = "";
                // metodo isEmpty verifica se a lista esta vazia
                if (listaContatos.isEmpty()) {
                    resposta += "Nenhum contato cadastrado.";
                } else {
                    resposta += "\n--- Lista de Contatos ---";
                    for (Pessoa pessoa : listaContatos) {
                        resposta += "\n" + pessoa.toString();
                    }
                }

                return resposta;
            }
        };
    }

    // Método para lidar com a rota de excluir usuário
    private static Route excluirContato() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {

                int id = Integer.parseInt(request.params(":codigo"));
                
                if (listaContatos.isEmpty()) {
                    response.status(404); // 404 Not Found
                    return "Não existem contatos na base.";
                } else {
                    for (Pessoa pessoa : listaContatos) {
                        if (pessoa.getId() == id){
                            listaContatos.remove(pessoa);
                            response.status(200); 
                            return "Usuario com " + id + " foi excluido com sucesso!";
                        }
                    }

                    response.status(404); // 404 Not Found
                    return "Contato com id: " + id + "não encontrado.";
                }
            }
        };
    }
}
