# Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F -Feminino, M -Masculino, Sexo Inválido

gender = input("Gênero (M ou F): ")

if gender.upper() == "F":
    print("Feminino")
elif gender.upper() == "M":
    print("Masculino")
else:
    print("Gênero inválido")

