# JavaFX Maven Project

Example Maven Project for a JavaFX Application.

This projects includes multiple plugins:
- Build of an App-Image using JPackage (Profile: image)
- Build of an fat jar (Profile: fatjar)
- Use of Maven Wrapper
- Static code analysis with PMD and Spotbugs
- Check of dependency updates during build
- JavaFX plugin to start application

Verified on macOS (Apple Silicon) with OpenJDK 25.0.5 and the Maven wrapper.

## Requirements

Install JDK 25 and point `JAVA_HOME` at it. Run `./mvnw -v` to confirm Maven is using JDK 25. The wrapper supplies Maven; if you use your own installation, use Maven 3.9.11 or later.

Maven downloads JavaFX 27.0.1 and its platform libraries. [JavaFX 27 requires JDK 25 or later](https://openjfx.io/highlights/27/). Start the application with `./mvnw javafx:run`.

**[Documentation in English](documentation/en/_Index.md)**

**[Dokumentation in Deutsch](documentation/de/_Index.md)**

**Important: ChatGPT was utilized to generate the documentation based on 
predefined content specifications, as it represents the fastest way to produce 
comprehensive documentation.**
