package staff;

public class Consultant extends Personal {

    public Consultant(String name, String position) {
        super(name, position);
    }

    public void getCountCredit() {       //Операции для ДЗ 5. 09.02.2022
        int Credit = 1500;
        int Perceint = 10;
        int Payment = (Credit*100)/Perceint;
        System.out.println("Полная стоимость кредита будет " + Payment);
    }

    public void getInfoAboutCredit() {//Получить рекомендацию по подходящему кредиту
        System.out.println("По вашим исходным данным вам подойдёт вот такой кредит");
    }

    @Override
    public void greetingClient() {

    }

    {
        System.out.println("Добрый день! Меня зовут " + getName() + ". Я " + getPosition());
    }
}
