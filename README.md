## translate-service

Toy application for teaching some Scala concepts.

To use this library in another application you must:
```
sbt publishLocal
```

Then add the following to the dependent project's `build.sbt`:
```
libraryDependencies += "io.glassdome" %% "translate-service" % "0.1.0"
```
^^ Make sure to check the version and keep updated to use the latest.

