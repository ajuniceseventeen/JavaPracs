package lab13.task3;

public class Test {
    public static void main(String[] args) {
        var address = new Address();
        address.setAddressOnlyComma("Россия, Московская область, Москва, проспект Вернадского, 1, 2, 3");
        System.out.println(address);
        address.setAddress("Российская федерация. Ростовская область. Ростов-на-дону. улица Ленина. 1, 2, 3");
        System.out.println(address);
        address.setAddressOnlyComma("США, штат, город, улица, 5, 2, 1");
        System.out.println(address);
        address.setAddress("Китай; Регион 12919; Пекин. улица 1941249. 555. 1515, 2414141");
        System.out.println(address);
    }
}

/* Доработать класс адреса, который из полученной строки
    формата “Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира”
    ([d] – разделитель, например, «запятая») выбирает соответствующие части и
    записывает их в соответствующие поля класса Address. Учесть, что в начале и
    конце разобранной части адреса не должно быть пробелов. Все поля адреса
    строковые. Разработать проверочный класс не менее чем на четыре адресных
    строки. */