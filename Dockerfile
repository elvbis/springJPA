FROM openjdk:11-jdk-alpine
MAINTAINER pe.com
COPY target/springJPA-0.0.1-SNAPSHOT.jar /opt/message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]