public enum GenreType {
    THRILLER("Spooky"),
    COMEDY("Funny"),
    DRAMA("Intriguing");

    private final String description;
    GenreType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
