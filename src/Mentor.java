public class Mentor extends Person implements Staff {
    public boolean assignments;
    public int meetings;
    public String encouragements;
    public String usefulinformations;
    public String languages;


    public Mentor(boolean assignments, int meetings, String encouragements, String usefulinformations, String languages) {
        this.assignments = assignments;
        this.meetings = meetings;
        this.encouragements = encouragements;
        this.usefulinformations = usefulinformations;
        this.languages = languages;
    }

    public boolean isAssignments() {
        return assignments;
    }

    public void setAssignments(boolean assignments) {
        this.assignments = assignments;
    }

    public int getMeetings() {
        return meetings;
    }

    public void setMeetings(int meetings) {
        this.meetings = meetings;
    }

    public String getEncouragements() {
        return encouragements;
    }

    public void setEncouragements(String encouragements) {
        this.encouragements = encouragements;
    }

    public String getUsefulinformations() {
        return usefulinformations;
    }

    public void setUsefulinformations(String usefulinformations) {
        this.usefulinformations = usefulinformations;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }


    @Override
    public void helpStudent() {

    }

    @Override
    public void giveAdditionalMaterial() {

    }
}
