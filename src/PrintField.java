public class PrintField {
    public int data = 25;
    public String printData(){
        String updateData = String.format("\"---<%d>---\"%n", data);
        System.out.println(updateData);
        return updateData;
    }
}