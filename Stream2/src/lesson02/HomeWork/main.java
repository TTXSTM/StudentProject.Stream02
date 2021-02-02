package lesson02.HomeWork;

public class main {

    public void main(String[] args) {
        String[][] x4 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"} };
        try {
            int result = method(x4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Размер массива привышен!");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Значение массива неправилно!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j );
        }

    }


    public int method(String[][] x4) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if(x4.length != 4){
            throw new MyArraySizeException();
        }
        for(int i = 0; i < x4.length; i++){

            if (x4[i].length != 4){
                throw new MyArraySizeException();
            }
            for(int j = 0; j < x4.length; j++){
                try {
                    count = count + Integer.parseInt(x4[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }

            }




        }

        return count;
    }
}

