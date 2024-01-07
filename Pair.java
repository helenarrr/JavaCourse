package Javagenerics;

// 3)
// Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы getFirst(), getSecond()
// для получения значений каждого из составляющих пары,
// а также переопределение метода toString(), возвращающее строковое представление пары.


public class Pair<T1, T2> {
    T1 val1;
    T2 val2;

    public Pair(T1 val1, T2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }


    public T1 getFirst() {
        return val1;
    }

    public T2 getSecond() {
        return val2;
    }

    @Override
    public String toString() {
        return val1 + " " + val2;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Значение", 2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
