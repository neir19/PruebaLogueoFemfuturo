#language: es
Característica:  Ingresar a la pagina y se desloguea

  Antecedentes:
    Dado El usuario abra la pagina

  @desloguearse
  Escenario: El usuario se logue correctamente
    Cuando  el usuario ingrese sus datos
    Entonces  deberia poder desloguearse
