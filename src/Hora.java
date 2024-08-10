import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor com parâmetros
    public Hora(int h, int mi, int s) {
        this.hora = h;
        this.minuto = mi;
        this.segundo = s;
    }

    // Construtor padrão
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Métodos set para Hora, Minuto e Segundo com parâmetros
    public void setHora(int h) {
        this.hora = h;
    }

    public void setMinuto(int mi) {
        this.minuto = mi;
    }

    public void setSegundo(int s) {
        this.segundo = s;
    }

    // Métodos set sem parâmetros (opcional)
    public void setHora() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        this.hora = sc.nextInt();
    }

    public void setMinuto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o minuto: ");
        this.minuto = sc.nextInt();
    }

    public void setSegundo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o segundo: ");
        this.segundo = sc.nextInt();
    }

    // Método para mostrar a hora no formato hh:mm:ss
    public String mostra() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
