public class Main {
    public static void main(String[] args) {
        CommonArray<Object>a=new CommonArray<Object>();
        Object arr[]= new Object[4];
        arr[0]=145;
        arr[1]=1.45;
        arr[2]=0;
        arr[3]="строка";
        a.setArray(arr);
        System.out.println(a.getArrIndex(3));
    }
}
