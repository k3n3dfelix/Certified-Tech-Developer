const alicia = [23, 69, 32];
const bob = [12, 67, 43];
function encontrarGanhador(a, b) {
    var pontosPrimeiroParticipante = 0;
    var pontosSegundoParticipante = 0;
    for (let i = 0; i < a.length; i++) {
        if (a[i] > b[i]) {
            pontosPrimeiroParticipante++;
        } else if
            (a[i] < b[i]) {
            pontosSegundoParticipante++;
        }
    }
    if (pontosPrimeiroParticipante > pontosSegundoParticipante) {
        console.log("O ganhador é: Alice");
    } else {
        console.log("O ganhador é: Bob");
    }
}

encontrarGanhador(alicia, bob);