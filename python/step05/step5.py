note1 = float(input("Digite sua primeira nota: "))
note2 = float(input("Digite sua segunda nota: "))
avarege = (note1 + note2) / 2

if avarege < 7:
    print("Infelizmente você está reprovado, estude mais!")
elif avarege >= 7 and avarege < 10:
    print(f"Aprovado com {avarege:.2f}")
else: 
    print("Aprovado com distinção!")