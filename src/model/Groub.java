package model;

public class Groub {
    private long ID;
    private String name;
    private String description;
    private  int years;


    public Groub(long ID, String name, String description,int years) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.years= years;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID: " + ID +
                " name: " + name +
                " description: " + description+
                "years:"+years;
    }
}
