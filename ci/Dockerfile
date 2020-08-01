FROM tomcat:latest

ENV HELLO_MESSAGE "Welcome to EDDYTNK.COM"
ENV SPRING_PROFILES_ACTIVE prod
ADD hello-world.war $CATALINA_HOME/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]
