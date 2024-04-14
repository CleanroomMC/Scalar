## Scalar

Standalone Scala provider mod, support Scala 3 and Scala 2.11

Use with experimental branch Cleanroom (3025+) 

### Downloads:

- [Scala 2.11.x](https://github.com/CleanroomMC/Scalar/releases/tag/2.11.1), used by non-Cleanroom-based Scala mod
- [Scala 3.x](https://github.com/CleanroomMC/Scalar/releases/tag/3.4.1), used by Cleanroom-based new mod or forks
- You can't install them together!
- There are 0 Scala 3 mods! (for now)

### Development (temporary):

1. Add 
```groovy
maven {
    name "outlandsReleases"
    url "https://maven.outlands.top/releases"
}
```
to your repositories

2. Add `implementation "com.cleanroommc:scalar:3.4.1:api"` to your dependencies
3. Add
```groovy
    implementation 'org.scala-lang:scala3-compiler_3:3.4.1'
    implementation 'org.scala-lang:scala3-library_3:3.4.1'
    implementation 'org.scala-lang.modules:scala-parser-combinators_3:2.3.0'
    implementation 'org.scala-lang.modules:scala-swing_3:3.0.0'
    implementation 'org.scala-lang.modules:scala-xml_3:2.2.0'
    implementation 'org.scala-lang.modules:scala-asm:9.6.0-scala-1'
```
to your dependencies (Yes you need to declare them yourself)

4. `modLanguage = "scala"` in `@Mod()`