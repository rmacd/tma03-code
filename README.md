## to run

```
mvn clean package
## make sure docker sql instance is running, then:
java -jar target/tma03.jar
```

By default this server will run on port 8083
(configurable in `application.properties`).

## docker info

Docker compose is included; to run, you can just execute:

```
docker-compose -f docker-compose.yml up
```

This will set up a MySQL instance exposed on 33062. Credentials
are included in the `01-pass.sql` file.