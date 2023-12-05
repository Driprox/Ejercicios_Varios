import ejercicio_I_u8

# Prueba de paquetes
respuesta = "s"
while respuesta == "s":
    numeros = ejercicio_I_u8.genererarNumero()
    ejercicio_I_u8.mostrar(numeros)
    ordenados = ejercicio_I_u8.ordenar(numeros)
    ejercicio_I_u8.mostrar(ordenados)
    respuesta = input("Quieres volver a repetir lla lista s/n ")
print("Se acabo el generar una lista")
