package schritt3;

public abstract class Person {

    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    //getter

    public String getName() {
        return name;
    }


    public int getAlter() {
        return alter;
    }

    //setter


    public void setName(String name) {

        this.name = name;
    }

    public void setAlter(int alter) {

        this.alter = alter;
    }

    @Override
    public String toString() {
        String text = "Name = " + name;
        text += "\n\tAlter = " + alter;
        return text;
    }
}




