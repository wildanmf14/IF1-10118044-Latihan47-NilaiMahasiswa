
public class Main {

	public static void main(String[] args) {
		Nilai nilai = new Nilai();
        nilai.setQuiz(60);
        nilai.setUts(80);
        nilai.setUas(75);

        System.out.printf("QUIZ \t\t= %.1f%n", nilai.getQuiz());
        System.out.printf("UTS \t\t= %.1f%n", nilai.getUts());
        System.out.printf("UAS \t\t= %.1f%n%n", nilai.getUas());
        System.out.printf("Nilai Akhir \t= %.1f%n%n", nilai.nilaiAkhir());
        System.out.printf("Index \t\t= %c%n", nilai.index());
        System.out.printf("Keterangan\t= %s%n", nilai.Keterangan());

	}

}
