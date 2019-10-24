/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author joaobaga
 */
public class LinkedNode<T> {
    private LinkedNode next;
    private T element;
    
    public LinkedNode(){
        next=null;
        element=null;
    }
    
    public LinkedNode(T element){
        next=null;
        element=element;
    }
    
    public LinkedNode getNext(){
        return next;
    }
    
    public void setNext(LinkedNode next){
        this.next=this.next;
    }
    
    public T getElement(){
        return element;
    }
    
    public void setElement(T element){
        this.element=this.element;
    }
}
