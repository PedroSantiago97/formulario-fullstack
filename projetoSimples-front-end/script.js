const formulario = document.querySelector("form");
const Inome = document.querySelector("#nome");
const Iemail = document.querySelector("#email");
const Isenha = document.querySelector("#senha");
const Itelefone = document.querySelector("#telefone");


function cadastrar () {
    const usuario = {
        nome: Inome.value,
        email: Iemail.value,
        senha: Isenha.value,
        telefone: Itelefone.value
    };
    fetch("http://localhost:8080/usuarios",
        {
            method: "POST",
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            
           
            body: JSON.stringify(usuario)
        })
        .then(function (res) {console.log(res)})
        .catch(function (res) {console.log(res)})
}

function limpar(){
    Inome.value = "";
    Iemail.value = "";
    Isenha.value = "";
    Itelefone.value = "";

}


formulario.addEventListener('submit', function(event){
    event.preventDefault();
    cadastrar();
    limpar();
    

});

