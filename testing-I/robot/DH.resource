*** Variables ***
${SITE}         https://www.digitalhouse.com/br
${NAVEGADOR}    Chrome
${IFRAME_COOKIES}       xpath=/html/body/iframe[2]
${BOTAO_COOKIES}        xpath=/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]

*** Keywords ***
Abrir o novo site da Digital House Brasil
    Open Browser      ${SITE}     ${NAVEGADOR}
 Maximize Browser and Window

Clicar em “Aceitar Cookies”
 Sleep 5
 Select Frame    ${IFRAME_COOKIES}
 Wait and Click  ${BOTAO_COOKIES}
 Unselect Frame

Selecionar o curso "Data Analistics"
    Execute Javascript window.scroll(0,900)

Wait and Click
 [Arguments]                    ${ELEMENTO}
 Wait Until Element is Visible  ${ELEMENTO}
 Click Element                  ${ELEMENTO}




