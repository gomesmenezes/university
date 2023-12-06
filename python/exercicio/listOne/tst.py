print('Calculadora de IMC')

height = float(input('Digite sua altura: '))
weight = float(input('Digite seu peso: '))

average = weight / (height ** 2)

print(f'Seu IMC ideal é {average}')
