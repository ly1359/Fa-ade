import Facade.HomeTheaterFacade;
import aparelhos.Amplificador;
import aparelhos.DVDPlayer;
import aparelhos.Projetor;

// Classe que funciona como o cliente no sistema
public class Cliente {
    public static void main(String[] args) {
        // Instanciando os objetos
        Amplificador amp = new Amplificador();
        DVDPlayer dvd = new DVDPlayer();
        Projetor projetor =  new Projetor();

        // Iniciando o facade do home theater com os dispositivos criados
        HomeTheaterFacade homeTheater = new Facade.HomeTheaterFacade(amp, dvd, projetor);

        // Inicia a exibição do filme
        homeTheater.assistirFilme("Inception");
    }
}
