# App lectura archivo
archivo = open(
    "C:\\Users\\0020654\\Desktop\\Archivos\\CursoPython\\Curso10\\equipo.txt", "r"
)
lineas = archivo.readlines()

lista = []

for linea in lineas:
    campos = linea.split(";")
    diccionario = {}
    diccionario["id"] = campos[0]
    diccionario["nombre"] = campos[1]
    diccionario["apellido"] = campos[2]
    diccionario["nacimineto"] = campos[3]

    lista.append(diccionario)

for diccionario in lista:
    print(diccionario)
