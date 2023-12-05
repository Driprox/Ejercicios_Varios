#Comprobacion de usuario
def comprobarCaracteres(nUsuario):
    caracteres = len(nUsuario)
    comprobarEspeciales = nUsuario.isalnum()
    if comprobarEspeciales == False:
        print("Tienes caracteres especiales,vuelve a introducirlo")
        comprobarCaracteres()
    if caracteres < 6:
        print("Es menor a 6 caracteres,vuelve a introducirlo")
        comprobarCaracteres()
    elif caracteres > 12:
        print("Es mayor a 12 caracteres,vuelve a introducirlo")
        comprobarCaracteres()
    return True, "Bien el usuario es correcto"
