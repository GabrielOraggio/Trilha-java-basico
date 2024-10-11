public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV está Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("TV está Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV está Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " +smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume: " +smartTv.volume);
        
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(24);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}