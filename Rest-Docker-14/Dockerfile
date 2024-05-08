FROM openjdk:23-slim-bullseye
ADD target/rets-docker.jar rets-docker.jar
ENTRYPOINT ["java", "-jar", "/tmp/rets-docker.jar"]