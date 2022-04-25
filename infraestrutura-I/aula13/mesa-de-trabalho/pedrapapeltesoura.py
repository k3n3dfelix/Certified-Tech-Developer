#encoding:UTF-8
import random

while True: 
    aleatorio = random.randrange(0, 5)
    escolhaPc = ""
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Lagarto")
    print("5)Spock")
    print("6)Sair do Programa")
    opcao = int(input("O que você escolhe: "))
    
    if opcao == 1:
        escolhaUsuario = "pedra"
    elif opcao == 2:
        escolhaUsuario = "papel"
    elif opcao == 3:
        escolhaUsuario = "tesoura"
    elif opcao == 4:
        escolhaUsuario = "lagarto"
    elif opcao == 5:
        escolhaUsuario = "spock"
    elif opcao == 6:
        print ("Nos vemos!")
        break
    else:
        print ("Valor Invalido")
        continue
        
    print("Tua escolha: ", escolhaUsuario)   
    if aleatorio == 0:
        escolhaPc = "pedra"
    elif aleatorio == 1:
        escolhaPc = "papel"
    elif aleatorio == 2:
        escolhaPc = "tesoura"
    elif aleatorio == 3:
        escolhaPc = "lagarto"
    elif aleatorio == 4:
        escolhaPc = "spock"
    print("PC escolheu: ", escolhaPc)
    print("...")
    
    if escolhaPc == "pedra" and escolhaUsuario == "papel":
        print("Ganhou, papel cobre pedra")
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura corta papel")
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra":
        print("Ganhou, pedra amassa tesoura")
    elif escolhaPc == "pedra" and escolhaUsuario == "lagarto":
        print("Ganhou, papel refuta spock")
    elif escolhaPc == "papel" and escolhaUsuario == "spock":
        print("Ganhou, lagarto come papel")
    elif escolhaPc == "lagarto" and escolhaUsuario == "papel":
        print("Ganhou, tesoura decapita lagarto")
    elif escolhaPc == "tesoura" and escolhaUsuario == "lagarto":
        print("Ganhou, spock vaporiza pedra")
    elif escolhaPc == "spock" and escolhaUsuario == "pedra":
        print("Ganhou, lagarto envenena spock")
    elif escolhaPc == "lagarto" and escolhaUsuario == "spock":
        print("Ganhou, spock quebra tesoura")
    elif escolhaPc == "spock" and escolhaUsuario == "tesoura":
        print("Ganhou, spock quebra tesoura")


    if escolhaUsuario == "pedra" and escolhaPc == "papel":
        print("Perdeu, papel cobre pedra")
    elif escolhaUsuario == "papel" and escolhaPc == "tesoura":
        print("Perdeu, tesoura corta papel")
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra":
        print("Perdeu, pedra amassa tesoura")
    elif escolhaUsuario == "pedra" and escolhaPc == "lagarto":
        print("Perdeu, pedra esmaga lagarto")
    elif escolhaUsuario == "papel" and escolhaPc == "spock":
        print("Perdeu, pedra refuta spock")
    elif escolhaUsuario == "lagarto" and escolhaPc == "papel":
        print("Perdeu,lagarto come papel")
    elif escolhaUsuario == "tesoura" and escolhaPc == "lagarto":
        print("Perdeu, tesoura decapita lagarto")
    elif escolhaUsuario == "spock" and escolhaPc == "pedra":
        print("Perdeu,spock vaporiza pedra")
    elif escolhaUsuario == "lagarto" and escolhaPc == "spock":
        print("Perdeu, lagarto envenena spock")
    elif escolhaUsuario == "spock" and escolhaPc == "tesoura":
        print("Perdeu, spock quebra tesoura")
    
    elif escolhaPc == escolhaUsuario:
        print("Empate")
    again = input("Jogar novamente? s/n: ")
    if 's' in again:
        continue
    elif 'n' in again:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")