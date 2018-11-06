package vn.codegym.QuyenLeSy;

public class BinarySearch {
    static int[] listA = {2,4,5,8,9,11,13,15,24,27,30,36,39};

    static int binarySearch(int[] list, int key, int left, int right){
        if(left < right) {
            int mid = (left + right) / 2;

            if (list[mid] == key) return list[mid];
            if (list[mid] > key) return binarySearch(list, key, left, mid - 1);
            return binarySearch(list, key, mid + 1, right);
        }

        return -1;
    }
}
