package grailtest


class User {
    private String name;
    //private int id;

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }
    static constraints = {
    }
}
