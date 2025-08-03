## Scalar

Standalone Scala provider mod, support Scala 3 and Scala 2.11

### Downloads:

- [Scala Legacy](https://github.com/CleanroomMC/Scalar/releases/tag/2.11.1), use that if you are updating from Forge and/or don't know what's going on
- [Scala](https://github.com/CleanroomMC/Scalar/releases/tag/3.4.1), will crash with most existing mods, used that if you know what you are doing
- You can't install them together!
- There is only 1 Scala 3 mods in 1.12.2! (OpenComputer Rescaled)

### Development (temporary):

1. Add 
```groovy
maven {
    name "outlandsReleases"
    url "https://maven.outlands.top/releases"
}
```
to your repositories

2. Add `implementation "com.cleanroommc:scalar:1.0.0"` to your dependencies (It will be shown as disabled in modlist but that's fine)
3. Set your scala version to latest using scala plugin [document](https://docs.gradle.org/current/userguide/scala_plugin.html)
4. `modLanguage = "scala"` in `@Mod()`