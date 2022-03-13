package ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_2.Candidat;

public class Candidate implements Comparable <Candidate> {
    private String fioCandidate;
    private String sex;
    private String age;
    private Integer relevance;
    private Integer rating;

    public Candidate(String fioCandidate, String sex, String age, Integer relevance, Integer rating) {
        this.fioCandidate = fioCandidate;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "- " + fioCandidate + ",\t" + relevance + ",\t" + rating;
    }

    public String getFioCandidate() {
        return fioCandidate;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public Integer getRating() {
        return rating;
    }

    @Override
    public int compareTo(Candidate o) {
        if (fioCandidate.equals(o.getFioCandidate())) return 0;
        int sorting = o.getRelevance().compareTo(relevance);
        if (sorting == 0) sorting = o.getRating().compareTo(rating);
        if (sorting == 0) sorting = o.getFioCandidate().compareTo(fioCandidate);
        return sorting;
    }
}
