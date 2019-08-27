FROM maven:latest as base
WORKDIR /build
COPY . .
RUN mvn clean package
FROM java:8
WORKDIR /opt/app
COPY --from=base /build/target/search-0.0.1-SNAPSHOT.jar search.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "search.jar"]