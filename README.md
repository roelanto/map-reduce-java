# Map Reduce oefening in Java

Zie https://hackmd.io/@roelanto-hu/rJYrGLO8c voor meer informatie over deze code.

## Code draaien met behulp van Maven
De volgende commando's gebruiken Maven om de code te compileren, uit te voeren, en unit tests uit te voeren.


```
mvn package
mvn exec:java
mvn test
```

Als Maven klaagt dat er geen JDK gevonden kan worden, zet dan Environment Variable JAVA_HOME zodat die verwijst naar het pad van je JDK.

Op mijn Mac is dat bijvoorbeeld `export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/`.

## Code draaien via IntelliJ
IntelliJ kan het project rechtstreeks importeren als je de `pom.xml` opent als project. 

## Code draaien via de command-line

```
mvn package
java -cp target/mapreduce-app-1.0-SNAPSHOT.jar nl.hu.bdsd.App
```


