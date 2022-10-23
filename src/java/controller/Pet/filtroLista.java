/**package controller.Pet;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import model.Pet;


public class filtroLista {
    public static void filtroLista(String[] args) {
        List<List<Pet>> listaDeListas = Arrays.asList(Arrays.asList(new Pet("cachorro")),Arrays.asList(new Pet("gato")));
        
        Predicate<Pet> filtroProduto = p -> p.getRacaPet().equalsIgnoreCase("cachorro");

        List<Pet> listaComOcorrencia = listaDeListas.stream()
                                            .flatMap(List::stream)
                                            .filter(filtroProduto)
                                            .collect(Collectors.toList());
        System.out.println(listaComOcorrencia);

        // Recupera a contagem de produtos com o critério
        long count = listaDeListas.stream()
                        .flatMap(List::stream)
                        .filter(filtroProduto)
                        .count();
        System.out.println(count);
    }

    @Data
    @RequiredArgsConstructor
    public static class Produto {
        private final String nome;
    }
}
**/
