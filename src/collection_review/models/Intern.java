package collection_review.models;

public class Intern extends Candidate {
    private String major;
    private int  semester;
    private String universityName;


    public Intern(int candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, String major, int semester, String universityName) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "candidateID=" + getCandidateID() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthDate=" + getBirthDate() +
                ", address='" + getAddress() + '\'' +
                ", phone=" + getPhone() +
                ", email='" + getEmail() + '\'' +
                ", candidateType=" + getCandidateType() +
                "major='" + major + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
