FROM maven:latest
WORKDIR /org.example.App
COPY pom.xml /org.example.App
RUN mvn dependency:go-offline
COPY . /org.example.App/
RUN mvn package
CMD ["java", "-jar", "target/fartoceldocker.jar"]
