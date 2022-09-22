# iroha

## Getting Started

### Installation

`pom.xml`
```xml
 <repository>
  <id>github</id>
  <name>iroha</name>
  <url>https://maven.pkg.github.com/2mug1/iroha</url>
</repository>

<dependency>
  <groupId>net.iamtakagi</groupId>
  <artifactId>iroha</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

`build.gradle`
```gradle
repositories {
  maven (url = "https://maven.pkg.github.com/2mug1/iroha")
}
dependencies {
  implementation("net.iamtakagi:iroha:1.0.0")
}
```

## LICENSE
[MIT License](./LICENSE) (© 2022 iamtakagi)