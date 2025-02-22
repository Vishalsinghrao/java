public class Encrypt_grade {
    public static void main(String[] args) {
        // encrypt grade

        char grade = 'B';
        char encrypt = (char)(grade + 8);
        System.out.println(encrypt);

        // decrypt

        char decrypt = (char)(encrypt - 8);
        System.out.println(decrypt);
    }
}
