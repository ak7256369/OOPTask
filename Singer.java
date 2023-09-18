package week3task2;

public class Singer {
    String Name;
    String Gender;
    String Nationality;
    int debutYear;

    public Singer(String name, String gender, String nationality, int debutYear) {
        this.Name = name;
        this.Gender = gender;
        this.Nationality = nationality;
        this.debutYear = debutYear;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }
    public String toString() {

        return String.format("Name: %s%nGender: %s%nNationality: %s%nDebut Year: %s",
                Name, Gender, Nationality, debutYear);
    }
}
