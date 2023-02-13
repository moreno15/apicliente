# Crear base de datos dbconsulting 

# configuracion de alication.properties  

# la tabla cliente se crea al compilar el backend
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=dbconsulting;Trusted_Connection=True

spring.datasource.username=sa
spring.datasource.password=1234
spring.jpa.show-sql=true

spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.SQLServerDialect

spring.jpa.hibernate.ddl-auto=update
