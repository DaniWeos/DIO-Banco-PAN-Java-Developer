public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A Tv esta ligada! " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A Tv esta desligada! " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(88);

        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
