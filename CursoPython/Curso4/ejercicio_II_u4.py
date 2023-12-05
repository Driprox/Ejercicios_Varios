# App fechas
listmes = [
    "enero",
    "febrero",
    "marzo",
    "abril",
    "mayo",
    "junio",
    "julio",
    "agosto",
    "septiembre",
    "octubre",
    "noviembre",
    "diciembre",
]

fecha = input("Dime tu decha de cumpleaños dd/mm/aaaa ")
fechaModificada = fecha.split("/")
mes = listmes[int(fechaModificada[1]) - 1]
print(f"Naciste el {fechaModificada[0]} de {mes} de {fechaModificada[2]}")
