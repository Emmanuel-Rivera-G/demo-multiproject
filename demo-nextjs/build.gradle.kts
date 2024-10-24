plugins {
    id("com.moowork.node") version "1.3.1"
}

node {
    version = "20.11.0"
    download = true
}

tasks {
    val installDependencies by creating {
        doLast {
            exec {
                commandLine("pnpm", "install")
            }
        }
    }

    val startNextApp by creating {
        dependsOn(installDependencies)
        doLast {
            exec {
                commandLine("pnpm", "dev")
            }
        }
    }
}