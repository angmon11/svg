import java.nio.file.Path;

public class Main {
    public static void main(String[] args){
        DeathCauseStatisticList statistics = DeathCauseStatisticList
                .fromCsv(Path.of("deaths/zgony.csv"));
        int age = 60;
        ICDCodeTabular icd = new ICDCodeTabularOptimizedForMemory(Path.of("deaths/icd10.txt"));
        statistics.mostDeadlyDiseases(age,10).stream()
                .forEach(stat -> System.out.println(
                        stat.getCode() + "\t" + stat.getAge(age).deathCount()
                        + " "+icd.getDescription(stat.getCode())
                ));

    }
}