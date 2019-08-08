public class ProjectTest{
    public static void main(String[] args) {
        Project x = new Project();
        Project y = new Project("elevator");
        Project z = new Project("slippers", 39.99);
        Project aa = new Project("pants", "they are denim");
        Project ab = new Project("shoes", "blue suede", 59.98);
        System.out.println(y.repr());
        System.out.println(z.repr());
        System.out.println(aa.repr());
        System.out.println(ab.repr());
        x.setName("helicopter");
        x.setDescription("whirly bird");
        x.setInitialCost(49999.90);
        System.out.println(x.repr());
        System.out.println(x.getName() + x.getDescription() + x.getInitialCost());

    }
}