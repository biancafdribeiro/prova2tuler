public class Main {
    public static void main(String[] args) {

        //objeto p1: construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String m)
        ConsultaAgendada p1 = new ConsultaAgendada(10, 05, 30, 15, 06, 2024, "Bianca Fonseca", "Juvenildo Reis");
        System.out.println("Consulta 1: ");
        System.out.println("Data da consulta: " + p1.getData());
        System.out.println("Hora da consulta: " + p1.getHora());
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        System.out.println("Nome do médico: " + p1.getNomeMedico());
        System.out.println("Total de consultas agendadas: " + p1.getAmostra());
        System.out.println("---------------------------------------");

        //objeto p2: construtor ConsultaAgendada()
        System.out.println("Consulta 2: ");
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("Data da consulta: " + p2.getData());
        System.out.println("Hora da consulta: " + p2.getHora());
        System.out.println("Nome do paciente: " + p2.getNomePaciente());
        System.out.println("Nome do médico: " + p2.getNomeMedico());
        System.out.println("Total de consultas agendadas: " + p2.getAmostra());    
        System.out.println("---------------------------------------");

        System.out.println("Mudando as informações da consulta 1...");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();
        System.out.println("Data da consulta: " + p1.getData());
        System.out.println("Hora da consulta: " + p1.getHora());
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        System.out.println("Nome do médico: " + p1.getNomeMedico());
        System.out.println("Total de consultas agendadas: " + p1.getAmostra());
    }
}