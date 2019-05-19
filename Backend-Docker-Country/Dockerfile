FROM openjdk:8-jdk-alpine
LABEL maintainer="wilgares@gmail.com"
VOLUME /tmp
ADD target/Backend-Docker-Country-0.0.1-SNAPSHOT.jar app.jar

ADD src/main/resources/schema.sql schema.sql
ADD src/main/resources/data.sql data.sql



ENTRYPOINT ["java","-jar","app.jar"]