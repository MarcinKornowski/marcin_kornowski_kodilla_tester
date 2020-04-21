public class UserM {

    public static void main(String[] args) {

        User user1 = new User("Tom", 20);
        User user2 = new User("Ann", 25);
        User user3 = new User("Bob", 30);
        User user4 = new User("Mark", 35);
        User user5 = new User("John", 40);

        User[] users = {user1, user2, user3, user4, user5};

        /*String user1Name = users[0].getName();
        int user1Age = users[0].getAge();

        System.out.println(user1Name);
        System.out.println(user1Age);*/

        int result = 0;
        for(int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();
        }

        int average;
        average = result / users.length;
        System.out.println("The average age of the users is " + average);

        for(int i = 0; i < users.length; i++) {
            if(users[i].getAge() < average) {
                System.out.println("Name of the user younger than average is " + users[i].getName());
            }
        }

    }


}
