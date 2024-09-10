public class library {
        String name;
        String author
        int price;
        public void get()
        {
            Scanner sc=new Scanner(System.in);
            System.out println("Enter Book name");
            name=sc.next;
            System.out println("Enter Book author name");
            name=sc.next;
            System.out println("Enter Book price");
            name=sc.nextInt;
        }
        public void disp()
        {
            System.out.println("Book name"+name);
            System.out.println("Book Author name"+author);
            System.out.println("Book price"+price);
        }
        public static void main(String args[])
        {
            items i1=new items();
            i1.get();
            i1.disp();
            i1.get();
            i1.disp();
            i1.get();
            i1.disp();
        }
}
