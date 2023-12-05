"""
Realizo un script en el que ejecuto las tres formas de llamar a un modulo
"""
import ejercicio_III_u8_areas

areaTriangulo = ejercicio_III_u8_areas.areaTriangulo
from ejercicio_III_u8_areas import areaCirculo

print("El rectangulo tiene de area: ", ejercicio_III_u8_areas.areaRectangulo(5, 9))
print("El triangulo tiene de area: ", areaTriangulo(5, 13))
print("El circuo tiene de area: ", areaCirculo(5))
