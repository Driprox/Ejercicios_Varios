# Funcion con lista yield
def lista(numero):
    a = 0
    b = 1
    for i in range(numero):
        a += b
        b += a
        yield a, b


for numero in lista(10):
    print(next(numero))
