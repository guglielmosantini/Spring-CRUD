FROM amazoncorretto:8
RUN mkdir -p /helloworld/bin
COPY target/SpringCRUD-0.0.1-SNAPSHOT.jar /helloworld/bin
WORKDIR /helloworld/bin
ENTRYPOINT [ "java", "-jar","SpringCRUD-0.0.1-SNAPSHOT.jar" ]
