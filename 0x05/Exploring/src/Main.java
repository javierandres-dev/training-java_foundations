import java.util.Map;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // aboutmaps();
        // aboutGenerics();
        // aboutList();
        // aboutStack();
        aboutQueue();
    }

    private static void aboutmaps() {
        // Definir un Hashmap
        Map<String, Integer> myHashMap = new HashMap<>();

        /* Principales métodos */
        // put: agregar elementos al map
        myHashMap.put("monitor", 300);
        myHashMap.put("keyboard", 200);
        myHashMap.put("mouse", 100);
        // get: retorna el valor correspondiente a una clave dada
        System.out.println(myHashMap.get("keyboard"));
        // remove: elimina un elemento del map de acuerdo con una clave dada
        System.out.println(myHashMap.remove("keyboard"));
        // containsKey: retorna un booleano de acuerdo si el map contiene una clave
        System.out.println(myHashMap.containsKey("monitor"));
        // containsValue: retorna un booleano de acuerdo si el map contiene un valor
        System.out.println(myHashMap.containsValue(300));
        // values: retorna los valores que existen en el map
        System.out.println(myHashMap.values());
        // isEmpty: retorna true si no existen elementos en el map, o false en caso
        // contrario
        System.out.println(myHashMap.isEmpty());
        // size: retorna la cantidad de elementos del map
        System.out.println(myHashMap.size());
        // clear: elimina todos los elementos del map
        myHashMap.clear();
    }

    private static void aboutGenerics() {
        // instancia de objetos genéricos con diferente tipo de argumento
        AboutGenerics<String> obj1 = new AboutGenerics<String>("works");
        AboutGenerics<Integer> obj2 = new AboutGenerics<Integer>(10);

        // usando el método de la clase
        System.out.println(obj1.getObject());
        System.out.println(obj2.getObject());
    }

    private static void aboutList() {
        // Definir un objeto de interface List
        List<String> mylist = new ArrayList<>();

        /* principales métodos */
        // add: permite agregar un elemento a la lista
        mylist.add("monitor");
        mylist.add("keyboard");
        mylist.add("mouse");
        System.out.println(mylist);
        // set: permite actualizar un elemento de la lista
        mylist.set(1, "batery");
        System.out.println(mylist);
        // indexOf y lastIndexOf: permiten encontrar un elemento en la lista
        System.out.println(mylist.indexOf("batery"));
        // remove: permite eliminar un elemento de la lista
        mylist.remove(1);
        System.out.println(mylist);
        // get: permite el acceso a un elemnto de la lista
        System.out.println(mylist.get(1));
        // contains: verifica si un elemento existe en la lista
        System.out.println(mylist.contains("keyboard"));
    }

    private static void aboutStack() {
        // Definir un objeto de tipo stack
        Stack<String> myStack = new Stack<String>();
        /* principales métodos */
        // push: permite agregar un elemento a la pila
        myStack.push("monitor");
        myStack.push("keyboard");
        myStack.push("mouse");
        System.out.println(myStack);
        // pop: elimina el último elemento de la pila
        myStack.pop();
        System.out.println(myStack);
        // isEmpty: verifica si la pila está vacía
        System.out.println(myStack.isEmpty());
        // peek: retorna el último elemento de la pila
        System.out.println(myStack.peek());
        // size: retorna la cantidad de elementos de la pila
        System.out.println(myStack.size());
    }

    private static void aboutQueue() {
        // Definir un objeto de tipo stack
        Queue<String> myQueue = new LinkedList<>();
        /* principales métodos */
        // add: permite agregar un elemento
        myQueue.add("monitor");
        myQueue.add("keyboard");
        myQueue.add("mouse");
        System.out.println(myQueue);
        // offer: permite agregar un elemento
        myQueue.add("batery");
        System.out.println(myQueue);
        // element: retorna el primer elemento
        System.out.println(myQueue.element());
        // peek: retorna el primer elemento
        System.out.println(myQueue.peek());
        // remove: retorna y elimina el primer elemento
        System.out.println(myQueue.remove());
        System.out.println(myQueue);
        // poll: retorna y elimina el primer elemento
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
    }
}

class AboutGenerics<T> {
    // Declaro un objeto de tipo genérico
    T obj;

    // constructor
    AboutGenerics(T obj) {
        this.obj = obj;
    }

    // método
    public T getObject() {
        return this.obj;
    }
}
