rootProject.name = "harbor"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven ("https://repo.papermc.io/repository/maven-public/")
        maven ("https://ci.ender.zone/plugin/repository/everything/")
        maven ("https://repo.extendedclip.com/content/repositories/placeholderapi/")
        maven ("https://repo.essentialsx.net/releases/")
    }
    versionCatalogs {
        create("libs") {
            library("paper-api", "io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
            library("essentials", "net.essentialsx:EssentialsX:2.20.1")
            library("annotations", "org.jetbrains:annotations:26.0.1")
            library("placeholder-api", "me.clip:placeholderapi:2.11.6")
            library("bstats", "org.bstats:bstats-bukkit:3.1.0")

            plugin("shadow", "com.gradleup.shadow").version("8.3.5")
            plugin("bukkit-yml", "net.minecrell.plugin-yml.bukkit").version("0.6.0")
        }
    }
}