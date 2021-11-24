package seven;

public enum Gender {
    FEMALE ( "Zenski rod", "Njezniji rod"),
    MALE ( "Muski rod", "Grublji rod"),
    UNKNOWN ( " Nepoznato", "Nepoznato")
    ;

    private String name;
    private String description;

    private  Gender(String n, String d){
        this.name = n;
        this.description = d;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
