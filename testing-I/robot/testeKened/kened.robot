*** Settings ***
Library         SeleniumLibrary
Resource        ./kened.resource


*** Test Case ***
Processo de compra da loja Sauce Demo
    Abrir o site da loja sauce Demo
    Fazer login
    Adicionar um produto ao carrinho
    Acessar o carrinho
    Clicar em 'Checkout'
    Preencher informações do usuario