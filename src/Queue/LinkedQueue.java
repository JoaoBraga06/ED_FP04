/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;


/**
 *
 * @author joaobaga
 * 
 */
public class LinkedQueue<T> implements QueueADT<T> {
    private LinkedNode front, rear;
    int count;
    
    public LinkedQueue(){
        front=null;
        rear=null;
        count=0;
    }
    
    @Override
    public void enqueue(T element){
        LinkedNode node = new LinkedNode(element);
        
        if(count==0){
            front=node;
            rear=node;
        }
        else{
            LinkedNode temp=rear;
            rear=node;
            temp.setNext(rear);
        }
        count++;
    }
    
    @Override
    public T dequeue(){
        try{
            if(isEmpty())
                throw new EmptyCollectionException();
            
            T element = (T)front.getElement();
            front=front.getNext();
            count--;
            
        }catch(EmptyCollecitonException e){}
                
        return element;
    }
    
    @Override
    public T first(){
////        return front.getElement();
return null;
    }
    
    public boolean isEmpty(){
        return (count==0);
    }
    
    @Override
    public int size(){
        return count;
    }
    
    @Override
    public String toString(){
        try{
            if(isEmpty())
                throw new EmptyColleticonException();
            
            LinkedNode temp = front;
            String resultado;
            while(temp!=null){
                resultado += temp.getElement().toString();
                temp=temp.getNext();
            }
           
            return resultado;
                    
        }catch(EmptyColleticonException e){}

    }
    
}
