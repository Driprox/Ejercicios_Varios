# App datos
nombre = input("Dime tu nombre")
direccion = input("Dime tu direccion")
telefono = input("Dime tu telefono")
edad = input("Dime tu edad")

diccionario = {"N": nombre, "D": direccion, "T": telefono, "E": edad}

print(
    f"{diccionario['N']}tiene {diccionario['E']} años, vive en {diccionario['D']} y su número de teléfono es {diccionario['T']}."
)
