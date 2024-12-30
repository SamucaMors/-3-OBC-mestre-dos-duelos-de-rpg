// função duelo
function duelo(lutador1, lutador2){
    //Enquanto ambos tiverem vida
    while(lutador1.vida > 0 && lutador2.vida > 0){
        //Lutador 1 ataca
        lutador2.vida -= lutador1.poder;
        //Verifica se o lutador 2 foi derrotado
        //Se for derrotado retorna o lutador 1
        if(lutador2.vida<=0){
            return `${lutador1.nome}`;
        }
        //Lutador 2 ataca
        lutador1.vida -= lutador2.poder;
        if (lutador1.vida <= 0){
            return `${lutador2.nome}`
        }
    }
}

//Exemplo de uso
const guereiro = {nome: "Thor", classe: "Guerreiro", vida: 100, poder: 20};
const mago = {nome: "Gandalf", classe: "Mago", vida: 80, poder: 25};

console.log(duelo(mago, guerreiro));