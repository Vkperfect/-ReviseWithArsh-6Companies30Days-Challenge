class Solve {
    int[] findTwoElement(int arr[], int N) {
        // code here
        int[] result = new int[2];

        for (int i = 0; i < N; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] > 0) {
                arr[index] = -arr[index];
            } else {
                result[0] = index + 1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
        
    }
}
