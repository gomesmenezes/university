# Faça um Programa que leia três números e mostre o maior deles

numberOne = float(input("Digite o primeiro número: "))
numberTwo = float(input("Digite o segundo número: "))
numberTree = float(input("Digite o terceiro número: "))

if numberOne >= numberTwo and numberOne >= numberTree:
    maior_numero = numberOne
elif numberTwo >= numberOne and numberTwo >= numberTree:
    maior_numero = numberTwo
else:
    maior_numero = numberTree


print(f"O maior número é: {maior_numero}")
