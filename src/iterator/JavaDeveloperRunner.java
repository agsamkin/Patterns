package iterator;


public class JavaDeveloperRunner {

    public static void main(String[] args) {

        Collection developer = new JavaDeveloper("Alexey", new String[]{"1C", "Java", "Spring"});
        Iterator<String> iterator = developer.getIterator();
        while (iterator.hasNext()) {
            String skill = iterator.next();
            System.out.println(skill);
        }

    }

}
