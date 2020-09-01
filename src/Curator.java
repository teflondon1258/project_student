public class Curator {
    public int answers;
    public boolean communication;
    public int welfare;
    public String languages;

    public Curator(int answers, boolean communication, int welfare, String languages) {
        this.answers = answers;
        this.communication = communication;
        this.welfare = welfare;
        this.languages = languages;
    }

    public int getAnswers() {
        return answers;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }

    public boolean isCommunication() {
        return communication;
    }

    public void setCommunication(boolean communication) {
        this.communication = communication;
    }

    public int getWelfare() {
        return welfare;
    }

    public void setWelfare(int welfare) {
        this.welfare = welfare;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
