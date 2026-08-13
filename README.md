
# Aprendendo Git 🎓

Repositório de estudos criado durante as aulas de **Desenvolvimento de Sistemas**, com orientação do professor **Matheus**, para aprender e praticar os conceitos fundamentais do Git.

## 📌 Sobre

Este material reúne os principais comandos e conceitos de Git vistos em aula, servindo como referência rápida e guia de prática.

## 🧠 O que é Git?

Git é um **sistema de controle de versão distribuído**, usado para acompanhar mudanças em arquivos de código, permitir trabalho colaborativo e manter um histórico completo do projeto.

## ⚙️ Configuração inicial

```bash
# Definir nome de usuário
git config --global user.name "Seu Nome"

# Definir e-mail
git config --global user.email "seuemail@exemplo.com"

# Verificar configurações
git config --list
```

## 🚀 Comandos básicos

| Comando | O que faz |
|---|---|
| `git init` | Inicia um repositório Git na pasta atual |
| `git clone <url>` | Clona um repositório remoto |
| `git status` | Mostra o estado atual dos arquivos |
| `git add <arquivo>` | Adiciona arquivo(s) à área de stage |
| `git add .` | Adiciona todos os arquivos modificados |
| `git commit -m "mensagem"` | Salva as mudanças no histórico |
| `git log` | Mostra o histórico de commits |
| `git diff` | Mostra as diferenças entre versões |

## 🌿 Trabalhando com branches

```bash
# Criar uma nova branch
git branch nome-da-branch

# Trocar de branch
git checkout nome-da-branch

# Criar e trocar de branch ao mesmo tempo
git checkout -b nome-da-branch

# Juntar uma branch na atual
git merge nome-da-branch

# Listar branches
git branch
```

## ☁️ Trabalhando com repositórios remotos (GitHub)

```bash
# Conectar repositório local a um remoto
git remote add origin <url-do-repositorio>

# Enviar commits para o remoto
git push origin main

# Baixar atualizações do remoto
git pull origin main

# Verificar remotos configurados
git remote -v
```

## 🔄 Fluxo básico de trabalho

1. `git status` → ver o que mudou
2. `git add .` → preparar as mudanças
3. `git commit -m "descrição da mudança"` → salvar no histórico
4. `git push` → enviar para o repositório remoto

## 🛠️ Comandos úteis extras

```bash
# Desfazer alterações não commitadas em um arquivo
git checkout -- <arquivo>

# Ver diferenças entre commits
git diff <commit1> <commit2>

# Reverter um commit específico
git revert <hash-do-commit>

# Voltar para um commit anterior (cuidado!)
git reset --hard <hash-do-commit>

# Ignorar arquivos (criar .gitignore)
echo "node_modules/" >> .gitignore
```

## 📚 Boas práticas aprendidas em aula

- Fazer commits pequenos e frequentes
- Escrever mensagens de commit claras e objetivas
- Usar branches para novas funcionalidades (`feature/nome-da-feature`)
- Sempre dar `git pull` antes de começar a trabalhar
- Revisar `git status` e `git diff` antes de commitar

## 🙏 Créditos

Conteúdo baseado nas aulas do professor **Matheus**, disciplina de **Desenvolvimento de Sistemas**.
