public class newYearChaos{
        
    public static void minimumSwaps(int[] inputArray) {
        String answer = "";
        int totalBribeCount = 0;

        int length = inputArray.length;
        HashMap<Integer, Integer> numberToSwapCountMap = new HashMap<Integer, Integer>();
        boolean allSorted = false;

        while(!allSorted) {
            boolean hasMoreSwaps = false;

            for(int i = 0; i < length - 1; i++) {

                //check if the elements are in ascending order
                if(inputArray[i] > inputArray[i + 1]) {

                    hasMoreSwaps = true;
                    // Swap
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;

                    if(!numberToSwapCountMap.containsKey(temp)) {

                        //add number to the hashmap
                        numberToSwapCountMap.put(temp, 1);
                    } 
                    
                    else {

                        int swapCount = numberToSwapCountMap.get(temp);
                        if(swapCount == 2) { 
                            answer = "too chaotic"; 
                            break; 
                        }
                        numberToSwapCountMap.put(temp, swapCount + 1);
                    }
                    totalBribeCount++;
                    
                }

                //stop sorting because the process is "too chaotic"
                if(!answer.isEmpty()) {
                    break;
                }
            }

            
            if(!hasMoreSwaps) {
                allSorted = true;
            }
        }

        if(answer.isEmpty()) {
            System.out.println(totalBribeCount);
        } else {
            System.out.println(answer);
        }
    }
}
