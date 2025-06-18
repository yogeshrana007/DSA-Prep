package StackP;
import java.util.ArrayList;
public class UsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public  void push(int data){
            list.add(data);
        }
        //pop
        public  int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        s.push(3);
        s.push(2);
        s.push(1);
        s.pop();
        System.out.println(s.isEmpty());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
