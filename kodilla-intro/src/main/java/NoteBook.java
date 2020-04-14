public class NoteBook {

    int weight;
    int price;
    int year;

    public NoteBook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkWeight() {
        if(this.weight <= 1000) {
            System.out.println("This notebook is very light");
        } else if(this.weight > 1000 && this.weight <= 1999) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkPrice() {
        if(this.price <= 1000) {
            System.out.println("This notebook is cheap");
        } else if(this.price > 1000 && this.price <= 1999) {
            System.out.println("This notebook is not very expensive");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkYear() {
        if(this.year >= 2019) {
            System.out.println("This notebook is new");
        } else if(this.year < 2019 && this.year > 2012) {
            System.out.println("This notebook is not too old");
        } else {
            System.out.println("This note book is very old");
        }
    }

}