# AGENTS.md

## Checklist obrigatória antes de concluir

- [ ] Lint/static checks: executar as validações disponíveis no projeto antes de entregar.
- [ ] Build: `cd socops && ./mvnw clean package`
- [ ] Testes: `cd socops && ./mvnw test`

## Visão geral

Este repositório é um aplicativo Java 21 com Spring Boot chamado Soc Ops, um jogo de bingo social para encontros presenciais. A aplicação executável fica em [socops](socops) e os materiais do workshop em [workshop](workshop).

## Convenções

- Prefira mudanças pequenas e focadas em vez de refatorações amplas.
- Separe lógica de negócio de UI.
- Siga os utilitários de CSS já existentes ao editar frontend.
- Reaproveite a estrutura atual de modelos, serviços e templates.
- Use [README.md](README.md) e [workshop/GUIDE.md](workshop/GUIDE.md) como referência de comportamento e objetivos do laboratório.

## Pontos principais

- App: [socops/src/main/java/com/socops/SocOpsApplication.java](socops/src/main/java/com/socops/SocOpsApplication.java)
- Tabuleiro: [socops/src/main/java/com/socops/service/BoardAssembler.java](socops/src/main/java/com/socops/service/BoardAssembler.java)
- Prompts: [socops/src/main/java/com/socops/data/IcebreakerPrompts.java](socops/src/main/java/com/socops/data/IcebreakerPrompts.java)
- REST: [socops/src/main/java/com/socops/web/BingoRestController.java](socops/src/main/java/com/socops/web/BingoRestController.java)
- Template: [socops/src/main/resources/templates/game.html](socops/src/main/resources/templates/game.html)
- CSS: [socops/src/main/resources/static/css/app.css](socops/src/main/resources/static/css/app.css)
- Testes: [socops/src/test/java/com/socops/service/BoardAssemblerTests.java](socops/src/test/java/com/socops/service/BoardAssemblerTests.java)

## Comandos

- Rodar app: `cd socops && ./mvnw spring-boot:run`
- Testar: `cd socops && ./mvnw test`
- Build: `cd socops && ./mvnw clean package`

## Observações específicas

- Spring Boot 3.4.2 e Java 21.
- A lógica do tabuleiro é estática e pura, sem injeção de dependência no serviço.
- O frontend usa utilitários de CSS centralizados em um único arquivo; prefira reaproveitar classes existentes antes de adicionar CSS novo.
- O repositório é educativo e orientado a workshop.

## Arquivos úteis

- [README.md](README.md)
- [workshop/GUIDE.md](workshop/GUIDE.md)
- [.github/instructions/css-utilities.instructions.md](.github/instructions/css-utilities.instructions.md)
- [.github/instructions/frontend-design.instructions.md](.github/instructions/frontend-design.instructions.md)
