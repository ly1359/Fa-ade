package Facade;
import aparelhos.Amplificador;
import aparelhos.DVDPlayer;
import aparelhos.Projetor;

public class HomeTheaterFacade {
    // Declaração dos Aparelhos
    private Amplificador amplificador;
    private DVDPlayer dvd;
    private Projetor projetor;

    // Construtor da classe
    public HomeTheaterFacade(Amplificador amp, DVDPlayer dvd, Projetor projetor) {
        this.amplificador = amp;
        this.dvd = dvd;
        this.projetor = projetor;
    }

    // Método para assistir a um filme
    // Responsavel por encapsular as operações
    public void assistirFilme(String filme) {
        dvd.ligar();
        amplificador.ligar();
        amplificador.setVolume(5);
        projetor.ligar();
        dvd.play(filme);
        projetor.ajustaTela();;
    }
}
