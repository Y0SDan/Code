class Pair(T, U){
    private final T first;
    private final U second;

    public Pair(T firstm U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){ return first; }
    public U getSecond(){ return second; }
}

public class PairExample
    public static void main(String[] args){
        
        Pair <String, Integer> pair = new Pair <String, Integer> ("one",2);

        // no acepta tipos de datos básicos o primitivos
        //Pair<String, int> pair2 = new Pair<String, Integer>("one",2);
        // siguiente linea generarı́a un warning de seguridad de tipos
        //Pair<String, Integer> pair3 = new Pair("one",2);

        System.out.println("Obtén primer elemento: " + pair.get.getFirst());
        System.out.println("Obtén segundo elemento: " + pair.getSecond());
    }