## Scalar

Standalone Scala provider mod, support Scala 3 and Scala 2.11

Use with alpha version Cleanroom

### Downloads:

- [Scalar Legacy](https://legacy.curseforge.com/minecraft/mc-mods/scalar-legacy), ships Scala 2.11.1, used by non-Cleanroom-based Scala mod
- [Scala](https://github.com/CleanroomMC/Scalar/releases/tag/3.4.1), ships Scala 3.x, used by Cleanroom mods
- You can't install them at same time!

### Development guide:

1. Add 
```groovy
maven {
    name "outlandsReleases"
    url "https://maven.arcseekers.com/releases"
}
```
to your repositories

2. Add `runtimeOnly "com.cleanroommc:scalar:1.0.0"` to your dependencies
3. Add
```groovy
scala {
    scalaVersion = '3.6.4'
}
```
to your build script
4. Set `modLanguage = "scala"` in `@Mod()`
5. Scala 2 -> 3 porting guide is WIP