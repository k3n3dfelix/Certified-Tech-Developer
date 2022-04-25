
const alunos = require('./estudantes');
function cursos(){
  
    let cursos = [
        {
            "nome_curso":"Certified Tech Developer",
            "nota_aprovacao": 7.5,
            "faltas_maximas":9,
            "estudantes":alunos()
        }
      ]
    ;
    return cursos
    
}

module.exports = cursos;