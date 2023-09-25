package java8Lambda;

class EmployeeTree implements Comparable<EmployeeTree> {
    private String name;

    public EmployeeTree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(EmployeeTree other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
