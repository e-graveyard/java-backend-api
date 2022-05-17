FROM jboss/wildfly

COPY target/jax-rs-service-1.0.0.war /opt/jboss/wildfly/standalone/deployments/backend.war
