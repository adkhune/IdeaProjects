package ds;

public class BasicStack<X> implements Stack<X>{
    private X[] data; //this will hold the stack data
    private int stackPointer;

    public BasicStack() {
        data = (X []) new Object[1000]; // Initialize he data structure to a new object array of 1000, and cast it back to our generic X type. this is a limitation
        stackPointer = 0; //internal pointer of our data structure
    }


    public void push(X newItem){
        data[stackPointer++] = newItem; //post increment, stackPinter will get incremented after the assigning operation

    }

    public X pop(){

        if(stackPointer == 0) {
            throw new IllegalStateException("No more items on the stock");
        }
        return data[--stackPointer]; //pre decrement
    }

    public boolean contains(X item){
        boolean found = false;
        for(int i=0; i < stackPointer; i++){
            if(data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(X item){
        while(stackPointer > 0){
            X tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("could not find item on stack: " + item);
    }

    public int size(){
        return stackPointer;
    }
}
