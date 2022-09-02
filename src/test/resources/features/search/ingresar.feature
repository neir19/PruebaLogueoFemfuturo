#language: es
  Característica:  Ingresar a la pagina y loguearse

  Antecedentes:
    Dado El usuario abra la pagina

  @login
  Escenario: El usuario se logue correctamente
    Cuando  el usuario ingrese sus datos
    Entonces  deberia ver el subitulo
