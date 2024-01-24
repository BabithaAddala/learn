package slidingwindow;

public class AvgOfWindowSizeNums {

        public static double[] movingAverage(int[] arr, int windowSize) {

            double[] result = new double[arr.length-2];
            int j=0;
            int sum=0;
            double avg = 0.0;
            for(int i=0; i<windowSize; i++) {
                sum = sum+i;
            }
            avg = sum/windowSize;
            result[j]=avg;

            int count = 0;
            for (int k= windowSize; k<arr.length;k++) {
                int aggregate1 = 0;
                double avg1 = 0.0;
                if (count <= windowSize) {
                    count++;
                    aggregate1 = aggregate1 + arr[k-1];
                } else {
                    avg1 = aggregate1/count;
                    count=0;
                }
                j++;
                result[j]=avg1;
            }
            for (int i=0;i<j;i++) {
                System.out.println(result[j]);
            }

            return result;
        }
        public static void main(String[] args) {
            int[] arr = {2, 3, 1, 5, 4};
            int windowSize = 2;
            movingAverage(arr, windowSize);
        }

}
