FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/hr-api-gateaway-zuul-0.0.1-SNAPSHOT.jar hr-api-gateaway-zuul.jar
ENTRYPOINT ["java", "-jar", "/hr-api-gateaway-zuul.jar"]