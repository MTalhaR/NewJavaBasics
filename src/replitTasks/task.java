package replitTasks;

public class task {
    String censorLetter(String a, char b) {
        System.out.println(a + "," + b);
        String newLetter;
        newLetter = a.replace(b, '*');
        newLetter=a.replace(b,'*');
        return newLetter;

    }

    public static void main(String[] args) {
        task replace = new task();
        String newRep = replace.censorLetter("computer science", 'e');
        String newRep1=replace.censorLetter("trick or treat", 't');
        System.out.println(newRep);
        System.out.println(newRep1);
    }
}
