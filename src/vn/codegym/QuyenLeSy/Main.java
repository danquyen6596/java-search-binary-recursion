package vn.codegym.QuyenLeSy;

import static vn.codegym.QuyenLeSy.BinarySearch.listA;

public class Main {
    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(listA,1,0,listA.length-1));
        System.out.println(BinarySearch.binarySearch(listA,5,0,listA.length-1));
        System.out.println(BinarySearch.binarySearch(listA,14,0,listA.length-1));
        System.out.println(BinarySearch.binarySearch(listA,27,0,listA.length-1));
        System.out.println(BinarySearch.binarySearch(listA,32,0,listA.length-1));
        System.out.println(BinarySearch.binarySearch(listA,9,0,listA.length-1));

    }
}
