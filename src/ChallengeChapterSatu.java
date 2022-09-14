import java.util.Scanner;

public class ChallengeChapterSatu {
    public static void main(String[] args) {
        calculatorConsole();
    }

    /**
     * Fungsi ini digunakan untuk menjalankan console, memanfaatkan perulangan while agar
     * dapat berjalan terus selama running masih bernilai true
     */
    private static void calculatorConsole() {
        // inisialisasi satu boolean untuk running console, variable pilihan untuk menampung input, scanner
        boolean consoleRunning = true;
        int pilihan;
        Scanner input = new Scanner(System.in);

        // running = true, artinya console terus menerus berjalan/berulang
        while (consoleRunning) {
            System.out.println("--------------------\n" +
                    "Kalulator Penghitung Luas dan Volum\n" +
                    "--------------------\n" +
                    "Menu\n" +
                    "1. Hitung Luas Bidang\n" +
                    "2. Hitung Volum\n" +
                    "0. Tutup Aplikasi\n" +
                    "--------------------"
            );

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("--------------------\n" +
                            "Pilih bidang yang akan dihitung\n" +
                            "--------------------\n" +
                            "1. persegi\n" +
                            "2. lingkaran\n" +
                            "3. segitiga\n" +
                            "4. persegi panjang\n" +
                            "0. kembali ke menu sebelumnya\n" +
                            "--------------------"
                    );
                    pilihan = input.nextInt();

                    if (pilihan == 1) {
                        System.out.println("\n\n-------------------\n" +
                                "Anda memilih persegi\n" +
                                "--------------------"
                        );
                        System.out.print("Masukkan panjang sisi persegi: ");
                        int sisi = input.nextInt();
                        System.out.println("\nProcessing ...\n" +
                                "Luas dari persegi adalah " +
                                luasPersegi(sisi) +
                                "\n--------------------\n" +
                                "tekan tombol enter untuk kembali ke menu utama\n"
                        );

                        input.nextLine();
                        String back = input.nextLine();
                    } else if (pilihan == 2) {
                        System.out.println("\n\n-------------------\n" +
                                "Anda memilih lingkaran\n" +
                                "--------------------"
                        );
                        System.out.print("Masukkan jari-jari lingkaran: ");
                        int jari = input.nextInt();
                        System.out.println("\nProcessing ...\n" +
                                "Luas dari lingkaran adalah " +
                                luasLingkaran(jari) +
                                "\n--------------------\n" +
                                "tekan tombol enter untuk kembali ke menu utama\n"
                        );
                        input.nextLine();
                        String back = input.nextLine();
                    } else if (pilihan == 3) {
                        System.out.println("\n\n-------------------\n" +
                                "Anda memilih segitiga\n" +
                                "--------------------"
                        );
                        System.out.print("Masukkan alas segitiga: ");
                        int alas = input.nextInt();
                        System.out.print("Masukkan tinggi segitiga: ");
                        int tinggi = input.nextInt();
                        System.out.println("\nProcessing ...\n" +
                                "Luas dari segitiga adalah " +
                                luasSegitiga(alas, tinggi) +
                                "\n--------------------\n" +
                                "tekan tombol enter untuk kembali ke menu utama\n"
                        );
                        input.nextLine();
                        String back = input.nextLine();
                    } else if (pilihan == 4) {
                        System.out.println("\n\n-------------------\n" +
                                "Anda memilih persegi panjang\n" +
                                "--------------------"
                        );
                        System.out.print("Masukkan panjang persegi panjang: ");
                        int panjang = input.nextInt();
                        System.out.print("Masukkan lebar persegi panjang: ");
                        int lebar = input.nextInt();
                        System.out.println("\nProcessing ...\n" +
                                "Luas dari persegi panjang adalah " +
                                luasPersegiPanjang(panjang, lebar) +
                                "\n--------------------\n" +
                                "tekan tombol enter untuk kembali ke menu utama\n"
                        );
                        input.nextLine();
                        String back = input.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("--------------------\n" +
                            "Pilih bangun yang akan dihitung\n" +
                            "--------------------\n" +
                            "1. kubus\n" +
                            "2. balok\n" +
                            "3. tabung\n" +
                            "0. kembali ke menu sebelumnya\n" +
                            "--------------------"
                    );

                    pilihan = input.nextInt();
                    if (pilihan == 1) {
                        System.out.println("\n-------------------\n" +
                                "Anda memilih kubus\n" +
                                "--------------------"
                        );
                        System.out.print("Masukkan panjang sisi kubus: ");
                        int sisi = input.nextInt();
                        System.out.println("\nProcessing ...\n" +
                                "Volum dari kubus adalah " +
                                volumKubus(sisi) +
                                "\n--------------------\n" +
                                "tekan tombol enter untuk kembali ke menu utama\n"
                        );
                        input.nextLine();
                        String back = input.nextLine();
                    } else if (pilihan == 2) {
                        System.out.println("\n-------------------\n" +
                                "Anda memilih balok\n" +
                                "--------------------"
                        );
                        System.out.print("Masukkan panjang balok: ");
                        int panjang = input.nextInt();
                        System.out.print("Masukkan lebar balok: ");
                        int lebar = input.nextInt();
                        System.out.print("Masukkan tinggi balok: ");
                        int tinggi = input.nextInt();

                        System.out.println("\nProcessing ...\n" +
                                "Volum dari balok adalah " +
                                volumBalok(panjang, lebar, tinggi) +
                                "\n--------------------\n" +
                                "tekan tombol enter untuk kembali ke menu utama\n"
                        );
                        input.nextLine();
                        String back = input.nextLine();
                    } else if (pilihan == 3) {
                        System.out.println("\n-------------------\n" +
                                "Anda memilih tabung\n" +
                                "--------------------"
                        );
                        System.out.print("Masukkan jari-jari tabung: ");
                        int jari = input.nextInt();
                        System.out.print("Masukkan tinggi tabung: ");
                        int tinggi = input.nextInt();
                        System.out.println("\nProcessing ...\n" +
                                "Volum dari tabung adalah " +
                                volumTabung(jari, tinggi) +
                                "\n--------------------\n" +
                                "tekan tombol enter untuk kembali ke menu utama\n"
                        );
                        input.nextLine();
                        String back = input.nextLine();
                    }
                    break;
                case 0:
                    // memberhentikan perulangan while, consoler berhenti
                    consoleRunning = false;
            }
        }
    }

    /**
     * Fungsi untuk menghitung luas dari sebuah persegi
     *
     * @param sisi parameter untuk input panjang sisi persegi
     * @return hasil perhitungan luas persegi
     */
    private static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    /**
     * Funsgi untuk menghitung luas dari sebuah persegi panjang
     *
     * @param panjang parameter untuk input panjang dari persegi panjang
     * @param lebar   parameter untuk input lebar dari persegi panjang
     * @return hasil perhitungan luas persegi panjang
     */
    private static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    /**
     * Fungsi untuk menghitung luas dari sebuah lingkaran
     *
     * @param jari parameter untuk input panjang jari-jari dari lingkaran
     * @return hasil perhitungan luas dari lingkaran
     */
    private static double luasLingkaran(double jari) {
        return 3.14 * jari * jari;
    }

    /**
     * Fungsi untuk menghitung luas dari sebuah segitiga
     *
     * @param alas   parameter untuk input alas segitiga
     * @param tinggi parameter untuk input tinggi segitiga
     * @return hasil perhitungan luas segitiga
     */
    private static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    /**
     * Fungsi untuk menghitung volume dari suatu kubus
     *
     * @param sisi parameter untuk input panjang sisi kubus
     * @return hasil perhitungan volume kubus
     */
    private static int volumKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    /**
     * Fungsi untuk menghitung volume dari suatu balok
     *
     * @param panjang parameter untuk input panjang balok
     * @param lebar   parameter untuk input lebar balok
     * @param tinggi  parameter untuk input tinggi balok
     * @return hasil perhitungan volume balok
     */
    private static int volumBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    /**
     * Fungsi untuk menghitung volume dari seuatu tabung
     *
     * @param jari   parameter untuk input panjang jari-jari tabung
     * @param tinggi parameter untuk input tinggi tabung
     * @return hasil perhitungan volume tabung
     */
    private static double volumTabung(double jari, double tinggi) {
        return 3.14 * jari * jari * tinggi;
    }
}
