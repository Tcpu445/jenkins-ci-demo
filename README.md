# Jenkins CI Demo

A small Java 17 Maven application used to demonstrate a Jenkins Continuous Integration pipeline.

## Pipeline stages

1. **Checkout** – Jenkins retrieves this repository from GitHub.
2. **Build** – Maven compiles the Java source code.
3. **Test** – Maven runs the JUnit 5 unit test.
4. **Package** – Maven creates an executable JAR.

## Requirements

- Java 17
- Maven 3.8.6 or later
- Git
- Jenkins with Pipeline, Git and JUnit plugins

The Jenkins build agent must have Java and Maven available on its PATH.

## Run locally

```bash
mvn clean verify
java -jar target/jenkins-ci-demo-1.0-SNAPSHOT.jar
```

Expected application output:

```text
Hello from Jenkins CI!
```

## Jenkins setup

Create a Pipeline job and choose **Pipeline script from SCM**:

- SCM: Git
- Repository URL: your GitHub repository's HTTPS clone URL
- Branch: `*/main` (or your repository's actual default branch)
- Script Path: `Jenkinsfile`
