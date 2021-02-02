package lesson01.HomeWork;

public class Team {
    private String name;
    private Competitor[] competitors;
    private StringBuilder results;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
        this.results = new StringBuilder();
    }

    public void setResult(String result) {
        results.append(result).append("\n");
    }

    public String getName() {
        return name;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println("Результаты команды: " + name);
        System.out.println("------------------------");
        System.out.print(results);
    }
}

