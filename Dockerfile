FROM openjdk:13-jdk-alpine
VOLUME /tmp
COPY target/*.jar mentorapp-serviceregistry.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/mentorapp-serviceregistry.jar"]