# JavaFX Maven Project

Example Maven Project for a JavaFX Application.

**The application is no longer a modular application so there are no problems with dependencies that are not providing a
module-info.**

This projects includes multiple plugins:
- Static code analysis with PMD and Spotbugs
- Check of dependency updates during build
- Build of an App-Image using JPackage
- JavaFX plugin to start application

**Important** All commands following should be issued in the root directoy of the project (the directory where you find the pom.xml)

*Quick Start*

- Simply download a zip file of this project and unzip it somewhere on your computer
- open the opm.xml and change the settings at the start of the document to fit with your project


*How to use this project*

**build the application**

To build the application, maven / the maven wrapper can be used. Simply do a
```./mvnw package```
to build the application.
(simply call mvnw instead of ./mvnw on windows!)

**Clean up**

To clean up the project, call
```./mvnw package```

**Start the application from commandline**
```./mvnw javafx:run```

**Build the Image**
To build the image, the profile Image must be used:
```./mvnw -DImage install```

**Important** You cannoz build an image using the javafx plugin. The javafx plugin would require that you build a modular
Java application and all dependencies providing a module description.

**Static code analysis**
The static code analysis is done when you build the application. The results can be found in
- ./target/pmx.xml
- ./target/spotbugsXml.xml
