public class MyList {
    private int[] items;
    private int count;
    private boolean isEmpty = false;
    private int length;

    public MyList(int length) {
        this.length = length;
        items = new int[length];
    }

    public int[] print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
        return items;
    }

    public int count() {
        return count;
    }

    public boolean isEmpty() {
        if (count > 0) return isEmpty;
        return !isEmpty;
    }

    public void insert(int item) {
        //if arrray is full resize it\
        if(items.length == count){
            //cretae a new array
            int[] newArray = new int[count*2];
            //copy all thats in the first array into te second array
            for (int i = 0; i < items.length; i++) {
                newArray[i] = items[i];
            }
            //set items equal to newarray
            items = newArray;
        }
        //Add the new item at theend of the list
        items[count++] = item;
    }

    public int capacity() {
        return items.length;
    }

    public void removeAt(int index) {
        //valideate that indx exist
        if (index <= 0 || index >= count) throw new IllegalArgumentException();
        //shift items to fillthe hole
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }
}
