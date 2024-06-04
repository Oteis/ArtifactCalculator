
public class Artefacto {
    int nivel;
    String mainStat;
    StatArtefacto Substat1;
    StatArtefacto Substat2;
    StatArtefacto Substat3;
    StatArtefacto Substat4;

    public Artefacto(int nivel, String mainStat, StatArtefacto Substat1, StatArtefacto Substat2, StatArtefacto Substat3,
            StatArtefacto Substat4) {
        this.nivel = nivel;
        this.mainStat = mainStat;
        this.Substat1 = Substat1;
        this.Substat2 = Substat2;
        this.Substat3 = Substat3;
        this.Substat4 = Substat4;
    }
}