timecash = float(input("Quanto você ganha por hora trabalhada: "))
workhours = int(input("Quantas horas você trabalhou nesse mês: "))

salary = timecash * workhours

# Salário bruto
print(f"- Seu salario antes dos impostos: R${salary:.2f}")

# IR (11%)
ir_rate = 0.11
ir = salary * ir_rate
print(f"- IR (11%): R${ir:.2f}")

# INSS (8%)
inss_rate = 0.08
inss = salary * inss_rate
print(f"- INSS (8%): R${inss:.2f}")

# Sindicato (5%)
sindicato_rate = 0.05
sindicato = salary * sindicato_rate
print(f"- Sindicato (5%): R${sindicato:.2f}")

# Salário líquido
salario_liquido = salary - (ir + inss + sindicato)
print(f"Seu salario liquido (pós impostos): R${salario_liquido:.2f}")
