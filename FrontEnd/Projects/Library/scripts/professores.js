const urlApi = 'http://localhost:3000/professores';
const resultDiv = document.getElementById('result');

async function cadastrarProfesssor(event) {

    event.preventDefault();

    const nome = document.getElementById('nome').value;
    const cpf = document.getElementById('cpf').value;
    const email = document.getElementById('email').value;
    const telefone = document.getElementById('tel').value;
    const areaAtuacao = document.getElementById('areaAtuacao').value;
    const date = document.getElementById('date').value;

    const professor = {
        nome,
        cpf,
        email,
        telefone,
        areaAtuacao,
        date
    }

    const request = new Request(urlApi, {
        method: 'POST',
        body: JSON.stringify(professor),
        headers: new Headers({
            'Content-Type': 'application/json'
        })
    })

    const response = await fetch(request);
    if(!response.ok){
        throw new Error("Error in get fetch");
    }
    const data = await response.json();

    alert('Cadastrado com sucesso !');
}

async function getProfessores() {
    const response = await fetch(urlApi);
    if(!response.ok){
        throw new Error("Error in get fetch");
    }
    const data = await response.json();
  
    data.forEach(element => {
      resultDiv.insertAdjacentHTML('beforeend',
            `
                <tr>
                    <td>${element.nome}</td>
                    <td>${element.cpf}</td>
                    <td>${element.email}</td>
                    <td>${element.telefone}</td>
                    <td>${element.areaAtuacao}</td>
                    <td>${element.date}</td>
                </tr>
            `
        )
    });
  };
  
  getProfessores()