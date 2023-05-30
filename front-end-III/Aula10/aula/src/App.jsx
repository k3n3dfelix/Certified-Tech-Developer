import { useState } from 'react';
import './App.css';
import CardComponent from './Components/Card/CardComponents';
import InputComponent from './Input/InputComponent';


function App() {
  const [title, setTitle] = useState("");
  const [imgUrl, setImgUrl] = useState("");
  const [card, setCard] = useState({});

  const handleChangeTitle = (event) => {
    setTitle(event.target.value);
  }

  const handleChangeImgUrl = (event) => {
    setImgUrl(event.target.value);
  }

  const handleButtonClick = (event) => {
    event.preventDefault();
    setCard(
      {
      title: title,
      imgUrl : imgUrl
    });
    setTitle('');
    setImgUrl('');

  }
  return (
    <>
      <h2>Template Checkpoint</h2>
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

      <CardComponent 
        title={card.title}
        imgUrl={card.imgUrl}
      />
    </>
  )
}

export default App