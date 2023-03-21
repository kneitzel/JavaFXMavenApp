# JavaFX Maven Project

Example Maven Project for a JavaFX Application.

This projects includes multiple plugins:
- Static code analysis with PMD and Spotbugs
- Check of dependency updates during build
- Build of an App-Image using JPackage

The application is no longer a modular application so there are no problems with dependencies that are not providing a 
module-info.

** Build the Image **
To build the image, the profile Image must be used:
```./mvnw -DImage install```
