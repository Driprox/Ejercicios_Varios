class Cuenta:
    """
    Clase que calcula una cuenta con ineters y subclases
    """

    def __init__(self):
        self.nombre = input("Dime tu nombre: ")
        self.saldo = float(input("Cuanto quieres ingresar: "))

    def mostrarCuenta(self):
        print(f"Titular de la cuenta: {self.nombre}")
        print(f"Saldo en la cuenta: {self.saldo}")


class PlazoFijo(Cuenta):
    def __init__(self):
        super().__init__()
        self.interes = float(input(f"Dime el porcentaje de interes plazo: "))
        self.plazo = int(input(f"Dime a cuantos años: "))

    def importeInteres(self):
        self.total = (self.saldo * self.interes / 100) * self.plazo
        print(f"la ganacia es de: {self.total} a {self.plazo} años")

    def mostrarCuentaTotal(self):
        print(f"Titular de la cuenta: {self.nombre}")
        print(f"El interes es a: {self.interes}")
        print(f"El precio del interes es a: {self.total} a {self.plazo} años")


class CajaAhorro(Cuenta):
    def __init__(self):
        super().__init__()

    def mostrarCuentaAhorro(self):
        print(f"Titular de la cuenta: {self.nombre}")
        print(f"Saldo en la cuenta: {self.saldo}")


cuenta = PlazoFijo()
cuenta.importeInteres()
cuenta.mostrarCuentaTotal()
