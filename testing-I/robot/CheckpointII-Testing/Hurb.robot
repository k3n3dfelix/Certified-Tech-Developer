*** Settings ***
Library         SeleniumLibrary
Resource        ./Hurb.resource
Test Setup      Abrir o site do Hurb




*** Test Case ***
Processo de reserva de pacote de viagens Buenos Aires
  Clicar em “Permitir todos os cookies”
  Selecionar a opção “Pacotes”
  Buscar por alguma cidade turística 
  Selecionar um pacote de viagem
  Clicar em “Escolher pacote”
  Selecionar a opção “Boleto parcelado”
  Preencher os dados de pagamento
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Validar a informação sobre cancelamento grátis

Processo de reserva de pacote de viagens Japão
  Clicar em “Permitir todos os cookies”2
  Selecionar a opção “Pacotes”2
  Buscar por alguma cidade turística2
  Selecionar um pacote de viagem2
  Clicar em “Escolher pacote”2
  Selecionar a opção “Boleto parcelado”2
  Preencher os dados de pagamento2
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”2
  Validar a informação sobre cancelamento grátis2

Processo de reserva de pacote de viagens Irlanda
  Clicar em “Permitir todos os cookies”3
  Selecionar a opção “Pacotes”3
  Buscar por alguma cidade turística3
  Selecionar um pacote de viagem3
  Clicar em “Escolher pacote”3
  Selecionar a opção “Boleto parcelado”3
  Preencher os dados de pagamento3
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”3
  Validar a informação sobre cancelamento grátis3

Processo de reserva de pacote de viagens Barcelona
  Clicar em “Permitir todos os cookies”4
  Selecionar a opção “Pacotes”4
  Buscar por alguma cidade turística4
  Selecionar um pacote de viagem4
  Clicar em “Escolher pacote”4
  Selecionar a opção “Boleto parcelado”4
  Preencher os dados de pagamento4
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”4
  Validar a informação sobre cancelamento grátis4
  
 
