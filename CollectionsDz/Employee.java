package Javagenerics.CollectionsDz;

//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри
//        коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник
public record Employee(Integer tabelNum, Long telephoneNumber, String name, Integer experience) {

    @Override
    public String toString() {
        return "Employee{" +
                "tabelNum=" + tabelNum +
                ", telephoneNumber=" + telephoneNumber +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
