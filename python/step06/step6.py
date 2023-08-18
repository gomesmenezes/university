
# if And = Precisam os dois serem "true" os dois valores devem bater
idade = 18

if idade >= 18 and idade < 65: # os dois valores estão certo OK
  print('Entrou no if')

# OR um dos valores devem ser true para o programa seguir
idade1 = 66

if idade1 >= 18 or idade1 < 65:   # o valor > 18 é verdadeiro por isso apareceu no terminal
  print('Entrou no if')

  #PESSOAS COM MAIS DE 28 ANOS MENORES DE 40
  # OU PESSOAS COM SALARIO ACIMA DE 20 MIL REAIS

bankage = 28
salario = 200

if (bankage >= 28 and bankage <=40) or salario >= 2000:
  print('Bem vindo ao banco! ')


