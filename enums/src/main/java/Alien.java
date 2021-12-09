public class Alien {
    private Gender gender = Gender.OTHER; // Default value
    private String name;

    public Alien(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }



    public void printGender() {
        switch (gender) {
            case FEMALE:
                System.out.println("Mein Geschlecht ist" + " " + gender);
                break;
            case MALE:
                System.out.println("Mein Geschlecht ist" + " " + gender);
                break;
            case OTHER:
                System.out.println("Mein geschlecht ist" + " " + gender);
                break;
            default:
                new IllegalAccessException("ERROR");
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
