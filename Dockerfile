FROM quay.io/keycloak/keycloak:26.0.5

COPY ./target/keycloak-spi-jar-with-dependencies.jar /opt/keycloak/providers/keycloak-spi.jar
COPY ./entrypoint.sh /entrypoint.sh

ENTRYPOINT [ "/entrypoint.sh" ]
