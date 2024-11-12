const urlApi = 'http://localhost:3000/alunos';

async function cadastrarAlunos(event) {
    //remover o comportamento de recarregar a pagina ao dar submit
    event.preventDefault();

    const nome = document.getElementById('nome').value;
    const CPF = document.getElementById('cpf').value;
    const email = document.getElementById('email').value;
    const tel = document.getElementById('tel').value;
    const date = document.getElementById('date').value;
    
    const aluno = {
        nome,
        CPF,
        email,
        tel,
        date
    };

    // Enviar uma requisicao para o link/banco de dados
    const request = new Request(urlApi, {
        method: 'POST',
        body: JSON.stringify(aluno),
        headers: new Headers({
            'Content-Type': 'aplication/json'
        })
    });

    const response = await fetch(request);
    console.log(response);

    //C      R    U         D
    //Create Read Update    Delete

    //POST  GET  PUT/PATH   DELETE
}