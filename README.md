## Scalar

Standalone Scala provider mod, support Scala 3 and Scala 2.11

Use with experimental branch Cleanroom (3025+) 

### Downloads:

- [Scala 2.11.x](https://github.com/CleanroomMC/Scalar/releases/tag/2.11.1), used by non-Cleanroom-based Scala mod
- [Scala 3.x](https://github.com/CleanroomMC/Scalar/releases/tag/3.4.1), used by Cleanroom-based new mod or forks
- You can't install them together!
- There is only 1 Scala 3 mods in 1.12.2! (OpenComputer CRL edition)

### Development (temporary):

1. Add 
```groovy
maven {
    name "outlandsReleases"
    url "https://maven.outlands.top/releases"
}
```
to your repositories

2. Add `implementation "com.cleanroommc:scalar:3.5.1:api"` to your dependencies
3. Add
```groovy
    implementation 'org.scala-lang:scala3-compiler_3:3.6.3'
    implementation 'org.scala-lang:scala3-library_3:3.6.3'
    implementation 'com.typesafe:config:1.4.3'
    implementation 'org.typelevel:cats-core_3:2.13.0'
    implementation 'org.typelevel:cats-kernel_3:2.13.0'
    implementation 'org.typelevel:cats-free_3:2.13.0'
```
to your dependencies (Yes you need to declare them yourself)

4. `modLanguage = "scala"` in `@Mod()`