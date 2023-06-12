import axios from "axios";
import { useEffect, useState } from "react";
import './App.css';

import ProductList from "./ProductList";
import Input from "./Input";

function App() {

  /// Estados da Lista de produtos
  const [products, setProducts] = useState([]);
  const [productsIsLoading, setProductsIsLoading] = useState(false);
  const [isEditing, setIsEditing] = useState(false);

  /// Estados do Formulário
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [category, setCategory] = useState("");
  const [image, setImage] = useState("");
  const [price, setPrice] = useState("");
  const [stock, setStock] = useState("");
  const [formIsValid, setFormIsValid] = useState(false);


  useEffect(
    () => {
      console.log("<App /> Foi Montado");
      getProducts();
    }, []
  )

  /* REQUISITO: Utilizando o projeto disponibilizado, 
  você deverá criar uma requisição que é executada logo na montagem dos componentes 
  para buscar todos os produtos, cadastrados no servidor e mostrá-los, 
  através de uma lista, em um componente do sistema. */
  async function getProducts() {

    setProductsIsLoading(true);

    try {

      const response = await axios.get("api/products");
      const products = response.data.products;

      setProductsIsLoading(false);

      if (products.length > 0) {
        setProducts(products);
      } else {
        setProducts([]);
      }

    } catch (error) {
      setProductsIsLoading(false);
      alert(`Ocorreu algum erro ao buscar a lista de produtos - Erro: ${error}`)
    }

  }

  async function deleteProduct(id) {

    try {
      const response = await axios.delete(`api/products/${id}`);

      console.log('deletei', response);

      if (response.status === 204) {
        const response = await axios.get("api/products");
        const products = response.data.products;
        setProducts(products);
      }
    } catch (error) {
      alert(`Ocorreu algum erro ao deletato produto - Erro: ${error}`)
    }
  }

  async function editProduct(id) {
    event.preventDefault();
    setIsEditing(true);
    try {

      const response = await axios.get(`api/products/${id}`);
      const product = response.data.product;

      setProductsIsLoading(false);
      setTitle(product.title);
      setDescription(product.description);
      setCategory(product.category);
      setImage(product.image);
      setPrice(product.price);
      setStock(product.stock);


    } catch (error) {
      setProductsIsLoading(false);
      alert(`Ocorreu algum erro ao buscar o produto - Erro: ${error}`)
    }
  }
  function formValidator() {

    if (title && description && price && stock && category && image) {
      setFormIsValid(true);
    } else {
      setFormIsValid(false);
    }
  }

  async function createProduct(event) {

    event.preventDefault();
    console.log('event', event.target);
    if (event.target.value === "<button>Editar</button>") {
      const updatedProduct = {
        title,
        description,
        price,
        stock,
        category,
        image,
      }
      try {
        await axios.put(`api/products/${id}`, updatedProduct)
        getProducts()
        setIsEditing(false);
        setTitle('');
        setDescription('');
        setCategory('');
        setImage('');
        setPrice('');
        setStock('');
        alert("Produto Atualizado!")
      } catch (error) {
        console.error("Error", error)
        alert("Erro: Produto não econtrado!")
      }
    } else {

      const newProduct = {
        title,
        description,
        price,
        stock,
        category,
        image,
      }
      try {
        await axios.post('api/products', newProduct)
        alert("Produto Criado!")
        getProducts()
      } catch (error) {
        console.error("Error", error)
      }
    }

  }

  return (
    <>

      <h2>Cadastre seu produto</h2>

      <form>

        <Input
          title="Título"
          type="text"
          value={title}
          fnOnChange={(e) => setTitle(e.target.value)}
          fnOnKeyUp={formValidator}
        />

        <br />

        <Input
          title="Descrição"
          type="text"
          value={description}
          fnOnChange={(e) => setDescription(e.target.value)}
          fnOnKeyUp={formValidator}
        />

        <br />

        <Input
          title="Preço"
          type="text"
          value={price}
          fnOnChange={(e) => setPrice(e.target.value)}
          fnOnKeyUp={formValidator}
        />

        <br />

        <Input
          title="Estoque"
          type="text"
          value={stock}
          fnOnChange={(e) => setStock(e.target.value)}
          fnOnKeyUp={formValidator}
        />

        <br />

        <Input
          title="Categoria"
          type="text"
          value={category}
          fnOnChange={(e) => setCategory(e.target.value)}
          fnOnKeyUp={formValidator}
        />

        <br />

        <Input
          title="IMG Url"
          type="text"
          value={image}
          fnOnChange={(e) => setImage(e.target.value)}
          fnOnKeyUp={formValidator}
        />

        <br />

        <button
          disabled={!formIsValid}
          onClick={createProduct}>
          {isEditing  ? 'Editar' : 'Cadastrar'}
        </button>

      </form>

      {/* Lista de produtos */}
      <h2>Lista de produtos</h2>

      <ProductList
        productList={products}
        productsIsLoading={productsIsLoading}
        fnDelete={deleteProduct}
        fnEdit={editProduct}
      />

    </>
  );
}

export default App;

