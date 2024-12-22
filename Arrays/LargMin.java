package Arrays;

class Element{
    int elements[]={1,8,5,58,56,2,4,88};
    public void large(){
        int largest=Integer.MIN_VALUE;       //-----> iski jagah largest first ko assign kr denge which is better 
        for (int e : elements) {
            if(e>largest){
                largest=e;
            }
        }
        System.out.println("Largest element is :"+largest);
    }
    public void small(){
        int smallest=Integer.MAX_VALUE;       //-----> iski jagah smallest first ko assign kr denge which is better 
        for (int e : elements) {
            if(e<smallest){
                smallest=e;
            }
        }
        System.out.println("Smallest element is :"+smallest);
    }
}

public class LargMin {
    public static void main(String[] args) {
        Element e=new Element();
        e.large();
        e.small();
    }    
}
