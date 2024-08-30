import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        aboutmaps();
        aboutGenerics();
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
