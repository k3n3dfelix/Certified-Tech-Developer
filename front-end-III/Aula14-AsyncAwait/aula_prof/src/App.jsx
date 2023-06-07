import axios from 'axios';
import './App.css';
import { useEffect,useState} from 'react'

function App() {

  /* Axios está instalado no projeto! 
    -> https://www.npmjs.com/package/axios
  */

  /* API IBGE Endpoints:
  
  -> Busca lista de UFs/estados: 
    https://servicodados.ibge.gov.br/api/v1/localidades/estados

  -> Busca cidades por estado/UF: 
    https://servicodados.ibge.gov.br/api/v1/localidades/estados/{UF}/municipios
 */
  const [estados,setEstados] = useState([]);
  const [cidades, setCidades] = useState([]);
  const [estadoSelecionado, setEstadoSelecionado] = useState(undefined);
  const [ cidadeSelecionada, setCidadeSelecionada] = useState(undefined);

  const buscarEstadosApi = async () => {
    console.log("Buscando estados brasileiros");
    const response = await axios.get('https://servicodados.ibge.gov.br/api/v1/localidades/estados/')
    console.log(response.data);
    setEstados(response.data);

  }

  const BuscaCidadesApi = async () => {
    console.log("Buscando estados brasileiras com base no estado/uf");
  
    const response = await axios.get(`https://servicodados.ibge.gov.br/api/v1/localidades/estados/${estadoSelecionado}/municipios`);
    setCidades(response.data);
    console.log(cidades)
  }

  useEffect(() => {
    buscarEstadosApi();
  }, []);

  useEffect(() => {
    BuscaCidadesApi();
  }, [estadoSelecionado]);


  return (
    <>

      <div className='div-selects'>

        <h1>IBGE: Localidades</h1>

        <label>Selecione o estado</label>
        <br />
        <select
          value={"default"}
          onChange={(e) => {setEstadoSelecionado(e.target.value) }}
        >
          <option value="default">Selecione...</option>
          {
            estados.map(estado=> {
              return (
                <option 
                  key={estado.id}
                  value={estado.sigla}
                >{estado.sigla } - {estado.nome}</option>
              )
            })
          }
        </select>

        <br />
        <br />

        <label>Selecione a cidade</label>
        <br />
        <select
          disabled={cidades.length > 0 ? false : true}
          value={"city1"}
          onChange={(e) => { setCidadeSelecionada(e.target.value)}}
        > 

          <option value="default">Selecione...</option>
          
         {cidades.map(cidade => {
          return (
            <option 
              key={cidade.id}
              value={cidade.nome}
            >{cidade.nome}</option>
          )
         }

         )}
         
        </select>


      </div>


      <div className='div-resposta'>
        <h3>Dados selecionados</h3>
        <p>Estado: {estadoSelecionado ?? "Indefinidos"}</p>
        <p>Cidade: {cidadeSelecionada ?? "Indefinida"}</p>
      </div>
    </>
  )
}

export default App;