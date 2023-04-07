import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//1210505035 Emirhan Şimşek Alfa Beta Budama Örnek ile Açıklama
public class AlfaBetaBudama {

    // Arama ağacındaki maksimum derinlik tanımlanıyor
    private static final int MAX_DERINLIK = 6;

    public static int alfaBetaBudama(Node node, int derinlik, int alfa, int beta, boolean maksimumOyuncu) {

        // Eğer mevcut düğüm yaprağa denk geliyorsa veya maksimum derinliğe ulaşılmışsa, düğümün değerini döndür
        if (derinlik == MAX_DERINLIK || node.isYaprak()) {
            return node.getDeger();
        }

        // Eğer maksimum (En Yüksek) oyuncunun sırasıysa
        if (maksimumOyuncu) {
            int maksimumDeger = Integer.MIN_VALUE;
            for (Node cocuk : node.getCocuklar()) {
                int deger = alfaBetaBudama(cocuk, derinlik + 1, alfa, beta, false);
                maksimumDeger = Math.max(maksimumDeger, deger);
                alfa = Math.max(alfa, deger);
                if (beta <= alfa) {
                    break;
                }
            }
            return maksimumDeger;
        }
        // Eğer minimum (En düşük) oyuncunun sırasıysa
        else {
            int minimumDeger = Integer.MAX_VALUE;
            for (Node cocuk : node.getCocuklar()) {
                int deger = alfaBetaBudama(cocuk, derinlik + 1, alfa, beta, true);
                minimumDeger = Math.min(minimumDeger, deger);
                beta = Math.min(beta, deger);
                if (beta <= alfa) {
                    break;
                }
            }
            return minimumDeger;
        }
    }

    // Düğüm sınıfı tanımlanıyor ( Ağaç Yaprakları )
    private static class Node {
        private int deger;
        private List<Node> cocuklar;

        public Node(int deger, List<Node> cocuklar) {
            this.deger = deger;
            this.cocuklar = cocuklar;
        }

        public int getDeger() {
            return deger;
        }

        public List<Node> getCocuklar() {
            return cocuklar;
        }

        public boolean isYaprak() {
            return cocuklar.isEmpty();
        }
    }

    // Örnek kullanım
    public static void main(String[] args) {
        // Bir örnek ağaç oluşturuluyor
        Node n1 = new Node(3, Arrays.asList(new Node(4, Arrays.asList(new Node(6, Collections.emptyList()), new Node(7, Collections.emptyList()))), new Node(5, Arrays.asList(new Node(8, Collections.emptyList()), new Node(9, Collections.emptyList())))));

        // Alfa-beta budama algoritması kök düğümden başlayarak ağaç üzerinde uygulanıyor
        int sonuc = alfaBetaBudama(n1, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);

        // Sonuç ekrana yazdırılıyor
        System.out.println("Alfa Beta Budama Algoritması Sonucu: " + sonuc);
    }
}
