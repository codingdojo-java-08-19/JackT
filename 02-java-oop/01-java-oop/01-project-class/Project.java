public class Project{
    private String name;
    private String description;
    private Double initialCost;

    public Project() {}
    public Project(String name) {
        this.name = name;
    }
    public Project(String name,String description) {
        this.name = name;
        this.description = description;
    }
    public Project(String name, Double cost) {
        this.name = name;
        this.initialCost = cost;
    }
    public Project(String name,String description, Double cost) {
        this.name = name;
        this.description = description;
        this.initialCost = cost;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public Double getInitialCost() {
        return this.initialCost;
    }
    public void setInitialCost(Double cost){
        this.initialCost=cost;
    }
    public String repr(){
        return (this.name +"("+this.initialCost+")"+ ": " + this.description);
    }
}