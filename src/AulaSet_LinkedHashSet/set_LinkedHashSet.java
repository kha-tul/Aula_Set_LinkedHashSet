package AulaSet_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

///LinkedHashSet mantém a ordem natural conforme os elementos foram inseridos.
//

public class set_LinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumeria = new LinkedHashSet<>();
            sequenciaNumeria.add(1);
            sequenciaNumeria.add(2);
            sequenciaNumeria.add(4);
            sequenciaNumeria.add(0);
            sequenciaNumeria.add(16);

        System.out.println(sequenciaNumeria);

        //Remove numero do set
        sequenciaNumeria.remove(4);
        System.out.println(sequenciaNumeria);

        //Retorna a quantidade de itens do set
        System.out.println(sequenciaNumeria.size());

        //Navegacao
        Iterator<Integer> iterator = sequenciaNumeria.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer numero: sequenciaNumeria) {
            System.out.println(numero);
        }

        System.out.println(sequenciaNumeria.isEmpty());
    }
}
