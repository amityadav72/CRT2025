package CRT2025.OOPS.inheritance.HeirachicaliInheritence;

public class Sister extends Parent {
    String sisterName;

    public Sister(String parentName, String sisterName) {
        super(parentName);
        this.sisterName = sisterName;
    }

    public String getSisterName() {
        return sisterName;
    }

    public void setSisterName(String sisterName) {
        this.sisterName = sisterName;
    }
}
