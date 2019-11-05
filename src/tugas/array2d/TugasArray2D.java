package tugas.array2d;
public class TugasArray2D {
    public static void main(String[] args) {
        int [][] Dinda = {{2 ,4 ,6 ,8 },{3 ,9 ,27,30},{4 ,16,20,24},{15,25,35,45}};
        System.out.println("+---------------+---------------+---------------+---------------+");
        for (int i=0; i<Dinda.length; i++){
            for (int j=0; j<Dinda[i].length;j++){
            System.out.print("| \t" +Dinda[i][j]+"\t");
            }
            System.out.print("| \t");
            System.out.println();
            System.out.println("+---------------+---------------+---------------+---------------+");
        }
    }
    
}
