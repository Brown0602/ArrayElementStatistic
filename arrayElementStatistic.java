public class ArrayElementStatistic {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        double arrayLength = array.length;
        int[] unique = new int[array.length];
        int uniqueNumber = 0;
        int proverka = 0;
        int cout = 0;
        double counts = 0.0;
        int resultsNumber = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    uniqueNumber = array[i];
                    if (proverka != uniqueNumber) {
                        proverka = uniqueNumber;
                        for (int k = 0; k < unique.length; k++) {
                            if (unique[k] == 0) {
                                unique[k] = proverka;
                                break;
                            }
                        }
                    }
                }
            }
        }

        for (int t = 0; t < unique.length; t++) {
            for (int e = 0; e < unique.length; e++) {
                if (unique[t] == unique[e]) {
                    cout++;
                    if (cout > 1) {
                        unique[e] = 0;
                        break;
                    }
                }
            }
            cout = 0;
        }

        for (int b = 0; b < unique.length; b++) {
            for (int z = 0; z < array.length; z++) {
                if (array[z] == unique[b]) {
                    counts++;
                }
            }
            if (unique[b] != 0 && unique[b] > 0 || unique[b] < 0) {
                resultsNumber = unique[b];
                counts *= 100 / arrayLength;
                System.out.println(resultsNumber + " = " + counts + "%");
                counts = 0;
            }
        }
    }
}