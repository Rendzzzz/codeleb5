import java.util.ArrayList;
import java.util.scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new scanner(System.in);
        String input;

        while (true);
            System.out.print("Masukkan nama mahasiswa (atau ketik 'selesai' untuk berhenti):");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai"));{
                break;
            }
            try {
                if (input.isEmpty()){
                    throw new IllegalArgumentException("Nama tidak boleh kosong!!");
                }
                names.add(input);
            }
            catch (IllegalArgumentException e){
                System.out.println("Error:" + e.getMessage());
            }
            System.out.println("\n Daftar nama mahasiswa:");
            for (int i = 0; i<names.size();i++){
                System.out.println("Nama ke-\" + (i + 1) + \": \" " +
                        ")+ mahasiswaList.get(i));\n" +
                        "        }\n" +
                        "\n" +
                        "        scanner.close();\n"
            }
    }
}
