package homework1;

public class Homework1 {
    public static void main(String[] args) {
        Author somebody = new Author("Somebody", "Somebodiev");
        Author whoIsTherov = new Author("Who is", "Therov");
        Composition notInteresting = new Composition("Not Interesting", somebody, 2020);
        notInteresting.setYear(2021);
        Composition worseThanPrevious = new Composition("Worse than previous", whoIsTherov,2022);
        System.out.println("Имя творца шедевра под названием '"+notInteresting.getName()+"' - "
                + notInteresting.author.getFirstName() +" "+ notInteresting.author.getFamilyName()+"." +
                " Год издания - "+notInteresting.getYear()+".");
        System.out.println("Имя творца шедевра под названием '"+worseThanPrevious.getName()+"' - "
                +worseThanPrevious.author.getFirstName()+" "+worseThanPrevious.author.getFamilyName()+"." +
                " Год издания - "+worseThanPrevious.getYear()+".");
    }
}
