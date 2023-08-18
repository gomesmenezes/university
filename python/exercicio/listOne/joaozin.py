# Lê o peso de peixes informado pelo usuário
peso = float(input("Informe o peso de peixes em quilos: "))

# Define o limite de peso estabelecido pelo regulamento
limite_peso = 50.0

# Calcula o excesso de peso, se houver
if peso > limite_peso:
    excesso = peso - limite_peso
    multa_por_quilo = 4.00
    multa = excesso * multa_por_quilo
else:
    excesso = 0
    multa = 0

# Imprime os resultados
print(f"Peso de peixes: {peso:.2f} kg")
print(f"Limite de peso: {limite_peso} kg")

if excesso > 0:
    print(f"Excesso de peso: {excesso:.2f} kg")
    print(f"Multa a ser paga: R$ {multa:.2f}")
else:
    print("Não houve excesso de peso. Sem multa a pagar.")
