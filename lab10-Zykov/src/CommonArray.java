public class CommonArray<E> {
    private E [] a;


    E getArrIndex(int i){
        return  a[i] ;
    }

    public void setArray(E [] a){
        this.a = a;
    }
    public int getLength(){
        return  a.length ;
    }
}
