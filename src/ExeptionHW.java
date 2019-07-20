
public class ExeptionHW {


    private static Object [][] ArrayAdd(int i, int i1) throws MyArraySizeException{
        if (i!=4 || i1!=4){
            throw new MyArraySizeException("Указан неправильный размер массива. Размер массива должен быть 4х4!");
        }
        return new Object[][] {{1,2,3,4},{1,2,3,'$'}};
    }

    public static void main(String[] args) {
      Object [][] array;
      int sum = 0;

        try {
            array = ArrayAdd (4, 4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                try {
                     sum += (int) array [i][j];
                } catch (RuntimeException e) {
                    try {
                        throw new MyArrayDataException("в ячейке ["+ i +"] , ["+ j +"] лежат неверные данные");
                    } catch (RuntimeException e1){
                        e1.printStackTrace();
                    } catch (MyArrayDataException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            System.out.println("Сумма массива = " + sum);
        }
    }

