import java.util.*;

public class Main {
    public static void main(String[] args) {

        // create by this team
        //Muhamad Omer
        //Payam Muhamad
        //Muhamad Osman
        //Rawezh Lwqman
        //Aram Rasul

        /*

        lakaty remove krdny nrxekda size arrayakaman kam dakat
        balam atwanret haman size bet la jey labrawaka null man  bate

        */



        DynamicArray<Object> dclass = new DynamicArray<Object>();
        Scanner input = new Scanner(System.in);
        System.out.println("your current array is [null]");
        try {

        while (true){
            System.out.println("\n######################################");
            System.out.println("P- print\nA- add\nri- remove_index\nre- remove_elment\nq- quit");
            System.out.print("Enter your Options :");
            Object option = input.next();
            System.out.println("\n######################################");

            if (option.equals("P") || option.equals("p")){
                dclass.print();
            }
            else if (option.equals("A") || option.equals("a")){
                System.out.print("Enter the value :");
                Object value = input.next();
                dclass.add(value);
            }
            else if (option.equals("ri") || option.equals("Ri")){
                System.out.print("Enter the index :");
                int value = input.nextInt();
                try
                {
                dclass.delete_index(value);
                }catch (Exception ecp){
                    System.out.println("invalid Index !!!");
                }
            }
            else if (option.equals("q") || option.equals("Q")){
                System.out.println("good bye");
                break;
            }
            else if ((option.equals("re") || option.equals("Re"))){
                System.out.print("Enter the element :");
                Object value = input.next();
                try
                {
                    dclass.delete_by_elment(value);
                }catch (Exception ecp){
                    System.out.println("dosn't have");
                }
            }
            else { System.out.println("invalid options !!");}
           }
        }
        catch (Exception exp){
            System.out.println(exp);
        }
    }
}
class DynamicArray <t>{
    int size ;
    Object[] data;

    public DynamicArray(){
        size = 0 ;
        data = new Object[1];
    }

    public void delete_index(int index){
        int c = 0 ;
        Object[] new_array = new Object[data.length-1];
        for (int i = 0; i < data.length; i++) {
            if (i != index){
                new_array[c] = data[i] ;
                c++ ;
            }
        }System.out.println(Arrays.toString(new_array));
        data = Arrays.copyOf(new_array,new_array.length);
    }
    public void delete_by_elment(Object elment){
        int c = 0 ;
        Object[] new_array = new Object[data.length-1];
        for (int i = 0; i < data.length; i++) {
            if (!data[i].equals(elment)){
                new_array[c] = data[i];
                c++ ;
            }

        }
        System.out.println(Arrays.toString(new_array));
        data = Arrays.copyOf(new_array,new_array.length);
    }
    public void add( t value){
        array_can_take(size+1);
        data[size++] = value ;
    }
    public void print(){
        System.out.println("size of array = " +size);
        System.out.println("length of array = "+data.length);
        System.out.println(Arrays.toString(data));
    }
    public void array_can_take(int size){
        int oldlenth = data.length;
        if (size > oldlenth){
            int newlength = oldlenth+1 ;
            if (size > newlength)
                newlength = size;

        data = Arrays.copyOf(data , newlength);
        }
    }
}