public class Utilsa {
    public Integer split(String text) {

        String[] arrOfbookingCount = text.split(" ");
        return Integer.parseInt(arrOfbookingCount[0]);
    }


}
