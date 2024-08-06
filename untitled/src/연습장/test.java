package 연습장;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr2[] = {4,5,6};

        System.arraycopy(arr,0,arr2,1,2);

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr2[1]);
        arr[0] = 34;
        System.out.println(arr2[1]);

        String str[] = {"ab", "cd", "aff", "c"};

        for(String lang : str){
            System.out.println(lang);
        }


        // add 메소드를 통해 요소 값 추가, size 메소드로 크기 확인
        // 배열의 길이를 미리 지정할 필요가 사라진다.
        // get 메소드로 객체 하나를 가져온다.
    }
}
