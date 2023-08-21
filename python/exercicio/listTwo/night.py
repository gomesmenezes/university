""" Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutinoou V-Vespertinoou N-Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso."""

turno = input('Digite o turno, M para matutino, v para vespertino e n para noturnto: ')

if turno.upper() == 'M':
    print("Bom dia")
elif turno.upper() == 'N':
    print("Boa noite")
elif turno.upper() == 'V':
    print("Boa tarde")
else:
    print("Informação invalida")