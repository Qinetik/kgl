val currentVersion: String by lazy {
    versionInfo().versionName
}

enum class VersionType { RELEASE, SNAPSHOT }

data class VersionInfo(
    val versionName: String,
    val type: VersionType
)

fun versionInfo(): VersionInfo {
    return VersionInfo(
        versionName = "6.6.3",
        type = VersionType.RELEASE
    )
//    val pushedTag = System.getenv("PUSHED_TAG")
//    return if (pushedTag != null && pushedTag.isNotEmpty()) {
//        VersionInfo(pushedTag, VersionType.RELEASE)
//    } else {
//        val exactTag = "git describe --tags --exact-match".runCommand()
//        if (exactTag.isNotEmpty()) {
//            VersionInfo(exactTag, VersionType.RELEASE)
//        } else {
//            val version = "git describe --tags --abbrev=0".runCommand()
//            val hash = "git describe --always".runCommand()
//
//            VersionInfo("$version-SNAPSHOT-$hash", VersionType.SNAPSHOT)
//        }
//    }
}
