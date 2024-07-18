# Utilisez l'image de base de Java
FROM openjdk:17-jdk-slim

# Créez un répertoire pour l'application
WORKDIR /app

# Copiez le fichier JAR de l'application dans le conteneur
COPY target/config-server-0.0.1-SNAPSHOT.jar /app/config-server.jar

# Exposez le port sur lequel l'application s'exécute
EXPOSE 8888

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app/config-server.jar"]
