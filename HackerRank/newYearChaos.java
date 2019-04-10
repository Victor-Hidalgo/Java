public class newYearChaos{
        
        public static void minimumSwaps(int[] inputArray) {
                String answer = "";
                int totalBribeCount = 0;

                int length = inputArray.length;
                HashMap<Integer, Integer> numberToSwapCountMap = new HashMap<Integer, Integer>();
                boolean hasAllSorted = false;

                while(!hasAllSorted) {
                    boolean hasMoreSwaps = false;

                    for(int i = 0; i < length - 1; i++) {
                        if(inputArray[i] > inputArray[i + 1]) {
                            hasMoreSwaps = true;
                            // Swap
                            int temp = inputArray[i];
                            inputArray[i] = inputArray[i + 1];
                            inputArray[i + 1] = temp;

                            if(!numberToSwapCountMap.containsKey(temp)) {
                                numberToSwapCountMap.put(temp, 1);
                            } else {
                                int swapCount = numberToSwapCountMap.get(temp);
                                if(swapCount == 2) { 
                                    answer = "Impossible"; 
                                    break; 
                                }
                                numberToSwapCountMap.put(temp, swapCount + 1);
                            }
                            totalBribeCount++;
                            //System.out.printf("Index: %d\n", i);
                            //System.out.printf("Swaps: %d\n", totalBribeCount);
                        }

                        if(!answer.isEmpty()) {
                            break;
                        }
                    }

                    if(!hasMoreSwaps) {
                        hasAllSorted = true;
                    }
                    // Print inputArray's state.
                    /*for(int i = 0; i < length; i++) {
                        System.out.print(inputArray[i]);
                        System.out.print(" ");
                    }
                    System.out.println();*/
                }

                if(answer.isEmpty()) {
                    System.out.println(totalBribeCount);
                } else {
                    System.out.println(answer);
                }
            }
}
