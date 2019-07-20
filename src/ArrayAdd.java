public class ArrayAdd extends ExeptionHW {

    private static Object [][] ArrayAdd(int i, int i1) throws MyArraySizeException{
        if (i!=4 || i1!=4){
            throw new MyArraySizeException("Указан неправильный размер массива. Размер массива должен быть 4х4!");
        }
        return new Object[][] {{1,2,3,4},{1,2,3,'$'}};
    }
}
