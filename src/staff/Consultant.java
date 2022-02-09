package staff;

public class Consultant extends Personal {

    public Consultant(String name, String position) {
        super(name, position);
    }

    public void getCountCredit() {       //Операции для ДЗ 5. 09.02.2022
        int credit = 1500;
        int perceint = 10;
        int fullcoast = (credit*100)/perceint;
        int srok = 12;
        double payment = credit/srok;
        System.out.println("Полная стоимость кредита будет " + fullcoast);
        System.out.println("Ежемесячный платёж составит " + payment);
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
