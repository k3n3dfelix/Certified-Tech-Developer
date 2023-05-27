import { useState } from 'react';

import "../../styles.css";
import { TableListComponent } from '../TableListComponent';

export function FormComponent() {

    const [disciplinaName, setDisciplinaName] = useState('');
    const [notaAluno, setNotaAluno] = useState();
    const [disciplinaList, setDisciplinaList] = useState([]);
    const [isFormValid, setIsFormValid] = useState(false);
    const [isValidNota, setIsValidNota] = useState(true);
    const disciplinas = ['database', 'frontend', 'backend'];
    
    const handleChangeDisciplina = (event) => {
        setDisciplinaName(event.target.value);
    }

    const handleChangeAluno = (event) => {
        setNotaAluno(event.target.value);
       
        setIsValidNota(!isNaN(parseFloat(event.target.value)) && parseFloat(event.target.value) >= 0 && parseFloat(event.target.value) <= 10);
        console.log('isValidNota',isValidNota)
    }

    const formValidator = () => {
        if (disciplinaName !== 'devops' && notaAluno !== '' && isValidNota) {
            setIsFormValid(true);
        } else {
            setIsFormValid(false);
        }
    }

    const calcularMedia = (disciplina) => {
        const notasDisciplina = disciplinaList.filter((nota) => nota.disciplina === disciplina);
        const quantidadeAlunos = notasDisciplina.length;
        const somaNotas = notasDisciplina.reduce((acc, nota) => acc + Number(nota.nota), 0);
    
        if (quantidadeAlunos > 0) {
            return Number(somaNotas) / Number(quantidadeAlunos);
        }

        return 0;
    };
    const handleSubmit = (event) => {
        event.preventDefault();
        setDisciplinaList(
            [
                ...disciplinaList,
                {
                    disciplina: disciplinaName,
                    nota: notaAluno
                }
            ]
        )
        setDisciplinaName('');
        setNotaAluno('');
    }

    return (
        <div className="container">
            <h1>Média de Alunos por Disciplina</h1>
            <form className="form" onSubmit={handleSubmit}>
                <div className="container_input">
                    <select value={disciplinaName} onChange={handleChangeDisciplina} onBlur={formValidator}>
                        <option selected disabled>
                            Selecione uma disciplina
                        </option>
                        <option value="database">Banco de Dados</option>
                        <option value="backend">Desenvolvimento Backend</option>
                        <option value="frontend">Desenvolvimento Frontend</option>
                        <option value="devops">Devops</option>
                    </select>
                    <input type="number" value={notaAluno} onChange={handleChangeAluno} onBlur={formValidator} />
                </div>
                <input type="submit" value="Salvar" disabled={!isFormValid} />
            </form>

            <div className="container">
                <table border="1" className="line_title">
                    <thead>
                        <tr>
                            <th>Disciplina</th>
                            <th>Quantidade de Alunos</th>
                            <th>Média das notas dos alunos</th>
                        </tr>
                    </thead>
                    <TableListComponent>
                    {disciplinas.map((disciplina) => (
                        <tr key={disciplina}>
                            <td>{disciplina}</td>
                            <td>{disciplinaList.filter((nota) => nota.disciplina === disciplina).length}</td>
                            <td>{calcularMedia(disciplina)}</td>
                        </tr>
                    ))}
                    </TableListComponent>
                </table>
            </div>
        </div>
    )
}