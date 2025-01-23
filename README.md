APLICACIÓN PARA LA GESTIÓN DE SOCIEDAD GASTRONÓMICA
OBJETIVOS:
Crear una aplicación la cual se conectará a una base de datos relacional con la que se pueda gestionar una sociedad gastronómica y hacer las facturas de las comidas/cenas que los socios hagan en la sociedad.
La aplicación contará con una interfaz gráfica en la que se podrá adoptar el rol de administrador o de socio.
Código fuente cumplirá con el patrón MVC.
JAVA, HTML, CSS, JAVASCRIPT.  

    • USUARIOS:

            ▪ Administrador:

                • Gestionar socios
                    ◦ Dar de alta socios.
                    ◦ Dar de baja socios.
                    ◦ Modificar socios.

                • Gestionar productos
                    ◦ Realizar pedido.

            ▪ Socio:

                    ◦ Realizar/Anular reservas.
                    ◦ Crear Facturas de comida/cena.	

CONTEXTUALIZACIÓN
Se pretende crear una aplicación, en la que los usuarios pueden tener dos roles, administradores de la sociedad y los socios.
¿Qué podrá hacer cada uno?

Los administradores son los que en realidad gestionan la sociedad, pudiendo dar de alta, bajas, modificar datos de los socios y controlar los productos en stock y realización de pedidos.

Los socios por su parte, pueden realizar reservas y creación de las facturas de las comidas y cenas que hagan en la sociedad, añadiendo los productos y servicios consumidos en ellas.

Se organiza, en un principio con 8 tablas, dando pOr hecho que este número variará una vez se construya el modelo Entidad-Relación E/R y la transformación al modelo relacional, las tablas son:
USUARIOS, ROLES, SOCIOS, ADMINISTRADORES, RESERVAS, FACTURAS, GRUPOS, PRODUCTOS.
