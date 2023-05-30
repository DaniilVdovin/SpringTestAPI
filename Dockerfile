FROM openjdk:20
LABEL authors="daniilvdovin"
COPY target/SpringTestAPI-0.0.1-SNAPSHOT.jar server-1.0.0.jar
ENTRYPOINT ["java","-jar","/server-1.0.0.jar"]