altura = float(input("Digite a sua altura: "))
peso = float(input("Digite o seu peso: "))

imc = peso / (altura * altura)
imcround = round(imc, 2)

if imcround < 18.5:
    print(f"Seu imc esta {imcround}. Então Abaixo do peso")
elif imcround >= 18.6 and imcround <= 24.9:
    print(f"Seu imc esta {imcround} Peso ideal (Parábens!)")
elif imcround >= 25.0 and imcround <= 29.9:
    print(f"Seu imc esta {imcround}. Então Levemente acima do peso")
elif imcround >= 30.0 and imcround <= 34.9:
    print(f"Seu imc esta {imcround}. Então Obesidade grau 1")
elif imcround >= 35.0 and imcround <= 39.9:
    print(f"Seu imc esta {imcround}. Então Obesidade grau 2(severa)")
elif imcround >= 40.0:
    print(f"Seu imc esta {imcround}. Então Obesidade grau 3")
else:
    print("Número invalido")