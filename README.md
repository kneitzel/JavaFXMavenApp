# JavaFX Maven Project

Example Maven Project for a JavaFX Application.

**Update**: Java 21 is now fully supported

This projects includes multiple plugins:
- Build of an App-Image using JPackage
- Use of Maven Wrapper
- Static code analysis with PMD and Spotbugs
- Check of dependency updates during build
- JavaFX plugin to start application

**Requirements**
To use this Template, all you need is a local Java Installation. My current advice is to use a long term supported (LTS) version of either Java 17 or Java 21.

**Important** All commands following should be issued in the root directoy of the project (the directory where you find the pom.xml)

*Quick Start*

- Simply download a zip file of this project and unzip it somewhere on your computer
- open the pom.xml and change the settings at the start of the document to fit with your project


*How to use this project*

**Start the application from commandline**
```./mvnw javafx:run```

**Clean up**

To clean up the project, call
```./mvnw clean```

**build the application (Without building the application image) **

To build the application, maven / the maven wrapper can be used. Simply do a
```./mvnw package```
to build the application.
(simply call mvnw instead of ./mvnw on windows!)

**Build the Image**

To build the image, the profile Image must be used:
```./mvnw -DImage install```

**Important** You cannot build an image using the javafx plugin. The javafx plugin requires that you build a modular
Java application and all dependencies providing a module description.

**Static code analysis results**

The static code analysis is done during the build of the application. The results can be found in
- ./target/pmd.xml
- ./target/spotbugsXml.xml
