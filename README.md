# JavaFX Maven Project

Example Maven Project for a JavaFX Application.

Maven modules are configured so that even Images are build (including JPackage app-image).

Project includes PMD and spotbugs!


Branches shows,
- including log4j
- including slf4j
This is just for testing purpose / was requiried during threads in http://java-forum.org.

Die Versuche mit der GraalVM sind bisher nicht erfolgreich. Es wird zwar alles übersetzt,
aber es gibt Probleme, da auf Klassen über den Classloader zugegriffen werden soll.


* Aktueller Stand *

Agent Dateien können generiert werden mit:
./mvnw -PGraalVM -Dagent=true -DagentOptions=periodic-config -DskipTests -DskipNativeBuild=true package exec:exec@java-agent

Und dann kann man übersetzen mit:
./mvnw -PGraalVM -Dagent=true -DskipTests package

Start geht, aber es wird kein Fenster angezeigt...