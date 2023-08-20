# Faça um Programa que leia três números e mostre-os em ordem decrescente.

numeros = [int(input("Digite o primeiro número: ")),
            int(input("Digite o segundo número: ")),
            int(input("Digite o terceiro número: "))]

# Ordenar os números em ordem decrescente
numeros.sort(reverse = True)

print("Números em ordem decrescente:", numeros[0], numeros[1], numeros[2])

