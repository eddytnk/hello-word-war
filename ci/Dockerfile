FROM tomcat:latest

ENV HELLO_MESSAGE "Welcome to EDDYTNK.COM"
ENV SPRING_PROFILES_ACTIVE prod

RUN apt-get update \
 && apt-get install -y --no-install-recommends jq \
 && rm -rf /var/lib/apt/lists/*

ADD hello-world.war $CATALINA_HOME/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]
