# Gatling Load Testing Example

![Gatling](https://img.shields.io/github/v/tag/gatling/gatling?color=f78557&label=gatling&logo=gatling&style=for-the-badge)
![Scala](https://img.shields.io/github/v/tag/scala/scala?color=%23DC322F&label=scala&logo=scala&logoColor=%23DC322F&style=for-the-badge)

A simple load testing automation example that built with Gatling, Scala and Gradle.

## Prerequisites

Make sure you have installed and be configured the environment variables all the following prerequisites on your development machine:

| OS      | JDK                                | Gradle                 |
|---------|------------------------------------|------------------------|
| Windows | `scoop install java/temurin17-jdk` | `scoop install gradle` |
| macOS   | `brew install --cask temurin`      | `brew install gradle`  |

## Executing the Tests

- Clone the repository.

```shell
git clone https://github.com/burakkaygusuz/gatling-load-testing-example.git
```

- Change the directory.

```shell
cd gatling-load-testing-example
```

- Run the test.

```shell
./gradlew gatlingRun
```
