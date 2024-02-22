# Gatling JSON Placeholder Load Testing

![Gatling](https://img.shields.io/github/v/tag/gatling/gatling?color=f78557&label=gatling&logo=gatling&style=for-the-badge)
![Scala](https://img.shields.io/github/v/tag/scala/scala?color=%23DC322F&label=scala&logo=scala&logoColor=%23DC322F&style=for-the-badge)

[JsonPlaceholder API](https://jsonplaceholder.typicode.com) load testing using gatling.io.

## Prerequisites

Make sure you have installed and be configured the environment variables all the following prerequisites on your development machine:

| OS      | JDK                            | Gradle                 |
| ------- | ------------------------------ | ---------------------- |
| Windows | `scoop install java/openjdk21` | `scoop install gradle` |
| macOS   | `brew install openjdk@21`      | `brew install gradle`  |

## Executing the Tests

- Clone the repository.

```shell
git clone https://github.com/burakkaygusuz/gatling-jsonplaceholder-load-testing.git
```

- Change the directory.

```shell
cd gatling-jsonplaceholder-load-testing
```

- Run the test.

```shell
./gradlew gatlingRun
```
