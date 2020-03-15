public abstract class Entity implements Entityable{
    public String name;
    public Entity(String n) throws NoNameException {
        if (n=="" || n == null) throw new NoNameException("Создан персонаж без имени.");
        name = n;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() != this.hashCode() ? false : true;
    }

    public String setAction(String act) {
        return this.getName() + " " +act;
    }

}

