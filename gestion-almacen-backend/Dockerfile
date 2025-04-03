# Usa una imagen de Maven con OpenJDK
FROM maven:3.8-openjdk-17-slim

# Crea un directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR generado por Spring Boot
COPY ./gestion-almacen-backend/target/gestion-0.0.1-SNAPSHOT.jar /app/app.jar

# Expone el puerto 8080 para la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "/app/target/app.jar"]
