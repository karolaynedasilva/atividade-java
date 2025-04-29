class Lampada extends Dispositivo {
    public Lampada(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void executarAcao() {
        if (ligado) {
            System.out.println("Lampada " + nome + " acendeu.");
        } else {
            System.out.println("Lampada " + nome + " esta desligada.");
        }
    }
}
