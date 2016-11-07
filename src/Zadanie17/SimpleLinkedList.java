package Zadanie17;

import org.apache.log4j.Logger;

/**
 * Created by Acer5740 on 07.11.2016.
 */
public class SimpleLinkedList {

    Element start;
    Element end;
    int quantity;

    public void pushBack(String value){
        if (quantity == 0) {
            start = end = new Element(value);
        }
        else {
            end = end.add(value);
        }
        quantity++;
    }

    public void pushFront (String value){
        if (quantity == 0){
            start = end = new Element(value);
        }
        else {
            Element newElement = new Element(value);
            newElement.next = start;
            start = newElement;
        }
        quantity++;
    }

    @Override
    public String toString(){
        String result = "";
        Element currentElement = start;
        while (currentElement!=null){
            result+=currentElement.value + " ";
            currentElement = currentElement.next;
        }
        return result;
    }

    public int returnSize (){
        return quantity;
    }

    public static void revert(SimpleLinkedList reverse){
        Element currentElement = reverse.start;
        Element prevElement = null;
        while (currentElement!=null){
            if (prevElement == null){
                prevElement = currentElement;
                currentElement = currentElement.next;
            }
            else {
                Element tmpNext = currentElement.next;
                currentElement.next = prevElement;
                prevElement = currentElement;
                currentElement = tmpNext;
            }
        }
        Element tmp = reverse.start;
        reverse.start = reverse.end;
        reverse.end = tmp;
        if (reverse.end!=null){
        reverse.end.next = null;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        for (Integer i = 0; i<10; i++){
            if (i%2==0){
                simpleLinkedList.pushBack(i.toString());
            }
            else simpleLinkedList.pushFront(i.toString());
        }
        Logger logger = Logger.getLogger(SimpleLinkedList.class.getName());
        logger.info(simpleLinkedList.toString());
        revert(simpleLinkedList);
        logger.info(simpleLinkedList.toString());

    }
}
