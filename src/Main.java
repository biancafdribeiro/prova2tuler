public class Main {
    public static void main(String[] args) {

        //usando o construtor Data()
        Data dataDigitada1 = new Data();
        System.out.println("Data formatada 1: " + dataDigitada1.mostra1());
        System.out.println("Data formatada 2: " + dataDigitada1.mostra2());
        System.out.println("Ano bissexto: " + dataDigitada1.bissexto());
        System.out.println("Dias transcorridos: " + dataDigitada1.diasTranscorridos());
        dataDigitada1.apresentaDataAtual();

        //usando o construtor Data() e mudando os valores com os métodos de entrada com parâmetros
        System.out.println("----------------------------------------");
        Data dataDigitada2 = new Data();
        dataDigitada2.setDia(15);
        dataDigitada2.setMes(12);
        dataDigitada2.setAno(2024);
        System.out.println("Modificando a data...");
        System.out.println("Data formatada 1: " + dataDigitada2.mostra1());
        System.out.println("Data formatada 2: " + dataDigitada2.mostra2());
        System.out.println("Ano bissexto: " + dataDigitada2.bissexto());
        System.out.println("Dias transcorridos: " + dataDigitada2.diasTranscorridos());
        dataDigitada2.apresentaDataAtual();

        //usando o construtor Data() e os métodos de entrada sem parâmetros
        //com esses métodos, o programa acaba pedindo para o usuário digitar a data duas vezes
        System.out.println("----------------------------------------");
        Data dataDigitada3 = new Data();
        dataDigitada3.setDia();
        dataDigitada3.setMes();
        dataDigitada3.setAno();
        System.out.println("Data após entrada do usuário...");
        System.out.println("Data formatada 1: " + dataDigitada3.mostra1());
        System.out.println("Data formatada 2: " + dataDigitada3.mostra2());
        System.out.println("Ano bissexto: " + dataDigitada3.bissexto());
        System.out.println("Dias transcorridos: " + dataDigitada3.diasTranscorridos());
        dataDigitada3.apresentaDataAtual();

        //usando o construtor Data(int d, int m, int a)
        System.out.println("----------------------------------------");
        System.out.println("Data por parâmetros: ");
        Data dataParametros = new Data(30, 9, 2021);
        System.out.println("Data formatada 1: " + dataParametros.mostra1());
        System.out.println("Data formatada 2: " + dataParametros.mostra2());
        System.out.println("Ano bissexto: " + dataParametros.bissexto());
        System.out.println("Dias transcorridos: " + dataParametros.diasTranscorridos());
        dataParametros.apresentaDataAtual();
        //usando métodos retDia, retMes e retAno
        System.out.println("Dia: " + dataParametros.getDia());
        System.out.println("Mês: " + dataParametros.getMes());
        System.out.println("Ano: " + dataParametros.getAno());
    }
}