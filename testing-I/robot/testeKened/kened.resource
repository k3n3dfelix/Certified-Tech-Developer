*** Variables ***
${SITE}                 https://www.saucedemo.com
${NAVEGADOR}            Chrome
${CAMPO_USUARIO}        id=user-name
${USUARIO}              standard_user
${CAMPO_PASSWORD}       id=password
${PASSWORD}             secret_sauce
${BOTAO_LOGIN}          id=login-button
${VAR}                  Products
${ADICIONAR_CARRINHO}   css=#add-to-cart-sauce-labs-backpack
${ACESSAR_CARRINHO}     css=#shopping_cart_container
${BOTAO_CHECKOUT}       css=#checkout
${CAMPO_NOME}           css=#first-name
${NOME}                 Kened
${CAMPO_SOBRENOME}      css=#last-name
${SOBRENOME}            Silva
${CAMPO_CEP}            css=#postal-code
${CEP}                  123456
${BOTAO_CONTINUE}       css=#continue

*** Keywords ***
Abrir o site da loja sauce Demo
    Open Browser    ${SITE}      ${NAVEGADOR}
    Maximize Browser Window

Fazer login
    Input Text                          ${CAMPO_USUARIO}     ${USUARIO} 
    Input Text                          ${CAMPO_PASSWORD}    ${PASSWORD}
    Click Element                       ${BOTAO_LOGIN}
    Set Selenium Speed                  0.7
    
Adicionar um produto ao carrinho    
    Click Element                       ${ADICIONAR_CARRINHO}

Acessar o carrinho
    Click Element                       ${ACESSAR_CARRINHO}

Clicar em 'Checkout'
    Click Element                       ${BOTAO_CHECKOUT}

Preencher informações do usuario
    Input Text                          ${CAMPO_NOME}           ${NOME} 
    Input Text                          ${CAMPO_SOBRENOME}      ${SOBRENOME} 
    Input Text                          ${CAMPO_CEP}            ${CEP} 
    Click Element                       ${BOTAO_CONTINUE}
    Set Selenium Speed                  0.5