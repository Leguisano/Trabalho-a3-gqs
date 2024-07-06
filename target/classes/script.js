const cepInput = document.getElementById('cep');
const estadoInput = document.getElementById('estado');
const cidadeInput = document.getElementById('cidade');
const bairroInput = document.getElementById('bairro');
const ruaInput = document.getElementById('rua');

function buscarEndereco() {
  const cep = cepInput.value.replace(/[^0-9]/g, '');

  if (cep.length >= 8) {
    fetch(`https://viacep.com.br/ws/${cep}/json/`)
      .then(response => response.json())
      .then(data => {
        if (data.erro) {
          // Handle error (e.g., display error message)
          return;
        }

        estadoInput.value = data.uf;
        cidadeInput.value = data.localidade;
        bairroInput.value = data.bairro;
        ruaInput.value = data.logradouro;

        // Enable disabled input fields
        estadoInput.disabled = false;
        cidadeInput.disabled = false;
        bairroInput.disabled = false;
        ruaInput.disabled = false;
      })
      .catch(error => {
        console.error('Error:', error);
        // Handle network or other errors
      });
  }
}