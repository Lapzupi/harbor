import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    alias(libs.plugins.bukkit.yml)
    alias(libs.plugins.shadow)
}

group = "xyz.nkomarn.harbor"
version = "1.6.4"
description = "Harbor redefines how sleep works in your server, making it easier for all the online players to get in bed quickly and skip through the night!"

bukkit {
    name = "Harbor"
    main = "xyz.nkomarn.harbor.Harbor"
    version = rootProject.version.toString()
    apiVersion = "1.21"
    
    website = "https://nkomarn.xyz"
    author = "TechToolbox (@nkomarn)"
    authors = listOf("sarhatabaot")
    description = rootProject.description.toString()
    
    softDepend = listOf("Essentials", "EssentialsX", "PlaceholderAPI")
    
    commands {
        register("harbor") {
            description = "Base command for Harbor."
            usage = "/harbor <subcommand>"
        }
        
        register("forceskip") {
            description = "Allows players to accelerate the night of their current world."
            permission = "harbor.forceskip"
        }
    }
    
    permissions {
        register("harbor.admin") {
            default = BukkitPluginDescription.Permission.Default.OP
        }
        
        register("harbor.forceskip") {
            description = "Permits usage of the /forceskip command."
            default = BukkitPluginDescription.Permission.Default.OP
        }
        
        register ("harbor.ignored") {
            default = BukkitPluginDescription.Permission.Default.FALSE
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}


dependencies {
    compileOnly(libs.paper.api)
    compileOnly(libs.placeholder.api)
    compileOnly(libs.essentials)
    
    implementation(libs.bstats)
    implementation(libs.annotations)
    library(libs.annotations)
}

tasks {
    build {
        dependsOn(shadowJar)
    }
    
    shadowJar {
        minimize()
        
        archiveClassifier.set("")
        
        relocate("org.bstats", "xyz.nkomarn.harbor.bstats")
    }
}