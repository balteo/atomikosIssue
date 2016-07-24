## How to run application:

run:

  - `./gradlew assemble`
  - `docker-compose up`
  - `java -jar build/libs/atomikosissue-0.0.1-SNAPSHOT.jar`

## Notes:

 - Because the issue is related to transactions, I chose to use Postgresql instead of a in memory database.
 - One can notice that the `person` table remains empty after the batch has run successfully!
