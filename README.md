# README

## Descrição

Este projeto Java é uma aplicação de gerenciamento de consultas agendadas. Ele inclui três principais classes:

1. **`Data`**: Gerencia datas, incluindo validação, formatação e cálculo de dias transcorridos no ano.
2. **`Hora`**: Gerencia horários, com validação e formatação.
3. **`ConsultaAgendada`**: Representa uma consulta agendada, contendo data, hora, nome do paciente e nome do médico. Oferece funcionalidades para criar, modificar e exibir consultas.

## Estrutura do Projeto

### Classe `Data`

A classe `Data` gerencia a data com os seguintes métodos:

- **Construtores**:
  - `Data()`: Permite ao usuário digitar valores para dia, mês e ano.
  - `Data(int d, int m, int a)`: Inicializa com valores fornecidos.
- **Métodos de configuração**:
  - `setDia(int d)`, `setMes(int m)`, `setAno(int a)`: Configura valores específicos com validação.
  - `setDia()`, `setMes()`, `setAno()`: Permite ao usuário digitar novos valores.
- **Métodos de obtenção**:
  - `getDia()`, `getMes()`, `getAno()`: Retorna valores da data.
  - `mostra1()`, `mostra2()`: Exibe a data em formatos diferentes.
- **Métodos adicionais**:
  - `bissexto()`: Verifica se o ano é bissexto.
  - `diasTranscorridos()`: Calcula os dias passados no ano até a data fornecida.
  - `apresentaDataAtual()`: Exibe a data atual do sistema.

### Classe `Hora`

A classe `Hora` gerencia o horário com os seguintes métodos:

- **Construtores**:
  - `Hora(int h, int mi, int s)`: Inicializa com valores fornecidos.
  - `Hora()`: Inicializa com valores padrão.
- **Métodos de configuração**:
  - `setHora(int h)`, `setMinuto(int mi)`, `setSegundo(int s)`: Configura valores específicos com validação.
  - `setHora()`, `setMinuto()`, `setSegundo()`: Permite ao usuário digitar novos valores.
- **Método de obtenção**:
  - `mostra()`: Exibe a hora no formato `HH:mm:ss`.

### Classe `ConsultaAgendada`

A classe `ConsultaAgendada` representa uma consulta com data, hora, paciente e médico:

- **Construtores**:
  - `ConsultaAgendada()`: Permite ao usuário digitar os valores para todos os atributos.
  - `ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med)`: Inicializa com valores fornecidos.
  - `ConsultaAgendada(Data d, Hora h, String p, String m)`: Inicializa com objetos `Data` e `Hora`.
- **Métodos de configuração**:
  - `setData(int d, int m, int a)`, `setData()`: Configura ou altera a data.
  - `setHora(int h, int mi, int s)`, `setHora()`: Configura ou altera a hora.
  - `setNomePaciente(String p)`, `setNomePaciente()`: Configura ou altera o nome do paciente.
  - `setNomeMedico(String m)`, `setNomeMedico()`: Configura ou altera o nome do médico.
- **Métodos de obtenção**:
  - `getData()`, `getHora()`, `getNomePaciente()`, `getNomeMedico()`: Retorna os valores dos atributos.
  - `getAmostra()`: Retorna o número total de consultas agendadas.

## Uso

1. **Criação de Objetos**: O programa cria um objeto `ConsultaAgendada` com valores padrão e permite ao usuário modificar e visualizar os detalhes.
2. **Execução**: A classe `Main` executa as operações de criação, modificação e exibição de objetos `ConsultaAgendada`, e grava o resultado em um arquivo `resultado.txt`.

## Compilação e Execução

Para compilar e executar o projeto:

```bash
javac Data.java Hora.java ConsultaAgendada.java Main.java
java Main

//O resultado será exibido no console e salvo em um arquivo chamado resultado.txt.

## Participantes do projeto

