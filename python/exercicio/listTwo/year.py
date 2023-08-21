# Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

year = int(input("Digite o ano de seu nascimento é descubra se o ano que você nasceu é bissexto "))

if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
    print(f"{year} É um ano bissexto")
else:
    print(f"{year} não é um ano bissexto")