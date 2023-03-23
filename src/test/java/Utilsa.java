import java.util.Random;



public class Utilsa {
    public Integer split(String text) {

        String[] arrOfbookingCount = text.split(" ");
        return Integer.parseInt(arrOfbookingCount[0]);
    }

    public String randomizer() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 7;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomName = sb.toString();
        return randomName;

    }
}