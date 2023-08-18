# How to round numbers
salary = 45800.00000

salary = round(salary, 3)

print("O seu sálario é ", salary)


# Mathematics Operetions


number1 = float(input("Write first number for mathematics calculations: "))
number2 = float(input("Write second number for mathematics calculatio: "))

print("================= Operações ===============")

sum = number1 + number2
print("Soma: ", sum)

print("================================================")

subtraction = number1 - number2
print("Subtração: ", subtraction)

print ("================================================")

multiplication = number1 * number2
print("Multiplicação: ", multiplication) 

print ("================================================")

division = number1 / number2
print("Divisão: ", division)

print ("================================================")

module = number1 % number2
print("Resto: ", module)

print ("================================================")

power = number1 ** number2
print("Pôtencia: ", power)

print ("================= FIM ===================")


# Type Conversion
# String + String (Contanation)


name = 'José'
lastname = 'Gomes'

print ("================= Type Conversion ===================")
namecomplete = name + ' ' + lastname
print(namecomplete)

name1 = 'José'
age = 18
print ("================= NAME + AGE ===================")
namesumage = name1 + ' ' + str(age)
print(namesumage)

print ("================= TAMANHO LEN ===================")
name2 = 'José Gomes de Menezes'

size = len(name2)
print(size)

print ("================= Maiuscula ===================")
name2 = 'José Gomes de Menezes'

upper = name2.upper()
print(upper)

print ("================= Minuscula ===================")
name2 = 'José Gomes de Menezes'

lower = name2.lower()
print(lower)

print ("================= First Word Maiscula ===================")
name2 = 'José Gomes de Menezes'

capitalize = name2.capitalize()
print(capitalize)

