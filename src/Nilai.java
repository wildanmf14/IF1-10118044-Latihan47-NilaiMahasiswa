
public class Nilai {
	private double quiz;
    private double uts;
    private double uas;
    private double NA;
    private char index;
    private String keterangan;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double nilaiAkhir() {
        NA = 10 * ((0.02 * quiz) + (0.03 * uts) + (0.05 * uas));
        return NA;
    }

    public char index() {
        if ((NA >= 0) && (NA <= 45)) {
            index = 'E';
        } else if ((NA > 45) && (NA <= 56)) {
            index = 'D';
        } else if ((NA > 56) && (NA <= 68)) {
            index = 'C';
        } else if ((NA > 68) && (NA <= 80)) {
            index = 'B';
        } else {
            index = 'A';
        }
        return index;

    }

    public String Keterangan() {

        switch (index) {
            case 'A':
                keterangan = "Sangat Baik";
                break;
            case 'B':
                keterangan = "Baik";
                break;
            case 'C':
                keterangan = "Cukup";
                break;
            case 'D':
                keterangan = "Kurang";
            default:
                keterangan = "Sangat Kurang";
                break;
        }

        return keterangan;

    }

}
