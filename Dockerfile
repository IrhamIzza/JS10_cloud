FROM openjdk:8-jdk-alpine
MAINTAINER irhamizzasyany <1941720129@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY tugas.java /java

#compile file java 
RUN javac tugas.java

#running java
ENTRYPOINT java tugas
