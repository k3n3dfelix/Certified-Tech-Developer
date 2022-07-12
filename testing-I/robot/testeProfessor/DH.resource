*** Variables ***
${SITE}                         https://www.digitalhouse.com/br
${NAVEGADOR}                    Chrome
${OUTROS_CURSOS}                css=#__next > div > main > section > div > div.mt-8.flex.justify-center > div > a
${DATA_ANALYTICS}               xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[3]/a
${CHAMADA_DATA_ANALYTICS}       voltado para qualquer pessoa que deseja ampliar suas capacidades analíticas
${DESCRICAO_DATA_ANALYTICS}     pessoas interessadas em business intelligence
${INSCREVA_AGORA}               xpath=//*[@id="__next"]/div/main/section/div/div/div[1]/div/div[2]/div[1]/a
${INSCREVA}                     xpath=//*[@id="0"]/div/a
${DATA_SCIENCE}                 xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[4]/a
${CHAMADA_DATA_SCIENCE}         profissionais de diversas áreas que desejam melhorar sua comunicação como engenheiros de Big Data
${DESCRICAO_DATA_SCIENCE}       adquirir habilidades práticas com as ferramentas específicas para fazer análises

*** Keywords ***
Abrir o novo site da Digital House Brasil
  Open Browser          ${SITE}     ${NAVEGADOR}
  Maximize Browser Window

Clicar em “Ver outros cursos”
  Execute Javascript    window.scroll(0,900)
  Wait and Click        ${OUTROS_CURSOS}

Selecionar o curso “Data Analytics”
  Execute Javascript    window.scroll(0,500)
  Wait and Click        ${DATA_ANALYTICS}

Verificar se o texto de chamada do curso está correto
  Page Should Contain   ${CHAMADA_DATA_ANALYTICS}

Verificar se a descrição do curso está correta
  Page Should Contain   ${DESCRICAO_DATA_ANALYTICS}

Clicar em “Inscreva-se agora"
  Wait and Click        ${INSCREVA_AGORA}

Clicar em “Inscreva-se”
  Execute Javascript    window.scroll(0,3000)
  Wait and Click        ${INSCREVA}

Clicar no botão "Inscreva-se agora"
  Wait and Click        ${INSCREVA_AGORA}

Clicar no botão "Inscreva-se"
  Execute Javascript    window.scroll(0,3000)
  Wait and Click        ${INSCREVA}

Validar que o valor do curso é “R$10.315”
  Page Should Contain   R$10.315

Selecionar o curso “Data Science”
  Execute Javascript    window.scroll(0,500)
  Wait and Click        ${DATA_SCIENCE}

Verificar se o texto de chamada do curso de Data Science está correto
  Page Should Contain   ${CHAMADA_DATA_SCIENCE}


Verificar se a descrição do curso de Data Science está correta
  Page Should Contain   ${DESCRICAO_DATA_SCIENCE}

Validar que o valor do curso é “R$ 11.878”
  Page Should Contain   R$11.878


Wait and Click
  [Arguments]                       ${ELEMENTO}
  Wait Until Element is Visible     ${ELEMENTO}
  Click Element                     ${ELEMENTO}