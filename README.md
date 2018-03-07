# akka-persistence-no-ops

Akka persistence plugin with no ops for testing. This plugin does *NOT* save any message or snapshot to any unerlying storage. Use it for testing only!

## Installation

The plugin is compiled with Scala 2.12 and 2.11 and are deployed on maven sonatype repositories.
To use the plugin add this to your sbt build file :

```scala
libraryDependencies += "com.github.mingchuno" %% "akka-persistence-no-ops" % "0.1.0"
```

## Using the Journal/Snapshot Component

To use the journal component, you need to enable it in your configuration. To use the default settings, simply add this line:

```scala
akka.persistence.journal.plugin = "akka-persistence-no-ops.journal"
akka.persistence.snapshot-store.plugin = "akka-persistence-no-ops.snapshot"
```
