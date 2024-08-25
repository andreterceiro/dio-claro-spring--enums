public class Executor {
    public static void main(String[] args) {
        Teste teste = new Teste(1,2);
        teste.print();
        teste.setA(3);
        teste.setB(4);
        teste.print();

        String SAO_PAULO = EstadoEnum.SAO_PAULO.getNome();
        System.out.println(SAO_PAULO);

        String SIGLA_SAO_PAULO = EstadoEnum.SAO_PAULO.getSigla();
        System.out.println(SIGLA_SAO_PAULO);

    }
}