#!C:\Users\pedro\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Python 3.12
# -*-coding:utf-8-*-
"""
Modulo que ejecuta las areas de triangulo,rectangulo y circulo

"""
__author__ = "Pedro"
__version__ = "1.0"


def areaRectangulo(base, altura):
    """Realiza el area de un rectangulo"""
    return base * altura


def areaTriangulo(base, altura):
    """Realiza el area de un triangulo"""
    return (base * altura) / 2


def areaCirculo(radio):
    """Realiza el area de un circulo"""
    return 3.14 * radio**2


if __name__ == "__main__":
    print("Se ejecuta como programa principal")
