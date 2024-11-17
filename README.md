Challenge-Literatura 📚
Challenge-Literatura es una aplicación desarrollada en Java con Spring Boot que permite interactuar con libros y autores. La aplicación consume datos desde la API
de Gutendex para gestionar un catálogo de libros y autores en una base de datos PostgreSQL. Además, cuenta con un menú interactivo que ofrece diversas funcionalidades para los usuarios.

Características 🚀
Buscar libros por título desde la API: Permite buscar un libro específico en la API de Gutendex y registrarlo en la base de datos.
Listar libros registrados: Muestra todos los libros almacenados en la base de datos.
Listar autores registrados: Visualiza los autores disponibles en la base de datos.
Listar autores vivos en un año determinado: Filtra y muestra los autores que estaban vivos en un año especificado.
Listar libros por idioma: Permite ver los libros almacenados según el idioma.
Salir del programa: Finaliza la ejecución de la aplicación.
Requisitos del sistema 🛠️
Java: Versión 17 u otra compatible.
Maven: Para la gestión de dependencias.
PostgreSQL: Como base de datos.
IntelliJ IDEA (o cualquier otro IDE compatible con Java y Spring Boot).
Instalación y configuración ⚙️
Clona este repositorio:

bash
Copiar código
git clone https://github.com/tu-usuario/challenge-literatura.git
Accede al directorio del proyecto:

bash
Copiar código
cd challenge-literatura
Configura las variables de entorno en tu sistema para conectar con PostgreSQL:

DB_HOST: URL del servidor PostgreSQL.
DB_USER: Usuario de la base de datos.
DB_PASSWORD: Contraseña de la base de datos.
Asegúrate de que el archivo application.properties tenga las siguientes configuraciones:

properties
Copiar código
spring.datasource.url=jdbc:postgresql://${DB_HOST}/nombre_base_datos
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update

Ejecuta el proyecto desde tu IDE o con Maven:
mvn spring-boot:run

Uso de la aplicación 📖
Al ejecutar la aplicación, se mostrará un menú interactivo en la consola con las siguientes opciones:

Buscar libro por título: Ingresa el título del libro que deseas buscar en la API de Gutendex. Si el libro existe, será registrado en la base de datos.
Listar libros registrados: Visualiza todos los libros almacenados en tu base de datos.
Listar autores registrados: Muestra información sobre los autores almacenados.
Listar autores vivos en un año determinado: Escribe un año específico, y la aplicación mostrará los autores que estaban vivos en ese momento.
Listar libros por idioma: Ingresa el código del idioma (por ejemplo, en para inglés o es para español) para ver los libros en ese idioma.
Salir: Finaliza la ejecución del programa.
Estructura del proyecto 🗂️
El proyecto sigue una arquitectura basada en capas:

controller: Contiene los controladores para manejar las solicitudes de la API.
service: Contiene la lógica de negocio de la aplicación.
repository: Interactúa con la base de datos a través de JPA.
entity: Define las entidades (modelos) de datos.
dto: Contiene los objetos de transferencia de datos.
config: Configuración de la API y otras dependencias.
Tecnologías utilizadas 🛠️
Lenguaje: Java 17
Framework: Spring Boot 3.3.5
Base de datos: PostgreSQL
Dependencias principales:
Spring Data JPA
PostgreSQL Driver
Jakarta Persistence
API utilizada 🌐
Este proyecto utiliza la API pública de Gutendex para obtener información sobre libros. Documentación: Gutendex API.

Contribuciones 🤝
¡Las contribuciones son bienvenidas! Si deseas mejorar el proyecto, sigue estos pasos:

Haz un fork del repositorio.
Crea una rama para tu funcionalidad/bugfix:
bash
Copiar código
git checkout -b feature/nueva-funcionalidad
Realiza tus cambios y súbelos:
bash
Copiar código
git commit -m "Descripción del cambio"
git push origin feature/nueva-funcionalidad
Abre un pull request en este repositorio.
Autor ✍️
Nombre: [Julio Marines Sánchez ]
Región: México
Correo: [julio.marines92@gmail.com]
Licencia 📄
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

¡Gracias por usar Challenge-Literatura! 😊




