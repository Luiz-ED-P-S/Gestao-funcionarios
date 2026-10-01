# 🏢 Sistema de Gestão de Funcionários

> Sistema desenvolvido em Java para gerenciar colaboradores de uma empresa, aplicando conceitos avançados de Orientação a Objetos como herança, polimorfismo e encapsulamento.

---

## 🚀 Tecnologias Utilizadas
* **Java** (JDK 17+)
* **Maven** (Gerenciamento de dependências)

---

## 🎯 Sobre o Projeto
Este projeto tem como objetivo modelar a hierarquia e os cargos de uma empresa utilizando POO. O sistema diferencia funcionários comuns de cargos específicos — como **Desenvolvedor** e **Gerente** —, permitindo o cálculo de salários e a manipulação de dados de forma organizada.

---

## 📂 Estrutura do Projeto
```text
src/
└── main/
    └── java/
        └── org/
            └── example/
                ├── empresa/
                │   ├── Funcionario.java    (Classe base / superclasse)
                │   ├── Desenvolvedor.java  (Subclasse com regras específicas)
                │   └── Gerente.java        (Subclasse com regras específicas)
                └── Main.java               (Classe de teste e execução)
