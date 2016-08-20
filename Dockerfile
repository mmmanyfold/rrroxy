FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/rrroxy.jar /rrroxy/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/rrroxy/app.jar"]
