import math


class areaTriangulo:
    """
    Se encarga de mostrar un triangulo
    """

    def __init__(self):
        self.ladoA = int(input("Dime el lado A "))
        self.ladoB = int(input("Dime el lado B "))
        self.ladoC = int(input("Dime el lado C "))

    def tipoTriangulo(self):
        if self.ladoA == self.ladoB and self.ladoA == self.ladoC:
            print("El triangulo es equilatero")
        elif (
            self.ladoA != self.ladoB
            and self.ladoB != self.ladoC
            and self.ladoA != self.ladoC
        ):
            print("El triangulo es escaleno")
        else:
            print("El triangulo es isocele")

    def mostraLado(self):
        print(f"El lado A es de: {self.ladoA}")
        print(f"El lado B es de: {self.ladoB}")
        print(f"El lado C es de: {self.ladoC}")

    def area(self):
        semiPerimetro = self.ladoB + self.ladoA + self.ladoC / 2
        area = math.sqrt(
            semiPerimetro
            * (semiPerimetro - self.ladoA)
            * (semiPerimetro - self.ladoB)
            * (semiPerimetro - self.ladoC)
        )
        print(area)
        return area


prueba = areaTriangulo()
prueba.mostraLado()
prueba.tipoTriangulo()
prueba.area()
