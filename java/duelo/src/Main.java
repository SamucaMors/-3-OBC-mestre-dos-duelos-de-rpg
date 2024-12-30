import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Object> guerreiro = Map.of(
                "nome", "Thor",
                "classe", "Guerreiro",
                "vida", 100,
                "poder", 20
        );
        Map<String, Object> mago = Map.of(
                "nome", "Gandalf",
                "classe", "Mago",
                "vida", 80,
                "poder", 25
        );

        String resultado = iniciarDuelo(mago, guerreiro);
        System.out.println(resultado);

    }
    public static String iniciarDuelo(Map<String, Object> lutador1, Map<String, Object> lutador2){
        String nome1 = (String) lutador1.get("nome");
        String nome2 = (String) lutador2.get("nome");
        int vida1 = (int) lutador1.get("vida");
        int vida2 = (int) lutador2.get("vida");
        int poder1 = (int) lutador1.get("poder");
        int poder2 = (int) lutador2.get("poder");

        while(vida1>0 && vida2 >0){
            vida2 -= poder1;
            if(vida2<=0){
                return nome1 + " 🏆 venceu o duelo!";
            }
            vida1 -= poder2;
            if(vida1<=0){
                return nome2 + " 🏆 venceu o duelo!";
            }
        }

        return "O duelo terminou sem vencedores.";
    }
}