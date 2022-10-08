package homework1;

public class Homework1 {
    public static void main(String[] args) {
        Author somebody = new Author("Somebody", "Somebodiev");
        Author whoIsTherov = new Author("Who is", "Therov");
        Author sonebody = new Author("Somebody", "Somebodiev");//сделал для проверки переопределенного метода equals
        Composition notInteresting = new Composition("Not Interesting", somebody, 2020);
        notInteresting.setYear(2021);
        Composition worseThanPrevious = new Composition("Worse than previous", whoIsTherov,2022);
        Composition warseThanPrevious = worseThanPrevious; // сделал для проверки переопределенного метода equals

        System.out.println("Имя творца шедевра под названием '"+notInteresting.getName()+"' - "
                + notInteresting.getAuthor().getFirstName() +" "+ notInteresting.getAuthor().getFamilyName()+"." +
                " Год издания - "+notInteresting.getYear()+".");
        System.out.println("Имя творца шедевра под названием '"+worseThanPrevious.getName()+"' - "
                +worseThanPrevious.getAuthor().getFirstName()+" "+worseThanPrevious.getAuthor().getFamilyName()+"." +
                " Год издания - "+worseThanPrevious.getYear()+".");
        System.out.println(notInteresting.toString());
        System.out.println(worseThanPrevious.toString());
        System.out.println(somebody.equals(whoIsTherov));
        System.out.println(sonebody.equals(somebody));
        System.out.println(notInteresting.equals(warseThanPrevious));
    }

}
