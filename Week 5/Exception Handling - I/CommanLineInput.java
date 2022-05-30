public class CommanLineInput {
    public static void main(String[] args) {
        int num, invalidcount=0, validcount=0;

        for (int i=0; i<args.length; i++){
            try{
            num = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e){
                invalidcount++;
                System.out.println("Invalid number at "+i+" "+ args[i]);
                // System.out.println(e);
            }
            validcount++;
            System.out.println("Number at  "+i+" : "+args[i]);
        }
        System.out.println("Invalid entries : "+invalidcount);
        System.out.println("Valid enteries : "+(validcount-invalidcount));

    }
}
