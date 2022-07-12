*** Settings ***
Library         SeleniumLibrary
Resource        DH.resource
Test Setup      Abrir o novo site da Digital House Brasil
Test Teardown   Close Browser

*** Test Cases ***
Validação das informações do curso de Data Analytics
 Clicar em “Aceitar Cookies”
 Clicar em “Ver outros cursos”
 Selecionar o curso “Data Analytics”
 Verificar se o texto de chamada do curso está correto
 Verificar se a descrição do curso está correta
 Clicar em “Inscreva-se agora
 Clicar em “Inscreva-se”
 Validar que o valor do curso é “R$10.315”

