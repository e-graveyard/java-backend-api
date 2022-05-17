FROM maven:3.8.5-openjdk-11-slim AS maven
FROM jboss/wildfly:25.0.0.Final AS wildfly


FROM maven AS dependencies
WORKDIR /backend
COPY pom.xml .
RUN mvn verify --fail-never


FROM dependencies AS build
WORKDIR /backend
COPY src src
RUN mvn package


FROM wildfly AS start
COPY --from=build /backend/target/jax-rs-service-1.0.0.war /opt/jboss/wildfly/standalone/deployments/backend.war
