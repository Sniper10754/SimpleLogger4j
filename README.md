# SimpleLogger4j [![](https://jitpack.io/v/Sniper10754/SimpleLogger4j.svg)](https://jitpack.io/#Sniper10754/SimpleLogger4j)

A Simple logger for java

## Adding the dependency

### Maven

1: Add the JitPack repository
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
2: Add the dependency
```xml
	<dependency>
	    <groupId>com.github.Sniper10754</groupId>
	    <artifactId>SimpleLogger4j</artifactId>
	    <version>Tag</version>
	</dependency>
```

### Gradle

1: Add the JitPack repository
```kotlin
allprojects {
  repositories {
    maven { url = uri("https://jitpack.io") }
  }
}
```

2:
```kotlin
dependencies {
  implementation("com.github.Sniper10754:SimpleLogger4j:Tag")
}
```

## Samples

Using the logger
```java

Logger logger = new SimpleLogger("loggerName");

logger.addListener(new ConsoleListener());

logger.info("Hi!");

```
Making System.out use a specific logger
```java
Logger logger = new SimpleLogger("logger")

PrintStreamLogger psLogger = new PrintStreamLogger(logger)

System.setOut(psLogger)

System.out.println("Handy!")

```
