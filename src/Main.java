import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializa o Scanner para entrada do usuário
        Scanner sc = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        // Passo 1: Instancia o objeto p1
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 8, 2024, "João da Silva", "Dr. Pedro");

        // Adiciona as propriedades de p1 ao resultado
        resultado.append("Propriedades de p1:\n");
        resultado.append("Data: ").append(p1.getData()).append("\n");
        resultado.append("Hora: ").append(p1.getHora()).append("\n");
        resultado.append("Nome do Paciente: ").append(p1.getNomePaciente()).append("\n");
        resultado.append("Nome do Médico: ").append(p1.getNomeMedico()).append("\n");
        resultado.append("Total de consultas agendadas: ").append(ConsultaAgendada.getAmostra());
        resultado.append("_________________________________________________________");
        resultado.append("\n");

        // Passo 2: Instancia o objeto p2
        ConsultaAgendada p2 = new ConsultaAgendada();

        // Adiciona as propriedades de p2 ao resultado
        resultado.append("Propriedades de p2:\n");
        resultado.append("Data: ").append(p2.getData()).append("\n");
        resultado.append("Hora: ").append(p2.getHora()).append("\n");
        resultado.append("Nome do Paciente: ").append(p2.getNomePaciente()).append("\n");
        resultado.append("Nome do Médico: ").append(p2.getNomeMedico()).append("\n");
        resultado.append("Total de consultas agendadas: ").append(ConsultaAgendada.getAmostra());
        resultado.append("_________________________________________________________");
        resultado.append("\n");

        // Passo 3: Altera as propriedades de p1
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        // Adiciona as propriedades alteradas de p1 ao resultado
        resultado.append("Propriedades de p1 após alteração:\n");
        resultado.append("Data: ").append(p1.getData()).append("\n");
        resultado.append("Hora: ").append(p1.getHora()).append("\n");
        resultado.append("Nome do Paciente: ").append(p1.getNomePaciente()).append("\n");
        resultado.append("Nome do Médico: ").append(p1.getNomeMedico()).append("\n");
        resultado.append("Total de consultas agendadas: ").append(ConsultaAgendada.getAmostra());
        resultado.append("_________________________________________________________");
        resultado.append("\n");

        // Passo 4: Exibe a quantidade final de consultas
        resultado.append("Quantidade final de consultas: ").append(ConsultaAgendada.getAmostra()).append("\n");

        // Exibe o resultado no console
        System.out.println(resultado.toString());

        // Escreve o resultado em um arquivo texto
        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado.txt"))) {
            writer.write(resultado.toString());
            System.out.println("Resultados escritos no arquivo 'resultado.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }
}
