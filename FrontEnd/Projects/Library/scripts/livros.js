const urlApi = 'http://localhost:3000/livros';
const resultDiv = document.getElementById('result').getElementsByTagName('tbody')[0];

async function cadastrarLivro(event) {
    event.preventDefault();
    
    try {
        const livro = {
            titulo: document.getElementById('titulo').value,
            subtitulo: document.getElementById('subtitulo').value,
            isbn: document.getElementById('isbn').value,
            anoPubli: document.getElementById('anoPubli').value,
            edicao: document.getElementById('edicao').value,
            autor: document.getElementById('autor').value,
            editora: document.getElementById('editora').value,
            categoria: document.getElementById('categoria').value,
            preco: document.getElementById('preco').value,
            sinopse: document.getElementById('sinopse').value,
            capaLivro: document.getElementById('capaLivro').value,
            status: document.getElementById('status').value
        };

        const response = await fetch(urlApi, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(livro)
        });

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const data = await response.json();
        alert('Livro cadastrado com sucesso!');
        
        event.target.reset();
        
        await getLivros();
    } catch (error) {
        console.error('Error:', error);
        alert('Erro ao cadastrar livro: ' + error.message);
    }
}

async function getLivros() {
    try {
        const response = await fetch(urlApi);
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const data = await response.json();
        
        resultDiv.innerHTML = '';
        
        data.forEach(element => {
            resultDiv.insertAdjacentHTML('beforeend', `
                <tr>
                    <td>${element.titulo}</td>
                    <td>${element.subtitulo}</td>
                    <td>${element.isbn}</td>
                    <td>${element.anoPubli}</td>
                    <td>${element.edicao}</td>
                    <td>${element.autor}</td>
                    <td>${element.editora}</td>
                    <td>${element.categoria}</td>
                    <td>${element.preco}</td>
                    <td>${element.sinopse}</td>
                    <td>${element.capaLivro}</td>
                    <td>${element.status}</td>
                </tr>
            `);
        });
    } catch (error) {
        console.error('Error:', error);
        alert('Erro ao carregar livros: ' + error.message);
    }
}

getLivros();