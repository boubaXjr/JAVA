public class tableau {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9};

        double somme = 0;
        for (int value : tab){
            somme +=value;
        }

        double moyenne = somme / tab.length;
        System.out.println("la moyenne est: " + moyenne);

        Arrays.sort(tab);
        double mediane;
        if (tab.length % 2 ==  0){
            mediane = (tab[tab.length / 2] + tab[tab.length / 2 - 1]) / 2.0;
        }else{
            mediane = tab[tab.lenght / 2];
        }
        System.out.println("La médiane est: " + mediane);

        double variance = 0;
        for (int value : tab){
            variance += math.pow(value - moyenne, 2);
        }
        double stddev = math.sqrt(variance / tab.length);
        System.out.println("ecart-type: " + stddev);

        System.out.println("min: " + tab[0]);
        System.out.println("max: " + tab[tab.length - 1]);


    }
}
