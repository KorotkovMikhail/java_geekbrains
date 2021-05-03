package lesson5;

public class HomeWorkApp {

    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Иванов Иван Иваныч", "Генеральный директор", "iii@mail.ru", "89991111111", 100000, 45);
        personArray[1] = new Person("Петров Петр Петрович", "Заместитель генерального директора", "ppp@mail.ru", "89992222222", 90000, 42);
        personArray[2] = new Person("Сергеев Сергей Сергеевич", "Технический директор", "sss@mail.ru", "89993333333", 90000, 38);
        personArray[3] = new Person("Васильев Василий Васильевич", "Экономический директор", "vvv@mail.ru", "89994444444", 90000, 36);
        personArray[4] = new Person("Коротков Михаил Владимирович", "Работник", "rab@mail.ru", "89991234567", 5000, 41);
        for (int i = 0; i < 5; i++){
            if (personArray[i].getAge()>40){
                personArray[i].info();
            }
        }
    }
}