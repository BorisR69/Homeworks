package ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_2;
import ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_2.Candidat.Candidate;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main (String[] Args) {
        Set<Candidate> candidatesList = new TreeSet<>();
        fillCandidateList(candidatesList);
        printCandidate(candidatesList);
    }

    public static void  fillCandidateList(Set <Candidate> candidatesList) {
        candidatesList.add(new Candidate("Петров Иван Васильевич", "М", "24", 4, 5));
        candidatesList.add(new Candidate("Иванов Семен Иванович", "М", "42", 4, 4));
        candidatesList.add(new Candidate("Швецова Ирина Александровна", "Ж", "28", 3, 4));
        candidatesList.add(new Candidate("Дроздов Сергей Васильевич", "М", "32", 4, 4));
        candidatesList.add(new Candidate("Дроганов Игорь Алексеевич", "М", "58", 5, 5));
        candidatesList.add(new Candidate("Дроганов Игорь Алексеевич", "М", "20", 5, 4));
        candidatesList.add(new Candidate("Чуднов Самсон Георгиевич", "М", "34", 3, 3));
        candidatesList.add(new Candidate("Петридис Янис Георгиевич", "М", "38", 3, 3));
        candidatesList.add(new Candidate("Попандопуло Иван Иванович", "М", "48", 4, 5));
        candidatesList.add(new Candidate("Элефтериади Янис Георгиевич", "М", "24", 4, 3));
        candidatesList.add(new Candidate("Плахотин Иван Васильевич", "М", "44", 4, 2));
        candidatesList.add(new Candidate("Дружбин Дмитрий Васильевич", "М", "58", 5, 3));
    }

    public static void printCandidate(Set <Candidate> candidatesList) {
        System.out.println("ФИО, Релевантность резюме, Оценка на собеседовании");
        candidatesList.forEach(System.out::println);
    }
}
