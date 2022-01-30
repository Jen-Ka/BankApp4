package staff;

public class Consultant extends Personal {

    public Consultant(String name, String position) {
        super(name, position);
    }

    public void giveMeInfoAboutCredit() {//Попросить рассказать о кредитных продуктах и подобрать подходящий
        System.out.println("Давайте подберём подходящий кредит?");
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
