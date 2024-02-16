package com.example.myapplication.Easy

class MoveZeros {
    fun moveZeroes(nums: IntArray): Unit {
        //We create a variable for the positions with a 0
        var index = 0
        // We iterate over the array from 0 in a range according to the array indices
        for (i in nums.indices){
            // If the number in the current position is not a zero, we join
            if(nums[i] != 0){
                // If the element in the position is not a zero we replace the
                // array position were there is a zero (according to index value)
                // with the current position value
                nums[index] = nums[i]
                if(i != index) {
                    //We put the zero value in the current array position
                    nums[i] = 0
                }
                // Increment the index
                index++
            }
        }
    }
}