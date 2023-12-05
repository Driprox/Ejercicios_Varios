# Progrmaa de lambada
numero = [[34, 345, 23, 54], [24, 49, 11, 3], [32, 13, 45, 12], [34, 5, 87, 23]]
lista2 = list(map((lambda lista: (sum(lista) / len(lista))), numero))
print(lista2)
