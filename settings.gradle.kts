rootProject.name = "harbor"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("spigot-api", "org.spigotmc:spigot-api:1.19.4-R0.1-SNAPSHOT")
            library("essentials", "net.essentialsx:EssentialsX:2.19.7")
            library("annotations", "org.jetbrains:annotations:24.0.0")
            library("placeholder-api", "me.clip:placeholderapi:2.11.3")
            library("bstats", "org.bstats:bstats-bukkit:3.0.0")
        }
    }
}