# Faça um Programa que peça uma data no formato dd/mm/aaaae determine se a mesma é uma data válida.

from datetime import datetime

date = input("Digte a data do dia de hoje no formato dd/mm/aaaa: ")

def valid_date(date_f, format):
    try:
        datetime.strptime(date_f, format)
        return True
    except ValueError:
        return False

if valid_date(date, "%d/%m/%Y"):
    print(f"A data {date} é valida.")
else:
    print(f"A data {date} é invalida.")