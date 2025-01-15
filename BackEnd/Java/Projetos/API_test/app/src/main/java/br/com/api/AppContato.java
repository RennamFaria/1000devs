package br.com.api;

import java.util.ArrayList;

import spark.Spark;
import spark.Request;
import spark.Response;
import spark.Route;

// - Crie as rotas abaixo:
// 	Endereço: /contato/criar   				Método: Post
// 	Endereço: /contato/listarTodos			Método: Get
// 	Endereço: /contato/obterPorCpf/:cpf			Método: Get
// 	Endereço: /contato/obterPorIdade/:iddade		Método: Get
// 	Endereço: /contato/atualizar/:cpf			Método: Put
// 	Endereço: /contato/excluir/:cpf			Método: Delete

public class AppContato {
    private static ArrayList<Contato> listaContatos = new ArrayList<Contato>();

    public void main() {
        Spark.port(8080);

        Spark.post("/contato/criar", incluirContato());
        Spark.get("/contato/listarTodos", listarContatos());
        Spark.get("/contato/obterPorCpf/:CPF", obterContatoPorCPF());
        Spark.get("/contato/obterPorIdade/:idade", obterContatoPorIdade());
        Spark.put("/contato/atualizar/:CPF", atualizarContato());
        Spark.delete("/contato/excluir/:CPF", excluirContato());
    }

    public static Route incluirContato(){
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                String resposta = "";

                try {
                    String CPF = request.queryParams("CPF");
                    String nome = request.queryParams("nome");
                    int idade = Integer.parseInt(request.queryParams("idade"));
    
                    Contato newContact =  new Contato(CPF, nome, idade);
                    listaContatos.add(newContact);
    
                    response.status(201);
                    resposta = "Contato incluído com sucesso!";
                } catch (Exception e) {
                    System.err.println(e);
                    response.status(404);
                }
                return resposta;
            }
        };
    }

    public static Route listarContatos() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                String resposta = "";

                try {
                    if(listaContatos.isEmpty()){
                        resposta = "Lista de contatos vazia";
                        response.status(404);
                        return resposta;
                    }else{
                        for(Contato contato: listaContatos){
                            resposta += "\n" + contato.toString();
                        }
                        response.status(200);
                    }
                } catch (Exception e) {
                    System.err.println(e);
                    response.status(404);
                }

                return resposta;
            }
        };
    }

    public static Route obterContatoPorCPF() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                String resposta = "";

                try {
                    String CPF = request.queryParams(":CPF");

                    if(listaContatos.isEmpty()){
                        resposta = "Lista de contatos vazia";
                        return resposta;
                    }else{
                        for(Contato contato: listaContatos){
                            if(contato.getCPF().equals(CPF)){
                                resposta += "\n" + contato.toString();
                            }
                        }
                        response.status(200);
                    }
                } catch (Exception e) {
                    System.err.println(e);
                    response.status(404);
                }

                return resposta;
            }
        };
    }

    public static Route obterContatoPorIdade() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                String resposta = "";

                try {
                    int idade = Integer.parseInt(request.queryParams("idade"));

                    if(listaContatos.isEmpty()){
                        resposta = "Lista de contatos vazia";
                        response.status(404);
                        return resposta;
                    }else{
                        for(Contato contato: listaContatos){
                            if(contato.getIdade() == idade){
                                resposta = "\n" + contato.toString();
                            }
                        }
                        response.status(200);
                    }
                } catch (Exception e) {
                    System.err.println(e);
                    response.status(404);
                }

                return resposta;
            }
        };
    }

    public static Route atualizarContato() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                String resposta = "";
                try {
                    String CPF = request.params(":CPF");
                    String nome = request.queryParams("nome");
                    int idade = Integer.parseInt(request.queryParams("idade"));

                    if(listaContatos.isEmpty()){
                        resposta = "Lista de contatos vazia";
                        response.status(404);
                        return resposta;
                    }else{
                        for(Contato contato: listaContatos){
                            if(contato.getCPF().equals(CPF)){
                                contato.setNome(nome);
                                contato.setIdade(idade);

                                response.status(202); 
                                resposta = "Contato atualizado: \n" + contato.toString();
                            }
                        }   
                        response.status(404);
                        resposta = "Contato com CPF: " + CPF + " não encontrado";
                    }

                } catch (Exception e) {
                    System.err.println(e);
                    response.status(404);
                }

                return resposta;
            }
        };
    }     

    public static Route excluirContato() {
        return new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                String resposta = "";

                try {
                    String CPF = request.queryParams(":CPF");

                    if(listaContatos.isEmpty()){
                        resposta = "Lista de contatos vazia";
                        response.status(404);
                    }else{
                        for(Contato contato: listaContatos){
                            if(contato.getCPF().equals(CPF)){
                                listaContatos.remove(contato);
                                response.status(202);

                                resposta = "Contato deletado: \n" + contato.toString();
                                return resposta;
                            }
                        }
                        response.status(404);
                        resposta = "Contato com CPF: " + CPF + " não encontrado";
                    }
                } catch (Exception e) {
                    System.err.println(e);
                    response.status(404);
                }
                return resposta;
            }
        };
    }
}
