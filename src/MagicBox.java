import java.util.Random;

public class MagicBox<T>  {

    private T[] item;

    public MagicBox (T[] item){
        this.item = item;
    }

    public boolean add(T item){
        boolean check = false;
        for (int i = 0; i < this.item.length; i++){
            if (this.item[i] == null){
                this.item[i] = item;
                check = true;
                break;
            }
        }
        return check;
    }

    public T pick (){
        Random random = new Random();
        int randomInt = random.nextInt(this.item.length - 1);
        if (this.check() == 0){
            return this.item[randomInt];
        } else {
            throw new RuntimeException("кол-во свободных ячеек: " + this.check());
        }

    }

    public int check(){
        int check = 0;
        for (int i = 0; i < this.item.length; i++){
            if (this.item[i] == null){
                check += 1;
            }
        }
        return check;
    }



    public String toString(){
        for (int i = 0; i < this.item.length; i++){
            System.out.println(this.item[i]);
        }
        return "";
    }
}
