FROM java:8
VOLUME /tmp
ADD spring-boot-docker-*.jar spring-boot-docker.jar
RUN bash -c 'touch /spring-boot-docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-docker.jar"]