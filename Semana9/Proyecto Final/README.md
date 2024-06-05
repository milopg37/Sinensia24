# Proyecto Final de Microservicios en Java ☕

## Descripción del Proyecto 📑

Este proyecto consiste en tres microservicios desarrollados en Java utilizando Spring Boot y JPA.
Los microservicios están diseñados para trabajar de manera conjunta, proporcionando una solución escalable y mantenible para una agencia de viajes.

## Arquitectura 🛠️

El proyecto se compone de los siguientes microservicios:

1. **Microservicio Hotel**
2. **Microservicio Vuelo**
3. **Microservicio Reserva**
4. **Base de Datos: agenciaviajes -> Tablas: hoteles, vuelos, reservas**

Cada microservicio se comunica entre sí a través de RESTful APIs y utiliza una base de datos MySQL.

4. Configura la base de datos en el archivo `application.properties` de cada microservicio.
5. Para generar la base de datos y realizar los inserts para tener datos de prueba con los que jugar:
  
   comprobar el archivo `resources -> scriptsSQL`

### Configuración de la Base de Datos ⚙️

Para cada microservicio, actualiza el archivo `application.properties` con la siguiente configuración:

```properties
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.url=jdbc:mysql://localhost:3306/agenciaviajes
  spring.datasource.username=root
  spring.datasource.password=root
```
Añade `spring.application.name` y `server.port` según el microservicio:

  Hotel: `spring.application.name=Microservicio-Hotel`, `server.port=8080`
  
  Vuelo: `spring.application.name=Microservicio-Vuelo`, `server.port=9090`
  
  Reserva: `spring.application.name=Microservicio-Reserva`, `server.port=7070`

6. ## USO 🧐
 Los microservicios estarán disponibles en las siguientes rutas:

    Microservicio Hotel:
      `http://localhost:8080`
    Microservicio Vuelo:
      `http://localhost:9090`
    Microservicio Reserva:
      `http://localhost:7070`

7.  ## Endpoints de la API 🧫
Microservicio Hotel:
```
    GET /hotel/{idHotel}: Busca un hotel dado su ID y devuelve todos sus datos.
    GET /hotel/listar: Devuelve lista de todos los hoteles disponibles.
    DELETE /hotel/delete/{idHotel}: Borra un hotel dado por ID y devuelve lista actualizada.
    PUT /hotel/edit/{idHotel}/{nuevoPrecio}: Modifica el precio de un hotel dado su ID y devuelve la lista actualizada.
    POST /hotel/nuevo: Agrega un nuevo hotel a la BD y devuelve lista actualizada.
    GET /hotel/buscar/{nombreBuscar}: Devuelve los datos de un hotel dado su nombre.
```
Microservicio Vuelo:
```
    GET /vuelo/find/{idVuelo}: Busca un vuelo por ID y lo devuelve.
    PUT /vuelo/update/{idVuelo}/{nuevoMaxPlazas}: Actualiza la capacidad máxima de plazas de un vuelo y devuelve lista actualizada.
    DELETE /vuelo/delete/{idVuelo}: Borra un vuelo dado su ID y devuelve lista actualizada.
    POST /vuelo/nuevo: Agrega un nuevo vuelo a la BD y devuelve lista actualizada.
    GET /vuelo/check/{plazasSolicitadas}: Comprueba que vuelos tienen el número de plazas solicitadas y devuelve una lista de los que cumplen esa condición.
    PUT /vuelo/reserva/{idVuelo}/{plazasAReservar}: Reserva el número de plazas solicitadas para un vuelo dado su ID.
```
Microservicio Reserva:
```
    GET /reserva/listar: Devuelve una lista con todas las reservas.
    GET /reserva/find/{idReserva}: Busca una reserva dado su ID y la devuelve.
    POST /reserva/nuevo: Agrega una nueva reserva a la BD y devuelve lista actualizada.
    PUT /reserva/update/{idReserva}/{nuevoCliente}: Actualiza el nombre del cliente para una reserva dada su ID y devuelve lista actualizada.
    DELETE /reserva/delete/{idReserva}: Borra una reserva dado su ID y devuelve lista actualizada.
    GET /reserva/reservaByHotel/{hotelABuscar}: Llama al controlador de Hotel mediante un GET y devuelve las reservas existentes para el nombre del hotel dado.
    POST /reserva/reservaByVuelo/{totalPersonas}: Llama al controlador de Vuelo mediante un POST para crear una reserva por vuelo comprobando si quedan plazas y si     es así las reserva y registra la nueva reserva en la BD.
```
8. ## Tecnologías Utilizadas 🧪
  - Java
  - Spring Boot
  - JPA (Hibernate)
  - MySQL
  - Maven
  - RestTemplate
    
9. ## Contacto ✉️
  Si tienes alguna pregunta o comentario sobre este proyecto, no dudes en contactarme:

  💻 Email: camilo.perezg@viewnext.com
  🗃️ GitHub: https://www.github.com/milopg37
