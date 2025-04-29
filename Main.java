public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(1, "sala");

        dispositivo.ligarOuDesligar(lampada);
        dispositivo.executar(lampada);
        dispositivo.ligarOuDesligar(lampada);
    }
}
