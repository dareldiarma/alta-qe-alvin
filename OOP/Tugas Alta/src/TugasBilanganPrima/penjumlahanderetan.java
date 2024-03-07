package TugasBilanganPrima;

public class penjumlahanderetan {
    public static void main(String[] args) {
        float[] array = {5, 8, 3, 7};
        float mean = calculateMean(array);
        System.out.println("Mean dari array adalah: " + mean);
        int roundmean = Math.round(mean);
        System.out.println("Hasil pembulatan mean adalah " + roundmean);
    }
    public static float calculateMean(float[] array) {
        int sum = 0;
        for (float num : array) {
            sum += num;
        }
        return (float) sum / array.length;
    }
}
