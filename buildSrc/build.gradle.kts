configurations {
    all {
        resolutionStrategy.cacheChangingModulesFor(1, TimeUnit.SECONDS)
    }
}

repositories {
    mavenLocal()
    maven("https://maven.aliyun.com/repository/gradle-plugin")
    maven("https://maven.aliyun.com/repository/public/")
    gradlePluginPortal()
    mavenCentral()
    maven("https://s01.oss.sonatype.org/content/groups/public/")
}

dependencies {
    implementation("top.bettercode.summer:publish-plugin:0.0.19-SNAPSHOT")
}