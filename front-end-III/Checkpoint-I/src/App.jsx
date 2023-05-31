import { useState } from 'react';
import './App.css';
import style from './App.module.css'
import CardComponent from './Components/Card/CardComponents';
import InputComponent from './Input/InputComponent';
import CardsListComponent from './Components/CardListComponent/CardListComponent';


function App() {
  const [title, setTitle] = useState("");
  const [imgUrl, setImgUrl] = useState("");
  const [spanErro, setSpanErro] = useState("");
  const [card, setCard] = useState({});
  const [formIsValid, setFormIsValid] = useState(false);
  const [cardList, setCardList] = useState([]);

  const handleChangeTitle = (event) => {
    setTitle(event.target.value);
  }

  const handleChangeImgUrl = (event) => {
    setImgUrl(event.target.value);
  }

  const handleButtonClick = (event) => {
    event.preventDefault();

    const validacaoForm = formValidator();

    if (validacaoForm) {
      setCardList([
        ...cardList,
        {
          title: title,
          imgUrl: imgUrl
        }
      ]
      );
      setSpanErro('');
      setTitle('');
      setImgUrl('');
    } else {
      setSpanErro("Por favor, verifique os dados inseridos no formulário!");
    }


  }
 
  const formValidator = () => {

    const regexNumero = /[0-9]/;
    const retornoRegex = regexNumero.test(imgUrl)

    if (title.length >= 3 && title.trim().length === title.length && imgUrl.length >= 6 && retornoRegex) {
      return true
    } else {
      return false;
    }
  }
  return (
    <>
      <div className={style.Container}>
      <h2>Animes Favoritos</h2>
      <form>
        <InputComponent
          title="Titulo do anime"
          type="text"
          value={title}
          fnOnChange={handleChangeTitle}
        />
        <InputComponent
          title="Img URL"
          type="url"
          value={imgUrl}
          fnOnChange={handleChangeImgUrl}
        />
        <button onClick={handleButtonClick}>Salvar</button>
      </form>
      <span className={style.spanError}>{spanErro ? spanErro : null}</span>
      <CardsListComponent>
        {
          cardList.map(card => {
            return (
              <CardComponent
                key={card.title}
                title={card.title}
                imgUrl={card.imgUrl}
              />
            );
          })
        }
      </CardsListComponent>
      </div>
    </>
  )
}

export default App