from Persona2 import Persona2 #si queremos importar todo, solo ponemos un *

print('Creacion de Objetos'.center(50, '-'))
if __name__ == '__main__': ##comprobacion del metodo principal Es para ver de que parte del codigo se esta ejecutando
    persona5 = Persona2('Lionel', 'Messi', 35)
    persona5.mostrar_detalle()


    print(__name__)
##Destructor de objetos
print('Eliminacion de Objetos'.center(50, '-'))
del persona5 #No se ve normalmente, dado que esta el consepto de recolector de basura en python
