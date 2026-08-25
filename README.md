<div align="center">

# 🎲 Soc Ops

**Social Bingo for in-person meetups — powered by GitHub Copilot**

_Find people who match the prompts. Get 5 in a row. Break the ice._

[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

🌐 [Português (BR)](README.pt_BR.md) · [Español](README.es.md)

</div>

---

## ✨ What is this?

**Soc Ops** is a Spring Boot web application that generates a randomized Social Bingo board for each player at in-person events. No apps to install — just open the URL on your phone, grab a board, and start meeting people.

It also doubles as a hands-on **GitHub Copilot workshop** where you build, redesign, and extend the app using AI agents in VS Code.

---

## 🚀 Quick Start

> **Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) (or use the included wrapper)

```bash
# Clone and run
git clone <your-repo-url>
cd socops
./mvnw spring-boot:run
```

Open [http://localhost:8080](http://localhost:8080) — every refresh gives a new unique bingo board.

---

## 🧪 Development

```bash
# Run tests
cd socops && ./mvnw test

# Full build (tests + lint + package)
cd socops && ./mvnw clean package
```

> Lint rules are enforced via Checkstyle (unused imports, import ordering, code style). The build fails on violations.

---

## 📚 Workshop Lab Guide

This project is the foundation for a multi-part Copilot lab. Each part teaches a different agentic workflow:

| # | Part | What you'll do |
|---|------|----------------|
| [00](workshop/00-overview.md) | Overview & Checklist | Set up and orient |
| [01](workshop/01-setup.md) | **Context Engineering** | Generate workspace instructions with Copilot |
| [02](workshop/02-design.md) | **Design-First Frontend** | Redesign the UI in Plan Mode |
| [03](workshop/03-quiz-master.md) | **Custom Quiz Master** | Create a custom agent that generates themed prompts |
| [04](workshop/04-multi-agent.md) | **Multi-Agent Development** | TDD with Red → Green → Refactor agents |

👉 **[Open the Lab Guide →](workshop/GUIDE.md)**

---

## 🏗️ Project Structure

```
socops/                          # Spring Boot application
├── src/main/java/com/socops/
│   ├── data/IcebreakerPrompts.java   # Bingo prompt pool
│   ├── service/BoardAssembler.java   # Board generation logic
│   └── web/BingoRestController.java  # REST endpoints
├── src/main/resources/
│   ├── templates/game.html           # Thymeleaf game board
│   └── static/css/app.css            # Utility CSS (Tailwind-like)
└── pom.xml                           # Maven build + Checkstyle

workshop/                        # Lab guide and exercises
```

---

## 🤝 Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md). All contributions welcome — new prompt themes, UI tweaks, or new lab parts.

---

<div align="center">

Deploys automatically to GitHub Pages on push to `main`.

Made with ☕ + 🤖 for developer meetups everywhere.

</div>
