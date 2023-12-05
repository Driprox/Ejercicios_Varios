class Persona:
    """
    Clase que continene los datos de persona
    """

    def __init__(self):
        self.nombre = input("Nombre: ")
        self.apellido = input("Apellido: ")
        self.edad = input("Edad: ")
        self.ocupacion = input("Ocupacion: ")

    @property
    def nombre(self):
        return self.__nombre

    @property
    def edad(self):
        return self.__edad

    @property
    def apellido(self):
        return self.__apellido

    @property
    def ocupacion(self):
        return self.__ocupacion

    @nombre.setter
    def nombre(self, nuevo):
        print("Modificando nombre..")
        self.__nombre = nuevo
        print("El nombre se ha modificado por")
        print(self.__nombre)

    @apellido.setter
    def apellido(self, nuevo):
        print("Modificando apellido..")
        self.__apellido = nuevo
        print("El apellido se ha modificado por")
        print(self.__apellido)

    @edad.setter
    def edad(self, nuevo):
        print("Modificando edad..")
        self.__edad = nuevo
        print("El edad se ha modificado por")
        print(self.__edad)

    @ocupacion.setter
    def ocupacion(self, nuevo):
        print("Modificando ocupacion..")
        self.__ocupacion = nuevo
        print("El nombre se ha modificado por")
        print(self.__ocupacion)

    def __str__(self):
        return (
            "("
            + (self.nombre)
            + ","
            + (self.apellido)
            + ","
            + (self.edad)
            + ","
            + (self.ocupacion)
            + ")"
        )


class Trabajo:
    """Clase que contiene los datos de la empresa"""

    def __init__(self):
        self.domicilio = input("Dime el domicilio de la Empresa: ")
        self.legajo = input("Dime el legajo de la Empresa: ")
        self.cargo = input("Dime tu cargo en la Empresa: ")

    @property
    def domicilio(self):
        return self.__domicilio

    @property
    def legajo(self):
        return self.__legajo

    @property
    def cargo(self):
        return self.__cargo

    @domicilio.setter
    def domicilio(self, nuevo):
        print("Modificando domicilio..")
        self.__domicilio = nuevo
        print("El domicilio se ha modificado por")
        print(self.__domicilio)

    @legajo.setter
    def legajo(self, nuevo):
        print("Modificando legajo..")
        self.__legajo = nuevo
        print("El legajo se ha modificado por")
        print(self.__legajo)

    @cargo.setter
    def cargo(self, nuevo):
        print("Modificando cargo..")
        self.__cargo = nuevo
        print("El cargo se ha modificado por")
        print(self.__cargo)

    def __str__(self):
        return "(" + (self.domicilio) + "," + (self.cargo) + "," + (self.legajo) + ")"


class Empleado(Persona, Trabajo):
    """Clase que hereda de los dos padres"""

    def __init__(self):
        super().__init__()
        Trabajo().__init__()
        self.departamento = input("Dime que departamento tiene: ")
        self.empleados = input("Dime que empleados tiene: ")

    @property
    def departamento(self):
        return self.__departamento

    @property
    def empleados(self):
        return self.__empleados

    @departamento.setter
    def departamento(self, nuevo):
        print("Modificando departamento..")
        self.__departamento = nuevo
        print("El departamento se ha modificado por")
        print(self.__departamento)

    @empleados.setter
    def empleados(self, nuevo):
        print("Modificando empleados..")
        self.__empleados = nuevo
        print("El empleado se ha modificado por")
        print(self.__empleados)

    def __str__(self):
        return f"({Trabajo().__str__()})({Persona().__str__()})({self.departamento}),({self.empleados})"


empleados1 = Empleado()
empleados2 = Empleado()
empleados3 = Empleado()
empleados4 = Empleado()
empleados5 = Empleado()

print(empleados1, empleados2, empleados3, empleados4, empleados5)
