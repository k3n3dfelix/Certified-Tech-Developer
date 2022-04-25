#If/Else
idade = 17
socio = True

print("__________________Verificação com IF/Else_________________")
if idade > 18:
    print("pode entrar no bar")
elif idade == 18 and socio == True:
    print("pode entrar")
else:
    print("Não pode entrar no bar")

#for
print("________________________For_________________________")
for i in range(1,11):
    print(i)

lista_alunos = ['Kened', 'Thaisa', 'Juliana']

for aluno in lista_alunos:
    print(aluno)