FROM eclipse-temurin:17
COPY target/dauto.jar dauto.jar
CMD ["java","-jar","dauto.jar"]