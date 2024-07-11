# Utilisez l'image de base de Java
FROM openjdk:17-jdk-slim

# Créez un répertoire pour l'application
WORKDIR /app

# Copiez le fichier JAR de l'application dans le conteneur
COPY target/eureka-server.jar /app/eureka-server.jar

# Exposez le port sur lequel l'application s'exécute
EXPOSE 8761

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app/eureka-server.jar"]
