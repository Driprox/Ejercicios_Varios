# Prueba de excepciones
try:
    lisa = ["b", 5, "c"]
    print(lisa[10])
except:
    print("Los lista no tinene el tamaño deseado")

try:
    colores = {"rojo": "verde", "amarillo": "blanco"}
    print(colores["azul"])
except:
    print("El color buscado no existe")
