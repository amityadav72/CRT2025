package CRT2025.OOPS.inheritance.HeirachicaliInheritence;

public class Brother extends Parent {
    String brotherName;

    public Brother(String parentName, String brotherName) {
        super(parentName);
        this.brotherName = brotherName;
    }

    public String getBrotherName() {
        return brotherName;
    }

    public void setBrotherName(String brotherName) {
        this.brotherName = brotherName;
    }
}
