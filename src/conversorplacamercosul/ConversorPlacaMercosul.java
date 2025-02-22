/**
 * @versao 0.0.1
 * @data 2025-02-22
 */
package conversorplacamercosul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversorPlacaMercosul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> placas = new ArrayList<>();

        placas.addAll(new ArrayList<>(
                Arrays.asList(
                    "ABC-1234",
                    "MAA-0192",
                    "BCG-7617",
                    "FAL-7300",
                    "HAH-2774",
                    "POD-5060"
                )
            )
        );

        placas.stream()
                .map(v-> v.replace("-", ""))
                .forEach(v -> convert(v));

    }

    public static void convert(String placa) {

        Map<Character, Character> tabela = new HashMap<>();

        tabela.put('0', 'A');
        tabela.put('1', 'B');
        tabela.put('2', 'C');
        tabela.put('3', 'D');
        tabela.put('4', 'E');
        tabela.put('5', 'F');
        tabela.put('6', 'G');
        tabela.put('7', 'H');
        tabela.put('8', 'I');
        tabela.put('9', 'J');

        char[] chars = placa.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i == 4) {
                System.out.print(tabela.get(chars[i]));
            } else {
                System.out.print(chars[i]);
            }
        }
        System.out.println();

    }

}
