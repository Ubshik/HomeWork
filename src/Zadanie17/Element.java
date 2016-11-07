package Zadanie17;

/**
 * Created by Acer5740 on 07.11.2016.
 */
public class Element {
    Element next;
    String value;

    Element (String value){
        this.next = null;
        this.value = value;
    }

    Element add(String value) {
        if (next == null){
            next = new Element(value);
            return next;
        }
        else {
            Element newElement = new Element(value);
            newElement.next = this.next;
            next = newElement;
            return newElement;
        }
    }
}


