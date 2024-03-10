package Java;

public class printingstring {
    public static void main(String[] args)
    {
        person alex = new person("alex");
        person mariam = alex;
        System.out.println(alex.name+"."+mariam.name);
        alex.name = "Alexander";
        System.out.println("After Changing");
        System.out.println(alex.name+""+mariam.name);
    }
    static class person
    {
        String name;
        person(String name)
        {
            this.name = name;
        }
    }
}
