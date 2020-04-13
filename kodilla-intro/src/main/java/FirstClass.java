public class FirstClass {

    public static void main(String[] args) {

        NoteBook notebook = new NoteBook(600, 2000, 2020);
        System.out.println("Weight of the notebook is " + notebook.weight + " grams."
                + "\nThe price of the notebook is " + notebook.price + "$"
                + "\nThe notebook was made in " + notebook.year + ".");
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        NoteBook heavyNoteBook = new NoteBook(2000, 1500, 2016);
        System.out.println("Weight of the notebook is " + heavyNoteBook.weight + " grams."
                + "\nThe price of the notebook is " + heavyNoteBook.price + "$"
                + "\nThe notebook was made in " + heavyNoteBook.year + ".");
        heavyNoteBook.checkWeight();
        heavyNoteBook.checkPrice();
        heavyNoteBook.checkYear();

        NoteBook oldNoteBook = new NoteBook(1500, 500, 2012);
        System.out.println("Weight of the notebook is " + oldNoteBook.weight + " grams."
                + "\nThe price of the notebook is " + oldNoteBook.price + "$"
                + "\nThe notebook was made in " + oldNoteBook.year + ".");
        oldNoteBook.checkWeight();
        oldNoteBook.checkPrice();
        oldNoteBook.checkYear();


    }

}
