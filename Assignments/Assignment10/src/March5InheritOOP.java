public class March5InheritOOP {

    public static void main(String[] args) {

        Politician [] people = new Politician[10];

 /*       for (int i = 0; i < 1; i++) {

            people[i] = Politician.makePolitician();
            System.out.println(people[i]);

        }*/
/*

        Person myPerson = new Person("Dennis Trump");
        System.out.println(myPerson);

        Person newPerson;
        newPerson = Person.makePerson();
        System.out.println(newPerson);
*/

        //myPerson = Politician.makePolitician();

        Person fred = new Politician("Fred", true, 'd');
        System.out.println(fred);
    }

}

