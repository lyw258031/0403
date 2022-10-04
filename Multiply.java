public class Multiply {
    public static void multiplyMatrix(int x1[][],int x2[][]){
        //前提条件：第一个矩阵的列必须等于第二个矩阵的行
        if(x1[0].length!=x2.length){
            System.out.println("不满足相乘的条件");
            return;
        }
        int lineLength=x1.length;   //第一个矩阵的行
        int listLength=x2[0].length;//第二个矩阵的列
        int[][] multiply=new int[lineLength][listLength];//相乘的结果矩阵
        //乘法
        for(int i=0;i<lineLength;i++){
            for(int j=0;j<listLength;j++){
                for(int k=0;k<x1[0].length;k++){
                    multiply[i][j]+=x1[i][k]*x2[k][j];
                }
            }
        }
        System.out.println("相乘之后的结果为:");
        for(int i=0;i<multiply.length;i++){
            for(int j=0;j<multiply[0].length;j++){
                System.out.print(multiply[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] x1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] x2={{2,2,2},{1,1,1},{3,3,3}};
        multiplyMatrix(x1,x2);

    }
}


