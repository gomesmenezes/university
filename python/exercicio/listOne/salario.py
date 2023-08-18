timecash = float(input("Quanto você ganhar por hora trabalhada: "))
workhours = int(input("Quantas horas você trabalhou nesse mês: "))

salary = timecash * workhours

print(f"Você ganhar por hora {timecash} trabalhada e você trabalhou {workhours} horas, seu salario foi: {salary:.2f}")