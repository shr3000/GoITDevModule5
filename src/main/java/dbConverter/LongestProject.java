package dbConverter;

public class LongestProject {
    private String name;
    private int monthCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    @Override
    public String toString() {
        return "LongestProject :" + "name" + name + ", " + "monthCount" + monthCount;
    }
}
