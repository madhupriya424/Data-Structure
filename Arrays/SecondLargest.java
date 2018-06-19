
int largest = arr[0];
int secondLargest = Integer.MIN_VALUE;

for(int i = 1; i<arr.length(); i++){
    if(arr[i] > largest){                     //for first lar
        secondLargest = largest;
        largest = arr[i];
    }
    else if(arr[i] <= largest && arr[i] > secondLargest){
        secondLargest = arr[i];                              //for second lar
    }
}


10 8 6 18 17 25     i       largest             secondLargest
                    0        10                    -218934
                    1        10                       8             
                    2         10                      8   
                    3         18                      10 
                    4          18                     17
                    5          25                      18                



time: O(n)
