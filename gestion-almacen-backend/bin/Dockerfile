# Usa una imagen oficial de OpenJDK
FROM openjdk:17-jdk-slim

# Crea un directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR generado por Spring Boot
COPY target/gestion-0.0.1-SNAPSHOT.jar /app/gestion-0.0.1-SNAPSHOT.jar

# Expone el puerto 8080 para la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "/app/gestion-0.0.1-SNAPSHOT.jar"]