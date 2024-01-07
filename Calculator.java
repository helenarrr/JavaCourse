package Javagenerics;

// 1)
// Написать класс Калькулятор(необобщенный),который содержит обобщенные статические методы:sum(),multiply(),divide(),subtract().
// Параметры этих методов – два числа разного типа,над которыми должна быть произведена операция.


class Calculator {

    static <T extends Number> double sumNumber(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    static <T extends Number> double multiplyNumber(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
    static <T extends Number> double divideNumber(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new RuntimeException("Делить на ноль нельзя!");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    static <T extends Number> double subtractNumber(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }


    public static void main(String[] args) {
        System.out.println(divideNumber(1,0));
    }

}



