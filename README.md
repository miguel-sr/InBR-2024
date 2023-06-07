# InBR - 2024

Repositório para desenvolvimento da programação da temporada 2023-2024 **[FIRST® Robotics Competition CRESCENDO](https://www.firstinspires.org/robotics/frc/game-and-season)**

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

- [WPILib 2023](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/wpilib-setup.html) - Biblioteca para desenvolvimento
- [FRC Game Tools](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/frc-game-tools.html) - Software para operação do robô
- [Phoenix Framework](https://store.ctr-electronics.com/software/) - Software para configuração dos componentes da CTRe
- [REV Hardware Client](https://docs.revrobotics.com/rev-hardware-client/) - Software para configuração dos componentes da REV
- [GIT](https://git-scm.com/downloads) - Versionamento do código

### 🔧 Instalação

1. Clone o repositório com o comando `git clone https://github.com/miguel-sr/InBR-2024.git`
2. Abra o projeto com o WPILib VS Code
3. Execute o processo de build com `./gradlew build` se não for executado automaticamente

## 🖇️ Contribuindo com o projeto

### ⚠ Importante

Antes de se aventurar nesse projeto é importante que você conheça a biblioteca [WPILib](https://docs.wpilib.org/en/stable/) e tenha noção das suas funcionalidades.

### 📃 Intruções para fazer um Pull Request (PR)

1. Acesse algum dos [Issues](https://github.com/miguel-sr/InBR-2024/issues) que estão abertos e veja seu objetivo.
2. Após entender seu Issue, é hora de botar a mão na massa. Para isso, crie um novo branch no padrão **KEBAB CASE** iniciando com o código do Issue seguido pelo título, exemplo:

   ```
   git checkout -B 13-criar-comando-para-usar-subsistema-drive
   ```

3. Com suas alterações feitas faça o commit iniciando com # e o código do Issue e sua mensagem de forma objetiva:

   ```
   git add --all
   ```
   
   ```
   git commit -m "#13 Cria comando que usa subsistema drive"
   ```

4. Para subir as alterações use:

   ```
   git push -u origin 13-criar-comando-para-usar-subsistema-drive
   ```    
   Obs: Lembre-se de alterar para o nome da sua branch

5. Antes de realizar o Pull Request, atualize sua branch local com os arquivos da main com o seguinte comando:
   
   ```
   git pull origin main
   ```

6. Suba as alterações:

   ```
   git push
   ```

7. Procure por sua branch no [projeto](https://github.com/miguel-sr/InBR-2024/branches) e faça o pedido de merge para a main,
atribuindo algum mentor para revisão das suas alterações.

### Aguarde pela revisão e prossiga pro seu próximo desafio 😉

## ✒️ Autores

- **Miguel Ramos** - _Mentor do Projeto_ - [miguel-sr](https://github.com/miguel-sr)

## 📄 Licença

Este projeto está sob a licença BSD - veja o arquivo [WPILib-License.md](https://github.com/miguel-sr/InBR-2024/blob/main/WPILib-License.md) para detalhes.
