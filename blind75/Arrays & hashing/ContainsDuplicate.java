class ContainsDuplicate{
    public boolean ContainsDuplicate (int [] nums){
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j <nums.length; j++){
                if (nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }

public static void main (String [] args){
    ContainsDuplicate cd = new ContainsDuplicate();
    int[] nums={1,2,3,4,4};
    System.out.println(cd.ContainsDuplicate(nums));
}
}



/*
This Java program checks whether an integer array contains any duplicate values.
The class is named ContainsDuplicate, and inside it there is a method called ContainsDuplicate that takes an integer 
array as input and returns a boolean value. The method uses two nested for loops to compare each element of the array 
with every other element that comes after it. The outer loop selects one element at a time using index i,
while the inner loop starts from i + 1 using index j, ensuring that the same pair of elements is not compared twice.
During each comparison, if nums[i] is equal to nums[j], it means a duplicate has been found, 
and the method immediately returns true. If the loops finish running without finding any matching values, 
the method returns false, indicating that all elements in the array are unique. The main method is the entry point of the program. 
Inside main, an object of the ContainsDuplicate class is created because the duplicate-checking method is not static.
An integer array {1, 2, 3, 4, 4} is then defined and passed to the ContainsDuplicate method.
Since the number 4 appears twice in the array, the method returns true, and this result is printed to the console. 
This approach works correctly but has a time complexity of O(n²) because it compares every pair of elements in the array.
*/

