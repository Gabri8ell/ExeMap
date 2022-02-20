package EstadosBR;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, Double> estadosNE = new HashMap<>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};

        System.out.println(estadosNE);

        System.out.println("\nSubstitua a população do RN por 3.534165");
        estadosNE.put("RN", 3.534165);
        System.out.println(estadosNE);

        System.out.println("\nConferir se o estado da PB está está no Map");
        System.out.println("\nAdicionar estado PB ao Map");
        System.out.println(estadosNE.containsKey("PB"));
        estadosNE.put("PB", 4.039277);
        System.out.println(estadosNE);

        System.out.println("\nPopulação do PE: " + estadosNE.get("PE"));

        System.out.println("\nOrdem de inserção");
        Map<String, Double> estaddosNE1 = new LinkedHashMap<>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};
        System.out.println(estaddosNE1);

        System.out.println("\nImprimir estados e população pela ordem alfabética");

        Map<String, Double> estadosNE2 = new TreeMap<>(estadosNE);
        System.out.println(estadosNE2);

        System.out.println("\nEstado com menor população: ");
        Set<Map.Entry<String, Double>> entry = estadosNE2.entrySet();

        Double menorPop = Collections.min(estadosNE2.values());

        for (Map.Entry<String, Double> estados: entry) {
            if(menorPop.equals(estados.getValue())){
                System.out.print(estados.getKey() + " - " + estados.getValue());
                break;
            }
        }

        System.out.println("\n\nEstado com maior população: ");
        //Set<Map.Entry<String, Double>> entry = estadosNE2.entrySet();

        Double maiorPop = Collections.max(estadosNE2.values());

        for (Map.Entry<String, Double> estados: entry) {
            if(maiorPop.equals(estados.getValue())){
                System.out.print(estados.getKey() + " - " + estados.getValue());
                break;
            }
        }

        System.out.println("\n\nPopulação média do NE: ");
        Double totalPop = 0d;
        int totalEst = 0;

        for (Map.Entry<String, Double> estados: entry) {
            totalPop += estados.getValue();
            totalEst++;
        }

        System.out.println(totalPop / totalEst + "\n");

        System.out.println("\nRemove estados com população menor que 4.000.000.\n");

        entry.removeIf(estados -> estados.getValue() < 4.000000);

        System.out.println(estadosNE2);//A entry foi criáda tendo como refernecia estadosNE2

        System.out.println("\nApagar dicionário de Estados do NE.");
        estadosNE2.clear();

        System.out.println("\nDicionário está vazio? " + estadosNE.isEmpty());
        System.out.println("\nDicionário está vazio? " + estadosNE2.isEmpty());














    }
}
