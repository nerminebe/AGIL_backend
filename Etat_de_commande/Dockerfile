# Utilisez une image de base Java
FROM openjdk:17-jdk-slim

# Définissez le répertoire de travail dans le conteneur
WORKDIR /app

# Copiez le fichier JAR de l'application dans le conteneur
COPY target/Etat_de_commande-0.0.1-SNAPSHOT.jar /app/Etat_de_commande.jar

# Exposez le port sur lequel l'application s'exécute
EXPOSE 8082

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app/Etat_de_commande.jar"]
