FROM java:8

# reference /tmp on the host operating system
VOLUME /tmp

# write the microservice .jar into the image
COPY ./target/EurekaServer-*.jar app.jar

# command to start the jar, 
ENTRYPOINT ["java","-jar","/app.jar"]