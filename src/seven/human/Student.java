package seven.human;

import seven.Gender;

public class Student extends Person{
    private  int indexNumber;
    public  Student(){
        super();
        System.out.println("student...");
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}

