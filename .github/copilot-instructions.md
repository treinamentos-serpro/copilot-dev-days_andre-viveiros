# Copilot instructions

## Project context

This repository is a Java 21 Spring Boot project named Soc Ops. The runtime app is under [socops](../socops), while the workshop documentation is under [workshop](../workshop).

## Key workflow

- Use the Maven wrapper in [socops](../socops) for all Java builds and tests.
- Prefer targeted edits that follow the existing package and class structure.
- Keep UI changes aligned with the utility-style CSS already used in [socops/src/main/resources/static/css/app.css](../socops/src/main/resources/static/css/app.css).
- Treat the lab docs as the source of intended behavior and examples when the task is workshop-related.

## Commands

- Start app: `cd socops && ./mvnw spring-boot:run`
- Test: `cd socops && ./mvnw test`
- Package: `cd socops && ./mvnw clean package`

## Relevant files

- [socops/src/main/java/com/socops/SocOpsApplication.java](../socops/src/main/java/com/socops/SocOpsApplication.java)
- [socops/src/main/java/com/socops/service/BoardAssembler.java](../socops/src/main/java/com/socops/service/BoardAssembler.java)
- [socops/src/test/java/com/socops/service/BoardAssemblerTests.java](../socops/src/test/java/com/socops/service/BoardAssemblerTests.java)
- [socops/src/main/resources/templates/game.html](../socops/src/main/resources/templates/game.html)
- [socops/src/main/resources/static/css/app.css](../socops/src/main/resources/static/css/app.css)
- [README.md](../README.md)
- [workshop/GUIDE.md](../workshop/GUIDE.md)

## Style notes

- Keep logic simple and explicit.
- Preserve the naming and conventions already used in the project.
- Favor small, testable changes.
- When touching frontend styling, prefer utilities and CSS composition over custom one-off selectors.
