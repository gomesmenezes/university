""" Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2-Segunda, etc.), se digitar outro valor deve
aparecer valor inválido. """

day = int(input("Digite um número para corresponder o dia da semana: "))
if day == 1:
    print("Domingo")
elif day == 2:
    print("Segunda")
else: 
    print("Valor invalido")