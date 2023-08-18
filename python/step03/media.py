print ("================= MEDIA ESCOLAR ===================")
assessment1 = float(input('Digite sua primeira nota: '))
assessment2 = float(input('Digite sua segunda nota: '))
assessment3 = float(input('Digite sua terceira nota: '))

media = (assessment1 + assessment2 + assessment3) / 3
mediaround = round(media, 2)

if mediaround >= 7 :
      print("Parábens você esta aprovado com média ", mediaround)
elif mediaround >=5 <=7:
  print("Você esta em recuperação estude mais, sua media foi", mediaround)
else: 
  print("Você esta reprovado! com media: ", mediaround) 
