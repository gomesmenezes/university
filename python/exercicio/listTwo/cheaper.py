# Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo
# mais barato.

supermarketOne = float(input("Quanto custa o desodorante no mercado um? "))
supermarketTwo = float(input("Quanto custa o desodorante no mercado dois? "))
supermarketThree = float(input("Quanto custa o desodorante no mercado três? "))

lowerprice = None
market = None

if supermarketOne <= supermarketTwo and supermarketOne <= supermarketThree:
    lowerprice = supermarketOne
    market = "Mercado um"
elif supermarketTwo <= supermarketOne and supermarketTwo <= supermarketThree:
    lowerprice = supermarketTwo
    market = "Mercado dois"
else:
    lowerprice = supermarketThree
    market = "Mercado três"

print(f"O menor preço foi encontrado no {market}: {lowerprice}")
