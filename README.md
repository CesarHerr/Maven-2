# Maven-2

mvn archetype:generate -DgroupId=com.equipo.taskmaster -DartifactId=taskmaster
-DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

cd taskmaster

- Se actualiza App.java

- se actualiza pom.xml

- se actualiza AppTest.java 


mvn test (en este punto se cambia junit para evitar error)

- Se actualiza pom.xml

mvn clean package
mvn exec:java

- Se actualiza pom.xml

mvn clean package
mvn exec:java


mvn exec:java -Pdev -Denv.name=Dev
