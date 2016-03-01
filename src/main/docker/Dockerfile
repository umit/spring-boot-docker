FROM java:8
VOLUME /tmp
ADD spring-boot-docker-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
RUN bash -c 'touch /spring-boot-docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-docker.jar"]