import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> temperatura = new ArrayList<>();
        temperatura.add(30.0);
        temperatura.add(31.4);
        temperatura.add(33.5);
        temperatura.add(37.2);
        temperatura.add(27.0);
        temperatura.add(29.0);

        System.out.println("Média Semestral das temperaturas: ");
        Iterator<Double> iterator = temperatura.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma / temperatura.size();
        System.out.println(media);

        System.out.println("Apresentação das temperaturas que estiveram acima da média nos últimos 6 meses: ");
        Iterator<Double> iterator1 = temperatura.iterator();
        Double b = media;
        List<Double> acima = new ArrayList<>();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next > b) {
                acima.add(next);
            }
        }
        System.out.println(acima);

    }
}
