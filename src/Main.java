import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość liczb w zbiorze: ");
        int pula = scanner.nextInt();
        System.out.print("Podaj szukaną liczbę: ");
        int element = scanner.nextInt();

        int lewy, prawy, srodek;
        Random rand = new Random();

        for (int i = 0; i < pula; i++) {
            list.add(rand.nextInt(20));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        lewy = 0;
        prawy = (list.size() - 1);
        System.out.println("Szukany element to: " + element);
        boolean flag = false;
        do {
//            printList(list,lewy,prawy); //do sprawdzenia
            if (lewy > prawy) {
                System.out.println("Nie odnaleziono elementu w tablicy.");
                flag = true;
            } else {
                srodek = (lewy + prawy) / 2;
                if (list.get(srodek) == element) {
                    System.out.println("Znaleziono element w tablicy pod indeksem " + srodek);
                    flag = true;
                } else {
                    if (list.get(srodek) < element) {
                        lewy = srodek + 1;
                    } else {
                        prawy = srodek - 1;
                    }
                }
            }
        } while (flag == false);
    }

    private static void printList(List list, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
