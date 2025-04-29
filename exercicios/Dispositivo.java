abstract class Dispositivo implements Conectavel {
    protected int id;
    protected String nome;
    protected boolean ligado;

    public Dispositivo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.ligado = false;
    }

    @Override
    public void conectar() {
        ligado = true;
        System.out.println(nome + " conectado.");
    }

    @Override
    public void desconectar() {
        ligado = false;
        System.out.println(nome + " desconectado.");
    }

    public void ligarOuDesligar(Dispositivo dispositivo) {
        if (dispositivo.ligado) {
            dispositivo.desconectar();
        } else {
            dispositivo.conectar();
        }
    }

    public abstract void executarAcao();

    public void executar(Dispositivo dispositivo) {
        dispositivo.executarAcao();
    }
}