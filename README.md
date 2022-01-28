# Report Wizard Core #


#### Pre-requisites for building the project:
* Maven, version 3+
* Java JDK 11
* This [settings.xml](https://github.com/pentaho/maven-parent-poms/blob/master/maven-support-files/settings.xml) in your <user-home>/.m2 directory

#### Building it


```
$ mvn clean install
```
This will run any [Castor](http://castor-data-binding.github.io/castor/) conversions configured in the POM file. To run 
them manually, you can use the following example:

```
$ mvn generate-sources -Dcastor-jfree
```

Newly generated source files will be placed in the appropriate package in `impl/src/main/java` based
on the directives in  `pom.xml` so that they can be checked into source control.
