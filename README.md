# Fruit Cowboy

Welcome! You and another student are going to build this game together.

Fruit Cowboy is a game where fruits (and sneaky bombs) pop up on the screen, and you click them to score points. Right now this project is just an empty skeleton — folders and placeholder files with `// TODO` notes — and it's up to you two to bring it to life!

To run the game, type this in the terminal:

```
mvn compile exec:java
```

(You'll need Java 17 or newer installed first — ask your teacher if you're not sure.)

## "release version 17 not supported" error?

This means your computer is using an old version of Java. Run this to check what you have installed:

```
/usr/libexec/java_home -V
```

If you see a version 17 or higher in the list, tell Maven to use it (swap `25` for whichever version number you saw):

```
export JAVA_HOME=$(/usr/libexec/java_home -v 25)
mvn compile exec:java
```

If that fixes it, ask your teacher to help make it permanent so you don't have to type it every time.

