// https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1

import java.util.List;

class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        double area = 0.0;
        switch(choice){
            case 1:double radius = arr.get(0);
            area = Math.PI * radius * radius;
                break;
            case 2: double length = arr.get(0);
            double breadth = arr.get(1);
            area = length * breadth;
                break;
            default:
                break;
        }
        return area;
    }
}