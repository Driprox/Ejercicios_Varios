#App de lista
listaOriginal = ["Manolo Perez", "Alfonso Carrasco", "Lucia Garcia", "Maria Moreno"]
listaNueva = []
for nombre in listaOriginal:
    nombreUsuario = nombre.replace(" ", "_")
    nombreUsuario = nombreUsuario.lower()
    listaNueva.append(nombreUsuario)

print("La lista es la siguiente:\n", listaNueva)
