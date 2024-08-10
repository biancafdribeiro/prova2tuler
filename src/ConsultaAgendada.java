import java.util.Scanner;

public class ConsultaAgendada {
    // Atributos
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    // Construtor padrão
    //** eu não entendi se é isso mesmo nesse construtor, se precisa pedir pro usuário digitar os valores ou não?/
    public ConsultaAgendada() {
        Scanner sc = new Scanner(System.in);
        
        // Solicita dados para a data
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        this.data = new Data(dia, mes, ano);
        
        // Solicita dados para a hora
        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = sc.nextInt();
        System.out.print("Digite o segundo: ");
        int segundo = sc.nextInt();
        this.hora = new Hora(hora, minuto, segundo);
        
        // Limpa o buffer do scanner
        sc.nextLine(); // Consome a nova linha deixada pelo nextInt()
        
        // Solicita dados para o paciente e médico
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = sc.nextLine();
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = sc.nextLine();
        
        quantidade++;
    }

    // Construtor com parâmetros para hora, minuto, segundo, dia, mês, ano, paciente e médico
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    // Construtor com parâmetros para Data, Hora, paciente e médico
    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    // Métodos set para Data
    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    // Métodos set para Hora
    public void setHora(int h, int mi, int s) {
        this.hora.setHora(h);
        this.hora.setMinuto(mi);
        this.hora.setSegundo(s);
    }

    public void setHora() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = sc.nextInt();
        System.out.print("Digite o segundo: ");
        int segundo = sc.nextInt();
        
        // Atualiza o atributo hora com os novos valores
        this.hora = new Hora(hora, minuto, segundo);
    }
    

    // Métodos set para Nome do Paciente
    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = sc.nextLine();
    }

    // Métodos set para Nome do Médico
    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = sc.nextLine();
    }

    // Métodos get
    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return this.data.mostra1(); // Assumindo que mostra1() está no formato dd/mm/aaaa
    }

    public String getHora() {
        return this.hora.mostra(); // Assumindo que mostra() retorna no formato hh:mm:ss
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
}
