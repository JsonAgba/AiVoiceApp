pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven ("https://maven.aliyun.com/repository/google")
        maven ("https://maven.aliyun.com/repository/public")
        maven ("https://maven.aliyun.com/repository/gradle-plugin")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven ("https://maven.aliyun.com/repository/google")
        maven ("https://maven.aliyun.com/repository/public")
        maven ("https://maven.aliyun.com/repository/gradle-plugin")
    }
}

rootProject.name = "AiVoiceApp"
include(":app")
include(":lib_base")
include(":lib_network")
include(":lib_voice")
include(":module_app_manager")
include(":moudule_constellation")
include(":moudule_map")
include(":moudule_joke")
include(":moudule_voice_setting")
include(":moudule_setting")
include(":moudule_weather")
include(":moudule_developer")
include(":buildSource")
