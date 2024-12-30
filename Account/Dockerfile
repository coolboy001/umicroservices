# statr with a base image contain Java Runtime Environment
FROM openjdk:23-jdk-slim
LABEL org.opencontainers.image.authors="anshulpathneja.com"
COPY target/Account-0.0.1-SNAPSHOT.jar account.jar
ENTRYPOINT ["java","-jar","account.jar"]
