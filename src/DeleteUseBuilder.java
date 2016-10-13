public class DeleteUseBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("1k34al6ued12pi75m879");
        System.out.println("string = " + str);

        str.delete(4, 10);
        System.out.println("After deletion :" + str);
    }
}
