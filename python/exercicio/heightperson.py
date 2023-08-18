gender = input("Você é homem ou mulher: ")[:6].lower().strip()  # Pega os primeiros 6 caracteres, converte para minúsculas e remove espaços extras

height = float(input("Digite sua altura: "))

if gender == "homem":
    weight = (72.7 * height) - 58
    print(f"Seu peso ideal é: {weight:.2f}")
elif gender == "mulher":
    weight = (62.1 * height) - 44.7
    print(f"Seu peso ideal é: {weight:.2f}")
else:
    print("Valor indefinido")
