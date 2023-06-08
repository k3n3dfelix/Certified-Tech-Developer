import axios from "axios";
import { useEffect, useState } from "react";
import './App.css';

import ProductList from "./ProductList";
import Input from "./Input";

function App() {

  const [products, setProducts] = useState({});
  const [isLoading, setIsLoading] = useState(false);

  async function getProducts() {

    setIsLoading(true);
    try {
      const response = await axios.get("api/products");
      const products = response.data.products;

      if(products.length > 0){
        setProducts(products)
      }
     setIsLoading(false);
    } catch (error) {
      setIsLoading(false);
      alert(`Ocorreu um erro ao buscar a lista de produtos - Erro ${error}`)
    }

  }
  console.log('products', products);
  useEffect(() => {
    getProducts();
  }, [products])
  return (
    <>

      <h2>Cadastre seu produto</h2>

      <form>

        <Input
          title="Título"
          type="text"
          value={"title"}
          fnOnChange={(e) => { }}
          fnOnKeyUp={"formValidator"}
        />

        <br />

        <Input
          title="Descrição"
          type="text"
          value={"description"}
          fnOnChange={(e) => { }}
          fnOnKeyUp={"formValidator"}
        />

        <br />

        <Input
          title="Preço"
          type="text"
          value={"price"}
          fnOnChange={(e) => { }}
          fnOnKeyUp={"formValidator"}
        />

        <br />

        <Input
          title="Estoque"
          type="text"
          value={"stock"}
          fnOnChange={(e) => { }}
          fnOnKeyUp={"formValidator"}
        />

        <br />

        <Input
          title="Categoria"
          type="text"
          value={"category"}
          fnOnChange={(e) => { }}
          fnOnKeyUp={"formValidator"}
        />

        <br />

        <Input
          title="IMG Url"
          type="text"
          value={"image"}
          fnOnChange={(e) => { }}
          fnOnKeyUp={"formValidator"}
        />

        <br />

        <button
          disabled={true}
          onClick={() => { }}>
          Cadastrar
        </button>

      </form>





      {/* Lista de produtos */}
      {/* <h2>Lista de produtos</h2> */}

      <ProductList
        productIsLoading={isLoading}
        producList={products}
      />

    </>
  );
}

export default App;
