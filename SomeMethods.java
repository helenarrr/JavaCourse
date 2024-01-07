package Javagenerics;

// 2)
// Напишите обобщенный метод compareArrays(),который принимает два массива и возвращает true,если они одинаковые,и false в противном случае.
// Массивы могут быть любого типа данных,но должны иметь одинаковую длину и содержать элементы одного типа по парно.

import java.util.ArrayList;

public class SomeMethods {


    static <T1, T2> boolean compareArrays(ArrayList<T1> arrayList1, ArrayList<T2> arrayList2) {

        boolean flag;
        if (arrayList1.size() == arrayList2.size()) {
            flag = true;
            for (int i = 0; i < arrayList1.size(); i++) {
                if (!arrayList1.get(i).getClass().equals(arrayList2.get(i).getClass()) && !arrayList1.get(i).equals(arrayList2.get(i))) {
                    flag = false;
                    break;
                }
            }
        } else throw new RuntimeException("Массивы нельзя сравнить, их длины не равны!");

        return flag;
    }

    public static void main(String[] args) {

        ArrayList<Object> arrayList1 = new ArrayList<>();
        arrayList1.add("1");
        arrayList1.add(2);

        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add("2");
        System.out.println(compareArrays(arrayList1, arrayList2));
    }

}
